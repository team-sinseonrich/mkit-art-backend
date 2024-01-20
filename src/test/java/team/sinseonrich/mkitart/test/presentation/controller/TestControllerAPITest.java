package team.sinseonrich.mkitart.test.presentation.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class TestControllerAPITest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getTest_shouldReturnResult() throws Exception {

        String result = "This is Team SinseonRich!";

        mockMvc.perform(MockMvcRequestBuilders.get("/test"))
                .andExpect(content().string(is(result)));
    }
}