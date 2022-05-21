package com.chandra.util;

import java.io.Serializable;

import org.json.simple.JSONObject;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Response class for public http requests
 * 
 * @since v2.10
 */
@JsonInclude(Include.NON_NULL)
public class HttpStatusResponse implements Serializable {

  private static final long serialVersionUID = 1L;
  private static HttpStatusResponse httpResponse;
  @JsonInclude(Include.NON_NULL)
  private Integer totalRecords;
  private Integer statusCode;
  private String description;
  private Object data;
  @JsonInclude(Include.NON_NULL)
  private JSONObject error;
  @JsonInclude(Include.NON_NULL)
  private String customCode;

  /**
   * Default constructor
   */
  private HttpStatusResponse() {
    super();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer i) {
    this.statusCode = i;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public String getCustomCode() {
    return customCode;
  }

  public void setCustomCode(String customCode) {
    this.customCode = customCode;
  }

  public JSONObject getError() {
    return error;
  }

  public void setError(JSONObject error) {
    this.error = error;
  }

  /**
   * Method returns the response object with code,data and description.
   * 
   * @param code - Status code
   * @param description - Response description
   * @param data - Actual data
   * @return httpResponse
   */
  public static HttpStatusResponse setHttpResponse(Integer code, String description, Object data) {
    httpResponse = new HttpStatusResponse();
    httpResponse.setTotalRecords(null);
    httpResponse.setStatusCode(code);
    httpResponse.setDescription(description);
    httpResponse.setData(data);
    return httpResponse;
  }
}
