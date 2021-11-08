package com.rickandmorty.api.service
import com.rickandmorty.api.entity.Character
import org.springframework.stereotype.Service

@Service
interface CharacterService {

    fun addCharacter(character: Character): Character
    fun saveCharacters(characters: MutableList<Character>)
    fun deleteCharacter(id: Int)
    fun deleteAllCharacter()
    fun getCharacterById(id: Int): Character?
    fun getCharacters(): MutableIterable<Character>?
    fun getCharacterByFirstName(name: String): List<Character>
    fun updateCharacter(character: Character)
}
