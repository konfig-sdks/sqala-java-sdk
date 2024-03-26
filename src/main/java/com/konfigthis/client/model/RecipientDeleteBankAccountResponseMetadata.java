/*
 * Developer API
 * At Sqala, we believe that everyone deserves access to financial services, and we are committed to providing secure and reliable payment solutions to clients who may have been overlooked by traditional financial institutions.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * RecipientDeleteBankAccountResponseMetadata
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecipientDeleteBankAccountResponseMetadata {
  public static final String SERIALIZED_NAME_C_U_S_T_O_M_F_I_E_L_D_N_A_M_E = "CUSTOM_FIELD_NAME";
  @SerializedName(SERIALIZED_NAME_C_U_S_T_O_M_F_I_E_L_D_N_A_M_E)
  private String CUSTOM_FIELD_NAME;

  public RecipientDeleteBankAccountResponseMetadata() {
  }

  public RecipientDeleteBankAccountResponseMetadata CUSTOM_FIELD_NAME(String CUSTOM_FIELD_NAME) {
    
    
    
    
    this.CUSTOM_FIELD_NAME = CUSTOM_FIELD_NAME;
    return this;
  }

   /**
   * Get CUSTOM_FIELD_NAME
   * @return CUSTOM_FIELD_NAME
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CUSTOM_FIELD_VALUE", value = "")

  public String getCUSTOMFIELDNAME() {
    return CUSTOM_FIELD_NAME;
  }


  public void setCUSTOMFIELDNAME(String CUSTOM_FIELD_NAME) {
    
    
    
    this.CUSTOM_FIELD_NAME = CUSTOM_FIELD_NAME;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RecipientDeleteBankAccountResponseMetadata instance itself
   */
  public RecipientDeleteBankAccountResponseMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientDeleteBankAccountResponseMetadata recipientDeleteBankAccountResponseMetadata = (RecipientDeleteBankAccountResponseMetadata) o;
    return Objects.equals(this.CUSTOM_FIELD_NAME, recipientDeleteBankAccountResponseMetadata.CUSTOM_FIELD_NAME)&&
        Objects.equals(this.additionalProperties, recipientDeleteBankAccountResponseMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_FIELD_NAME, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientDeleteBankAccountResponseMetadata {\n");
    sb.append("    CUSTOM_FIELD_NAME: ").append(toIndentedString(CUSTOM_FIELD_NAME)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("CUSTOM_FIELD_NAME");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecipientDeleteBankAccountResponseMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecipientDeleteBankAccountResponseMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecipientDeleteBankAccountResponseMetadata is not found in the empty JSON string", RecipientDeleteBankAccountResponseMetadata.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("CUSTOM_FIELD_NAME") != null && !jsonObj.get("CUSTOM_FIELD_NAME").isJsonNull()) && !jsonObj.get("CUSTOM_FIELD_NAME").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CUSTOM_FIELD_NAME` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CUSTOM_FIELD_NAME").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecipientDeleteBankAccountResponseMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecipientDeleteBankAccountResponseMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecipientDeleteBankAccountResponseMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecipientDeleteBankAccountResponseMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<RecipientDeleteBankAccountResponseMetadata>() {
           @Override
           public void write(JsonWriter out, RecipientDeleteBankAccountResponseMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RecipientDeleteBankAccountResponseMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecipientDeleteBankAccountResponseMetadata instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecipientDeleteBankAccountResponseMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecipientDeleteBankAccountResponseMetadata
  * @throws IOException if the JSON string is invalid with respect to RecipientDeleteBankAccountResponseMetadata
  */
  public static RecipientDeleteBankAccountResponseMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecipientDeleteBankAccountResponseMetadata.class);
  }

 /**
  * Convert an instance of RecipientDeleteBankAccountResponseMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

