package com.example.exceptions;

public class SdaException extends RuntimeException {
  public SdaException(final String message) {
    super(message);
  }
}