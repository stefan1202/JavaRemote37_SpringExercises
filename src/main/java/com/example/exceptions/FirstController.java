package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
  @GetMapping("/api/resource3")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void willAlwaysThrow() {
    throw new SdaException("Boom something bad happened in the controller method");
  }
}