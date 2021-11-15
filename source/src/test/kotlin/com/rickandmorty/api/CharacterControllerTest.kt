package com.rickandmorty.api

import com.beust.klaxon.Klaxon
import com.rickandmorty.api.controller.CharacterController
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.runner.RunWith
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
import kotlinx.serialization.json.JsonElement


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class CharacterControllerTest() {

    @Autowired
    val mockMvc: MockMvc?=null
    @Autowired
    lateinit var characterController: CharacterController

    @Test
    fun `Check list characters`() {
        this.mockMvc!!.perform(get("/characters").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(jsonPath("[0]").isNotEmpty)
    }
    @Test
    fun `Add data to Data base `() {
        val CHARACTER_URL="https://rickandmortyapi.com/api/character"

        this.mockMvc!!.perform(post("/characters")
                .content(Klaxon().toJsonString(Character(1,"nametest","statustest","specialtest","typetest","gendertest")))
            )
            .andDo(print())
    }
}