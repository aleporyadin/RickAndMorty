package com.rickandmorty.api

import com.rickandmorty.api.controller.CharacterController
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc



@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(ApiApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SearchTest {

    @Autowired
    private val mockMvc: MockMvc? = null

    @Autowired
    private lateinit var characterController: CharacterController;

    @Test
    fun SearchNameTest() {
        assertThat(characterController).isNotNull();

    }
}