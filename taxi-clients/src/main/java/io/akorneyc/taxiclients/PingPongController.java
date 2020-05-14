package io.akorneyc.taxiclients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class PingPongController {

    @Value("${pong.message: sorry!}")
    private String pongMessage;

    @Value("${pong.messages}")
    private List<String> pongMessages;

    @Autowired
    private PongSettings pong2Settings;

    @GetMapping("/ping")
    public String pong() {
        Random rand = new Random();
        return pongMessage + pongMessages.get(rand.nextInt(pongMessages.size()));
    }

    @GetMapping("/ping2")
    public String pong2() {
        return pong2Settings.getMessage();
    }
}
