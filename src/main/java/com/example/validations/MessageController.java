package com.example.validations;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MessageController {

  @PostMapping("/api/messages")
  public void sendMessage(@Valid @RequestBody final Message message) {
    System.out.println("Am primit:" + message);
  }
}