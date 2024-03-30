package stebie.tennisplayerrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    @GetMapping("/test-api")
    public String welcome() {
        return "REST API is working";
    }
}
