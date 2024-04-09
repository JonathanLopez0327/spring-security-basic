package com.springboot.client.authclient.controllers;

import com.springboot.client.authclient.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class AppController {

    @GetMapping("/list")
    public List<Message> list() {
        return Collections.singletonList(new Message("Test list"));
    }

    @PostMapping("/creat")
    public Message create(@RequestBody Message message) {
        System.out.printf("Mensaje guardado! " + message);
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code) {
        return Collections.singletonMap("code ", code);
    }
}
