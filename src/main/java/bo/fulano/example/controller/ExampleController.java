package bo.fulano.example.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAssuranceByUserId() {
        return "Hello World. Now It's " + Instant.now().toString();
    }
}
