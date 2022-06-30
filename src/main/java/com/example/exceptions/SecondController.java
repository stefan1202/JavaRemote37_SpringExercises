package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
  @GetMapping("/api/resource2")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void alsoAlwaysThrows() {
    throw new SdaException("Boom a corner case occurred");
  }
}