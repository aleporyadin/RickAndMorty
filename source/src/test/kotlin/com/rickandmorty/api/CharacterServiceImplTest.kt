package com.rickandmorty.api

import com.rickandmorty.api.entity.Character
import com.rickandmorty.api.service.CharacterServiceImpl
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith



@ExtendWith(MockKExtension::class)

class CharacterServiceImplTest {


    @MockK(relaxUnitFun = true)
    private  var characterService: CharacterServiceImpl = mockk()

    @Before
    fun setUp() { MockKAnnotations.init(this, relaxUnitFun = true) }

    @Test
    fun `Try save character (Test saveCharacter ) `(){

        val testCharacter =spyk( Character(99,"testName","testStatus","testSpecial","testType","testGender"))
        every{characterService.saveCharacter(testCharacter)} returns testCharacter
        every { characterService.getCharacterById(99) } returns  testCharacter
        Assert.assertEquals(characterService.getCharacterById(99),testCharacter)

        verify {  characterService.getCharacterById(99) }
        verify {  characterService.saveCharacter(testCharacter) }

    }

    @Test
    fun `Try save character (Test saveCharacters ) `(){
        Assert.assertNotNull(characterService)

        val testCharacter : MutableList<Character> =  mutableListOf (
            Character(5, "testName", "testStatus", "testSpecial", "testType", "testGender") ,
            Character(7, "testName2", "testStatus2", "testSpecial2", "testType2", "testGender2"),
            Character(11, "testName3", "testStatus3", "testSpecial3", "testType3", "testGender3")

        )
        characterService.saveCharacters(testCharacter)
        val characters =characterService.getCharacters()
        for(hero in characters){
            if (hero in characters){
                continue
            }else{
                AssertionError()
            }
        }
    }

    @Test
    fun `Try delete character (Test deleteCharacter ) `(){
        Assert.assertNotNull(characterService)
        val testCharacter = Character(99,"testName","testStatus","testSpecial","testType","testGender")


        characterService.saveCharacter(testCharacter)
        try {
            characterService.deleteCharacter(98)
            val character = characterService.getCharacterById(99)
            if( character != null) AssertionError()

        }catch (e: Exception){

        }


    }
}