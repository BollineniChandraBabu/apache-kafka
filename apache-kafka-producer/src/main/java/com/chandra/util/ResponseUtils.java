package com.chandra.util;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {

  private ResponseUtils() {}

  public static ResponseEntity<HttpStatusResponse> prepareSuccessResponse(String responseMessage,
      Object data) {
    if (Objects.isNull(responseMessage)) {
      responseMessage = "Request success.";
    }
    return new ResponseEntity<>(
        HttpStatusResponse.setHttpResponse(HttpStatus.OK.value(), responseMessage, data),
        HttpStatus.OK);
  }
}
