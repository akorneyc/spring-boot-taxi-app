package io.akorneyc.taxiclients;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {

    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }
}
