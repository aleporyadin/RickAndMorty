package com.rickandmorty.api.controller

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.rickandmorty.api.entity.Character
import com.rickandmorty.api.service.CharacterService
import kotlinx.serialization.json.*
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate


@RestController
@RequestMapping("characters")
@CrossOrigin(origins = ["*"], allowedHeaders = ["*"])
class CharacterController(
    val repositoryService: CharacterService
) {

    @GetMapping
    fun characterJson(): MutableIterable<Character> {
        return repositoryService.getCharacters()
    }

    @PostMapping
    fun saveCharacters(): ResponseEntity<String> {
        val restTemplate = RestTemplate()
        val mapper = jacksonObjectMapper()

        val response = restTemplate.getForEntity(CHARACTER_URL, String::class.java)

        val resultsArray=
            Json.parseToJsonElement(response.body.toString()).jsonObject["results"].toString()

        val listCar: List<Character> = mapper.readValue(resultsArray)

        repositoryService.saveCharacters(listCar)
        return ResponseEntity.ok("Characters saves")
    }

    @PutMapping
    fun updateCharacter(@RequestBody character : Character): ResponseEntity<String> {
        if (character.id == (repositoryService.getCharacterById(character.id).get().id)) {
            repositoryService.updateCharacter(character)
            return ResponseEntity.ok("Updated character")
        }
        return ResponseEntity.badRequest().body("Character not found ")
    }


    companion object {
        const val CHARACTER_URL="https://rickandmortyapi.com/api/character"
    }
}


