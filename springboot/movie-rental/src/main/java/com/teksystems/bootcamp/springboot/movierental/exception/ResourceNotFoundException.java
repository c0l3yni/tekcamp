package com.teksystems.bootcamp.springboot.movierental.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  public class ResourceNotFoundException extends RuntimeException {
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFoundException(String message, String resourceName, Object fieldValue) {
      super(String.format("%s not found with %s : '%s", resourceName, " ", fieldValue));
      this.resourceName = resourceName;
      this.fieldValue = fieldValue;
    }
  }

