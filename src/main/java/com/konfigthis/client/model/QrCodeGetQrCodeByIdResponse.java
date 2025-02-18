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
import com.konfigthis.client.model.QrCodeGetQrCodeByIdResponseMetadataInner;
import com.konfigthis.client.model.QrCodeGetQrCodeByIdResponsePayer;
import com.konfigthis.client.model.QrCodeGetQrCodeByIdResponseSplitInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * QrCodeGetQrCodeByIdResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class QrCodeGetQrCodeByIdResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount = 0;

  public static final String SERIALIZED_NAME_PAID_AMOUNT = "paidAmount";
  @SerializedName(SERIALIZED_NAME_PAID_AMOUNT)
  private Object paidAmount = null;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private String payload;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private QrCodeGetQrCodeByIdResponsePayer payer;

  public static final String SERIALIZED_NAME_SPLIT = "split";
  @SerializedName(SERIALIZED_NAME_SPLIT)
  private List<QrCodeGetQrCodeByIdResponseSplitInner> split = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_PROCESSED_AT = "processedAt";
  @SerializedName(SERIALIZED_NAME_PROCESSED_AT)
  private String processedAt;

  public static final String SERIALIZED_NAME_PAID_AT = "paidAt";
  @SerializedName(SERIALIZED_NAME_PAID_AT)
  private Object paidAt = null;

  public static final String SERIALIZED_NAME_FAILED_AT = "failedAt";
  @SerializedName(SERIALIZED_NAME_FAILED_AT)
  private Object failedAt = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<QrCodeGetQrCodeByIdResponseMetadataInner> metadata = null;

  public QrCodeGetQrCodeByIdResponse() {
  }

  public QrCodeGetQrCodeByIdResponse id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a0b14a9-023c-4198-9ada-6e4684213340", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public QrCodeGetQrCodeByIdResponse code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "804a46a7-7012-4159-8782-1090e85e4afa", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public QrCodeGetQrCodeByIdResponse type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STATIC", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public QrCodeGetQrCodeByIdResponse amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4990", value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public QrCodeGetQrCodeByIdResponse paidAmount(Object paidAmount) {
    
    
    
    
    this.paidAmount = paidAmount;
    return this;
  }

   /**
   * Get paidAmount
   * @return paidAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPaidAmount() {
    return paidAmount;
  }


  public void setPaidAmount(Object paidAmount) {
    
    
    
    this.paidAmount = paidAmount;
  }


  public QrCodeGetQrCodeByIdResponse payload(String payload) {
    
    
    
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00020126580014BR.GOV.BCB.PIX01368ad59cd0-cd85-45eb-a443-b8824285c5f352040000530398654041.295802BR5924RPO GESTAO DE PAGAMENTOS6008SO PAULO6108000000006224052046193bc0333a468fa1ee6304A3E1", value = "")

  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    
    
    
    this.payload = payload;
  }


  public QrCodeGetQrCodeByIdResponse payer(QrCodeGetQrCodeByIdResponsePayer payer) {
    
    
    
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QrCodeGetQrCodeByIdResponsePayer getPayer() {
    return payer;
  }


  public void setPayer(QrCodeGetQrCodeByIdResponsePayer payer) {
    
    
    
    this.payer = payer;
  }


  public QrCodeGetQrCodeByIdResponse split(List<QrCodeGetQrCodeByIdResponseSplitInner> split) {
    
    
    
    
    this.split = split;
    return this;
  }

  public QrCodeGetQrCodeByIdResponse addSplitItem(QrCodeGetQrCodeByIdResponseSplitInner splitItem) {
    if (this.split == null) {
      this.split = new ArrayList<>();
    }
    this.split.add(splitItem);
    return this;
  }

   /**
   * Get split
   * @return split
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QrCodeGetQrCodeByIdResponseSplitInner> getSplit() {
    return split;
  }


  public void setSplit(List<QrCodeGetQrCodeByIdResponseSplitInner> split) {
    
    
    
    this.split = split;
  }


  public QrCodeGetQrCodeByIdResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PROCESSED", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public QrCodeGetQrCodeByIdResponse createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-06T11:48:21Z", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public QrCodeGetQrCodeByIdResponse processedAt(String processedAt) {
    
    
    
    
    this.processedAt = processedAt;
    return this;
  }

   /**
   * Get processedAt
   * @return processedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-06-06T11:48:26Z", value = "")

  public String getProcessedAt() {
    return processedAt;
  }


  public void setProcessedAt(String processedAt) {
    
    
    
    this.processedAt = processedAt;
  }


  public QrCodeGetQrCodeByIdResponse paidAt(Object paidAt) {
    
    
    
    
    this.paidAt = paidAt;
    return this;
  }

   /**
   * Get paidAt
   * @return paidAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPaidAt() {
    return paidAt;
  }


  public void setPaidAt(Object paidAt) {
    
    
    
    this.paidAt = paidAt;
  }


  public QrCodeGetQrCodeByIdResponse failedAt(Object failedAt) {
    
    
    
    
    this.failedAt = failedAt;
    return this;
  }

   /**
   * Get failedAt
   * @return failedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFailedAt() {
    return failedAt;
  }


  public void setFailedAt(Object failedAt) {
    
    
    
    this.failedAt = failedAt;
  }


  public QrCodeGetQrCodeByIdResponse metadata(List<QrCodeGetQrCodeByIdResponseMetadataInner> metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

  public QrCodeGetQrCodeByIdResponse addMetadataItem(QrCodeGetQrCodeByIdResponseMetadataInner metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QrCodeGetQrCodeByIdResponseMetadataInner> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<QrCodeGetQrCodeByIdResponseMetadataInner> metadata) {
    
    
    
    this.metadata = metadata;
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
   * @return the QrCodeGetQrCodeByIdResponse instance itself
   */
  public QrCodeGetQrCodeByIdResponse putAdditionalProperty(String key, Object value) {
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
    QrCodeGetQrCodeByIdResponse qrCodeGetQrCodeByIdResponse = (QrCodeGetQrCodeByIdResponse) o;
    return Objects.equals(this.id, qrCodeGetQrCodeByIdResponse.id) &&
        Objects.equals(this.code, qrCodeGetQrCodeByIdResponse.code) &&
        Objects.equals(this.type, qrCodeGetQrCodeByIdResponse.type) &&
        Objects.equals(this.amount, qrCodeGetQrCodeByIdResponse.amount) &&
        Objects.equals(this.paidAmount, qrCodeGetQrCodeByIdResponse.paidAmount) &&
        Objects.equals(this.payload, qrCodeGetQrCodeByIdResponse.payload) &&
        Objects.equals(this.payer, qrCodeGetQrCodeByIdResponse.payer) &&
        Objects.equals(this.split, qrCodeGetQrCodeByIdResponse.split) &&
        Objects.equals(this.status, qrCodeGetQrCodeByIdResponse.status) &&
        Objects.equals(this.createdAt, qrCodeGetQrCodeByIdResponse.createdAt) &&
        Objects.equals(this.processedAt, qrCodeGetQrCodeByIdResponse.processedAt) &&
        Objects.equals(this.paidAt, qrCodeGetQrCodeByIdResponse.paidAt) &&
        Objects.equals(this.failedAt, qrCodeGetQrCodeByIdResponse.failedAt) &&
        Objects.equals(this.metadata, qrCodeGetQrCodeByIdResponse.metadata)&&
        Objects.equals(this.additionalProperties, qrCodeGetQrCodeByIdResponse.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, type, amount, paidAmount, payload, payer, split, status, createdAt, processedAt, paidAt, failedAt, metadata, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QrCodeGetQrCodeByIdResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    paidAmount: ").append(toIndentedString(paidAmount)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    processedAt: ").append(toIndentedString(processedAt)).append("\n");
    sb.append("    paidAt: ").append(toIndentedString(paidAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("code");
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("paidAmount");
    openapiFields.add("payload");
    openapiFields.add("payer");
    openapiFields.add("split");
    openapiFields.add("status");
    openapiFields.add("createdAt");
    openapiFields.add("processedAt");
    openapiFields.add("paidAt");
    openapiFields.add("failedAt");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QrCodeGetQrCodeByIdResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!QrCodeGetQrCodeByIdResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QrCodeGetQrCodeByIdResponse is not found in the empty JSON string", QrCodeGetQrCodeByIdResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) && !jsonObj.get("payload").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payload` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payload").toString()));
      }
      // validate the optional field `payer`
      if (jsonObj.get("payer") != null && !jsonObj.get("payer").isJsonNull()) {
        QrCodeGetQrCodeByIdResponsePayer.validateJsonObject(jsonObj.getAsJsonObject("payer"));
      }
      if (jsonObj.get("split") != null && !jsonObj.get("split").isJsonNull()) {
        JsonArray jsonArraysplit = jsonObj.getAsJsonArray("split");
        if (jsonArraysplit != null) {
          // ensure the json data is an array
          if (!jsonObj.get("split").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `split` to be an array in the JSON string but got `%s`", jsonObj.get("split").toString()));
          }

          // validate the optional field `split` (array)
          for (int i = 0; i < jsonArraysplit.size(); i++) {
            QrCodeGetQrCodeByIdResponseSplitInner.validateJsonObject(jsonArraysplit.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("processedAt") != null && !jsonObj.get("processedAt").isJsonNull()) && !jsonObj.get("processedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processedAt").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            QrCodeGetQrCodeByIdResponseMetadataInner.validateJsonObject(jsonArraymetadata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QrCodeGetQrCodeByIdResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QrCodeGetQrCodeByIdResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QrCodeGetQrCodeByIdResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QrCodeGetQrCodeByIdResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<QrCodeGetQrCodeByIdResponse>() {
           @Override
           public void write(JsonWriter out, QrCodeGetQrCodeByIdResponse value) throws IOException {
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
           public QrCodeGetQrCodeByIdResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             QrCodeGetQrCodeByIdResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of QrCodeGetQrCodeByIdResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QrCodeGetQrCodeByIdResponse
  * @throws IOException if the JSON string is invalid with respect to QrCodeGetQrCodeByIdResponse
  */
  public static QrCodeGetQrCodeByIdResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QrCodeGetQrCodeByIdResponse.class);
  }

 /**
  * Convert an instance of QrCodeGetQrCodeByIdResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

