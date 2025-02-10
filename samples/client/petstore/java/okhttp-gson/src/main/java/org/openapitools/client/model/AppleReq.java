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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * AppleReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0-SNAPSHOT")
public class AppleReq {
  public static final String SERIALIZED_NAME_CULTIVAR = "cultivar";
  @SerializedName(SERIALIZED_NAME_CULTIVAR)
  @javax.annotation.Nonnull
  private String cultivar;

  public static final String SERIALIZED_NAME_MEALY = "mealy";
  @SerializedName(SERIALIZED_NAME_MEALY)
  @javax.annotation.Nullable
  private Boolean mealy;

  public AppleReq() {
  }

  public AppleReq cultivar(@javax.annotation.Nonnull String cultivar) {
    this.cultivar = cultivar;
    return this;
  }

  /**
   * Get cultivar
   * @return cultivar
   */
  @javax.annotation.Nonnull
  public String getCultivar() {
    return cultivar;
  }

  public void setCultivar(@javax.annotation.Nonnull String cultivar) {
    this.cultivar = cultivar;
  }


  public AppleReq mealy(@javax.annotation.Nullable Boolean mealy) {
    this.mealy = mealy;
    return this;
  }

  /**
   * Get mealy
   * @return mealy
   */
  @javax.annotation.Nullable
  public Boolean getMealy() {
    return mealy;
  }

  public void setMealy(@javax.annotation.Nullable Boolean mealy) {
    this.mealy = mealy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppleReq appleReq = (AppleReq) o;
    return Objects.equals(this.cultivar, appleReq.cultivar) &&
        Objects.equals(this.mealy, appleReq.mealy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cultivar, mealy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppleReq {\n");
    sb.append("    cultivar: ").append(toIndentedString(cultivar)).append("\n");
    sb.append("    mealy: ").append(toIndentedString(mealy)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cultivar");
    openapiFields.add("mealy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("cultivar");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AppleReq
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppleReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppleReq is not found in the empty JSON string", AppleReq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AppleReq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppleReq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AppleReq.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("cultivar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cultivar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cultivar").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppleReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppleReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppleReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppleReq.class));

       return (TypeAdapter<T>) new TypeAdapter<AppleReq>() {
           @Override
           public void write(JsonWriter out, AppleReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppleReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AppleReq given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AppleReq
   * @throws IOException if the JSON string is invalid with respect to AppleReq
   */
  public static AppleReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppleReq.class);
  }

  /**
   * Convert an instance of AppleReq to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

