package eblevin.acgcn.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GCNController {
    
    @GetMapping("/")
    public String index(){
        return "Hello, World!";
    }
}
