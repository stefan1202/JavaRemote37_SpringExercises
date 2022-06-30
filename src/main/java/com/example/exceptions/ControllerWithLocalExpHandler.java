package com.example.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControllerWithLocalExpHandler {

  @GetMapping("/api/resource")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void willAlwaysThrow() {
    throw new SpecificSdaException("Boom something bad happened in the controller method");
  }

  @GetMapping("/api/resource/subresource")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void alsoAlwaysThrows() {
    throw new VerySpecificSdaException("Boom a corner case occurred");
  }

  @ResponseStatus(HttpStatus.EXPECTATION_FAILED)
  @ExceptionHandler(SpecificSdaException.class)
  public Error handleSpecificSdaException(final SdaException exception) {
    log.debug("something bad has happened...");
    return new Error(exception.getMessage());
  }

  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler(VerySpecificSdaException.class)
  public Error handleVerySpecificSdaException(final SdaException exception) {
    log.debug("something bad has happened...");
    return new Error(exception.getMessage());
  }
}