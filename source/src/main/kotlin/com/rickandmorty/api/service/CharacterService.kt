package com.rickandmorty.api.service

import com.rickandmorty.api.entity.Character
import com.rickandmorty.api.repository.CharacterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*


@Service
class CharacterService(
    var repository: CharacterRepository

) {
    fun saveCharacter(character: Character): Character {
        return repository.save(character)
    }

    fun saveCharacters(characters: List<Character>) {
        for( hero in characters){
            repository.save(hero)
        }
    }

    fun deleteCharacter(id: Int) {
        repository.deleteById(id)
    }

    fun deleteAllCharacter() {
        repository.deleteAll()
    }

    fun getCharacterById(id: Int): Optional<Character> {
        return repository.findById(id)
    }

    fun getCharacters(): MutableList<Character> {
        return repository.findAll() as MutableList<Character>
    }

    fun getCharacterByFirstName(name: String) = repository.findByName(name)

    fun updateCharacter( character: Character) {
        repository.save(character)
    }

}