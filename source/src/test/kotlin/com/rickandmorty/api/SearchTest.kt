package com.rickandmorty.api

import com.rickandmorty.api.controller.CharacterController
import org.hamcrest.core.StringContains.containsString
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import java.io.IOException


@SpringBootTest
class SearchTest {

    @Autowired
    private val mockMvc: MockMvc? = null

    @Autowired
    private lateinit var characterController: CharacterController;

    @Test
    fun SearchNameTest() {
        this.mockMvc!!.perform(get("/")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello, World")));
    }
}