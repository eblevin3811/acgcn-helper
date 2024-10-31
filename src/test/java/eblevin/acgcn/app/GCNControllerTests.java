package eblevin.acgcn.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.Matchers.containsString;

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class GCNControllerTests {
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void checkSuccessMessage() throws Exception{
        this.mockMvc
            .perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string(
                containsString("Hello, World!")
            ));
    }
}
