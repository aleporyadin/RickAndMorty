package com.rickandmorty.api.controller

import com.rickandmorty.api.entity.Character
import com.rickandmorty.api.service.CharacterServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import java.net.URL
import kotlinx.serialization.json.*
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class CharacterController {

    @Autowired
    lateinit var repositoryService: CharacterServiceImpl

    @RequestMapping(method = [RequestMethod.GET], value = ["/characters"])
    fun characterJson(): MutableIterable<Character> {
        return repositoryService.getCharacters()
    }

    @RequestMapping(method = [RequestMethod.POST], value = ["/characters"])
    fun saveCharacters() {
        val CHARACTERAPI_URL="https://rickandmortyapi.com/api/character"
        val resultsArray=
            Json.parseToJsonElement(URL(CHARACTERAPI_URL).readText().replace("\\","").trimIndent()).jsonObject["results"]

        val characterList = parseJsonToObject(resultsArray)
        repositoryService.saveCharacters(characterList)
    }

    private fun parseJsonToObject(resultsArray: JsonElement?): MutableList<Character> {
        val heroList = mutableListOf<Character>()

        if (resultsArray != null) {
            var i=0
            while (resultsArray.jsonArray.size>i) {
                val obj = resultsArray.jsonArray[i]
                heroList.add(
                    Character(
                        obj.jsonObject["id"]?.jsonPrimitive?.int,
                        obj.jsonObject["name"].toString().replace("\"", ""),
                        obj.jsonObject["status"].toString().replace("\"", ""),
                        obj.jsonObject["species"].toString().replace("\"", ""),
                        obj.jsonObject["type"].toString().replace("\"", ""),
                        obj.jsonObject["gender"].toString().replace("\"", "")
                    )
                )
                i++
            }
        }
        return  heroList
    }

}


