package com.rickandmorty.api

import com.rickandmorty.api.controller.CharacterController
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.runner.RunWith
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import com.rickandmorty.api.entity.Character
import org.springframework.http.ResponseEntity


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CharacterControllerTest() {

    @Autowired
    val mockMvc: MockMvc?=null

    @Autowired
    lateinit var characterController: CharacterController

    @Test
    fun `Check list characters (Test method charactersJson)`() {
        this.mockMvc!!.perform(get("/characters").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(jsonPath("[0]").isNotEmpty)
    }
    @Test
    fun `Add data to Data base (Test method saveCharacters)`() {
        this.mockMvc!!.perform(post("/characters")).andExpect(status().isOk)
    }
    @Test
    fun `Add data to Data base (Test method updateCharacter)`() {
        val testCharacter  = Character(4, "testName","testStatus","testSpecies","testType","testGender")
        if(characterController.updateCharacter(testCharacter) != ResponseEntity.ok()){
            AssertionError()
        }
    }
}