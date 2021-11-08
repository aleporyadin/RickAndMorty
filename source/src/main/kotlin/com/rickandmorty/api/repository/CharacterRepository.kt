package com.rickandmorty.api.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import com.rickandmorty.api.entity.Character

@Repository
interface CharacterRepository: CrudRepository<Character,  Int>{
    fun findByName(name: String): MutableList<Character>
    override fun deleteById(id: Int)
}
