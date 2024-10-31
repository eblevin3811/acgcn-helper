package eblevin.acgcn.app;

import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class GCNControllerTests {

    @Autowired
    private GCNController controller;

    @Test
    void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }
}
