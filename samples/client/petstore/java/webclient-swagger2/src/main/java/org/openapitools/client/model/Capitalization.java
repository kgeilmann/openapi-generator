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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Capitalization
 */
@JsonPropertyOrder({
  Capitalization.JSON_PROPERTY_SMALL_CAMEL,
  Capitalization.JSON_PROPERTY_CAPITAL_CAMEL,
  Capitalization.JSON_PROPERTY_SMALL_SNAKE,
  Capitalization.JSON_PROPERTY_CAPITAL_SNAKE,
  Capitalization.JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS,
  Capitalization.JSON_PROPERTY_A_T_T_N_A_M_E
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
public class Capitalization {
  public static final String JSON_PROPERTY_SMALL_CAMEL = "smallCamel";
  @javax.annotation.Nullable
  private String smallCamel;

  public static final String JSON_PROPERTY_CAPITAL_CAMEL = "CapitalCamel";
  @javax.annotation.Nullable
  private String capitalCamel;

  public static final String JSON_PROPERTY_SMALL_SNAKE = "small_Snake";
  @javax.annotation.Nullable
  private String smallSnake;

  public static final String JSON_PROPERTY_CAPITAL_SNAKE = "Capital_Snake";
  @javax.annotation.Nullable
  private String capitalSnake;

  public static final String JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS = "SCA_ETH_Flow_Points";
  @javax.annotation.Nullable
  private String scAETHFlowPoints;

  public static final String JSON_PROPERTY_A_T_T_N_A_M_E = "ATT_NAME";
  @javax.annotation.Nullable
  private String ATT_NAME;

  public Capitalization() {
  }

  public Capitalization smallCamel(@javax.annotation.Nullable String smallCamel) {
    
    this.smallCamel = smallCamel;
    return this;
  }

  /**
   * Get smallCamel
   * @return smallCamel
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SMALL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmallCamel() {
    return smallCamel;
  }


  @JsonProperty(JSON_PROPERTY_SMALL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmallCamel(@javax.annotation.Nullable String smallCamel) {
    this.smallCamel = smallCamel;
  }

  public Capitalization capitalCamel(@javax.annotation.Nullable String capitalCamel) {
    
    this.capitalCamel = capitalCamel;
    return this;
  }

  /**
   * Get capitalCamel
   * @return capitalCamel
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAPITAL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCapitalCamel() {
    return capitalCamel;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_CAMEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalCamel(@javax.annotation.Nullable String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  public Capitalization smallSnake(@javax.annotation.Nullable String smallSnake) {
    
    this.smallSnake = smallSnake;
    return this;
  }

  /**
   * Get smallSnake
   * @return smallSnake
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SMALL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmallSnake() {
    return smallSnake;
  }


  @JsonProperty(JSON_PROPERTY_SMALL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmallSnake(@javax.annotation.Nullable String smallSnake) {
    this.smallSnake = smallSnake;
  }

  public Capitalization capitalSnake(@javax.annotation.Nullable String capitalSnake) {
    
    this.capitalSnake = capitalSnake;
    return this;
  }

  /**
   * Get capitalSnake
   * @return capitalSnake
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAPITAL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCapitalSnake() {
    return capitalSnake;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_SNAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalSnake(@javax.annotation.Nullable String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  public Capitalization scAETHFlowPoints(@javax.annotation.Nullable String scAETHFlowPoints) {
    
    this.scAETHFlowPoints = scAETHFlowPoints;
    return this;
  }

  /**
   * Get scAETHFlowPoints
   * @return scAETHFlowPoints
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }


  @JsonProperty(JSON_PROPERTY_SC_A_E_T_H_FLOW_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScAETHFlowPoints(@javax.annotation.Nullable String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  public Capitalization ATT_NAME(@javax.annotation.Nullable String ATT_NAME) {
    
    this.ATT_NAME = ATT_NAME;
    return this;
  }

  /**
   * Name of the pet 
   * @return ATT_NAME
   */
  @javax.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "Name of the pet ")
  @JsonProperty(JSON_PROPERTY_A_T_T_N_A_M_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getATTNAME() {
    return ATT_NAME;
  }


  @JsonProperty(JSON_PROPERTY_A_T_T_N_A_M_E)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setATTNAME(@javax.annotation.Nullable String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(this.smallCamel, capitalization.smallCamel) &&
        Objects.equals(this.capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(this.smallSnake, capitalization.smallSnake) &&
        Objects.equals(this.capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(this.scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(this.ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
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

