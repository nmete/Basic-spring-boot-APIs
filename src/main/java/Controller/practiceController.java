package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practiceController {

    @GetMapping("/show")
    public String show(){
        return "showing get methods";
    }
}
