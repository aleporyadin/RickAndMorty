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
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc


@RunWith(SpringRunner::class)
@AutoConfigureMockMvc
class CharacterServiceTest {


    @Autowired
    val mockMvc: MockMvc?=null

    @Mock
    private var characterRepository: CharacterRepository?=null

    @InjectMocks
    private var characterService: CharacterServiceImpl?=null

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun `Service test to add character when create`(){
        val characterTest = Character(1,"nametest","statustest","specialtest","typetest","gendertest")

        // check https://newbedev.com/mocked-repository-returns-null
        //when(characterRepository.save(characterTest).thenReturn(dummyUser);

        this.characterService?.saveCharacter(characterTest)
        val expected = Character(
            1,"nametest",
            "statustest",
            "specialtest",
            "typetest",
            "gendertest")
        val actual = this.characterService?.getCharacterById(1)
        print(actual)
        Assert.assertEquals(expected,actual)
    }
    @Test
    fun `Service test to add character when null`(){
       // this.characterService?.saveCharacter(null)
    }
    @Test
    fun `Service test when character have one params`(){
        this.characterService?.saveCharacter(Character(1))
    }
}