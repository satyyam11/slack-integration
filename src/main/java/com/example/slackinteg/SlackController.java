package com.example.slackinteg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class SlackController {

    @Autowired
    private SlackService slackService;

    @GetMapping("/sendSlackMessage")
    public String sendSlackMessageGet(@RequestParam String message) {
        return slackService.sendMessage(message);
    }

    @PostMapping("/sendSlackMessage")
    public String sendSlackMessagePost(@RequestBody Map<String, String> payload) {
        String message = payload.get("message");
        return slackService.sendMessage(message);
    }
}
