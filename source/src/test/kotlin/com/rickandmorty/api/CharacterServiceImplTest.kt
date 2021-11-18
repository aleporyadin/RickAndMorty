package com.rickandmorty.api

import com.rickandmorty.api.entity.Character
import com.rickandmorty.api.repository.CharacterRepository
import com.rickandmorty.api.service.CharacterServiceImpl
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc


@RunWith(MockitoJUnitRunner::class)
@AutoConfigureMockMvc
class CharacterServiceImplTest {


    @InjectMocks
    private lateinit var characterService: CharacterServiceImpl



    @Test
    fun `Try save character (Test saveCharacter ) `(){
        val testCharacter = Character(99,"testName","testStatus","testSpecial","testType","testGender")
        characterService.saveCharacter(testCharacter)
        if(characterService.getCharacterById(99) != testCharacter){
            AssertionError()
        }
    }

}