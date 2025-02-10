/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
 */
@ApiModel(description = "Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.")
@JsonPropertyOrder({
  HealthCheckResult.JSON_PROPERTY_NULLABLE_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
public class HealthCheckResult   {
  public static final String JSON_PROPERTY_NULLABLE_MESSAGE = "NullableMessage";
  @JsonProperty(JSON_PROPERTY_NULLABLE_MESSAGE)
  private String nullableMessage;

  public HealthCheckResult nullableMessage(String nullableMessage) {
    this.nullableMessage = nullableMessage;
    return this;
  }

  /**
   * Get nullableMessage
   * @return nullableMessage
   **/
  @JsonProperty(value = "NullableMessage")
  @ApiModelProperty(value = "")
  
  public String getNullableMessage() {
    return nullableMessage;
  }

  public void setNullableMessage(String nullableMessage) {
    this.nullableMessage = nullableMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.nullableMessage, healthCheckResult.nullableMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullableMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    
    sb.append("    nullableMessage: ").append(toIndentedString(nullableMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

