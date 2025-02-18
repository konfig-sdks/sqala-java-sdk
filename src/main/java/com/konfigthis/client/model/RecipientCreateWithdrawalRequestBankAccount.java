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
 * The destination bank account. Required if method is STANDARD.
 */
@ApiModel(description = "The destination bank account. Required if method is STANDARD.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecipientCreateWithdrawalRequestBankAccount {
  /**
   * The type of bank account. Can be CHEKING or SAVINGS.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    CHECKING("CHECKING"),
    
    SAVINGS("SAVINGS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.CHECKING;

  public static final String SERIALIZED_NAME_HOLDER_NAME = "holderName";
  @SerializedName(SERIALIZED_NAME_HOLDER_NAME)
  private String holderName;

  public static final String SERIALIZED_NAME_HOLDER_TAX_ID = "holderTaxId";
  @SerializedName(SERIALIZED_NAME_HOLDER_TAX_ID)
  private String holderTaxId;

  /**
   * The type of entity that holds the account. Can be INDIVIDUAL or COMPANY.
   */
  @JsonAdapter(HolderTypeEnum.Adapter.class)
 public enum HolderTypeEnum {
    INDIVIDUAL("INDIVIDUAL"),
    
    COMPANY("COMPANY");

    private String value;

    HolderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HolderTypeEnum fromValue(String value) {
      for (HolderTypeEnum b : HolderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HolderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HolderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HolderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HolderTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HOLDER_TYPE = "holderType";
  @SerializedName(SERIALIZED_NAME_HOLDER_TYPE)
  private HolderTypeEnum holderType;

  public static final String SERIALIZED_NAME_BRANCH_NUMBER = "branchNumber";
  @SerializedName(SERIALIZED_NAME_BRANCH_NUMBER)
  private String branchNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BANK_ID = "bankId";
  @SerializedName(SERIALIZED_NAME_BANK_ID)
  private String bankId;

  public RecipientCreateWithdrawalRequestBankAccount() {
  }

  public RecipientCreateWithdrawalRequestBankAccount type(TypeEnum type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * The type of bank account. Can be CHEKING or SAVINGS.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CHECKING", value = "The type of bank account. Can be CHEKING or SAVINGS.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    
    
    
    this.type = type;
  }


  public RecipientCreateWithdrawalRequestBankAccount holderName(String holderName) {
    
    
    
    
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the person or business that owns the bank account.
   * @return holderName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the person or business that owns the bank account.")

  public String getHolderName() {
    return holderName;
  }


  public void setHolderName(String holderName) {
    
    
    
    this.holderName = holderName;
  }


  public RecipientCreateWithdrawalRequestBankAccount holderTaxId(String holderTaxId) {
    
    
    
    
    this.holderTaxId = holderTaxId;
    return this;
  }

   /**
   * The tax ID of the account holder (CPF for individual account holders or CNPJ for businesses account holders).
   * @return holderTaxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The tax ID of the account holder (CPF for individual account holders or CNPJ for businesses account holders).")

  public String getHolderTaxId() {
    return holderTaxId;
  }


  public void setHolderTaxId(String holderTaxId) {
    
    
    
    this.holderTaxId = holderTaxId;
  }


  public RecipientCreateWithdrawalRequestBankAccount holderType(HolderTypeEnum holderType) {
    
    
    
    
    this.holderType = holderType;
    return this;
  }

   /**
   * The type of entity that holds the account. Can be INDIVIDUAL or COMPANY.
   * @return holderType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of entity that holds the account. Can be INDIVIDUAL or COMPANY.")

  public HolderTypeEnum getHolderType() {
    return holderType;
  }


  public void setHolderType(HolderTypeEnum holderType) {
    
    
    
    this.holderType = holderType;
  }


  public RecipientCreateWithdrawalRequestBankAccount branchNumber(String branchNumber) {
    
    
    
    
    this.branchNumber = branchNumber;
    return this;
  }

   /**
   * Get branchNumber
   * @return branchNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBranchNumber() {
    return branchNumber;
  }


  public void setBranchNumber(String branchNumber) {
    
    
    
    this.branchNumber = branchNumber;
  }


  public RecipientCreateWithdrawalRequestBankAccount accountNumber(String accountNumber) {
    
    
    
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    
    
    
    this.accountNumber = accountNumber;
  }


  public RecipientCreateWithdrawalRequestBankAccount bankId(String bankId) {
    
    
    
    
    this.bankId = bankId;
    return this;
  }

   /**
   * The ID of the bank associated with the account.
   * @return bankId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the bank associated with the account.")

  public String getBankId() {
    return bankId;
  }


  public void setBankId(String bankId) {
    
    
    
    this.bankId = bankId;
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
   * @return the RecipientCreateWithdrawalRequestBankAccount instance itself
   */
  public RecipientCreateWithdrawalRequestBankAccount putAdditionalProperty(String key, Object value) {
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
    RecipientCreateWithdrawalRequestBankAccount recipientCreateWithdrawalRequestBankAccount = (RecipientCreateWithdrawalRequestBankAccount) o;
    return Objects.equals(this.type, recipientCreateWithdrawalRequestBankAccount.type) &&
        Objects.equals(this.holderName, recipientCreateWithdrawalRequestBankAccount.holderName) &&
        Objects.equals(this.holderTaxId, recipientCreateWithdrawalRequestBankAccount.holderTaxId) &&
        Objects.equals(this.holderType, recipientCreateWithdrawalRequestBankAccount.holderType) &&
        Objects.equals(this.branchNumber, recipientCreateWithdrawalRequestBankAccount.branchNumber) &&
        Objects.equals(this.accountNumber, recipientCreateWithdrawalRequestBankAccount.accountNumber) &&
        Objects.equals(this.bankId, recipientCreateWithdrawalRequestBankAccount.bankId)&&
        Objects.equals(this.additionalProperties, recipientCreateWithdrawalRequestBankAccount.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, holderName, holderTaxId, holderType, branchNumber, accountNumber, bankId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientCreateWithdrawalRequestBankAccount {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    holderTaxId: ").append(toIndentedString(holderTaxId)).append("\n");
    sb.append("    holderType: ").append(toIndentedString(holderType)).append("\n");
    sb.append("    branchNumber: ").append(toIndentedString(branchNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("holderName");
    openapiFields.add("holderTaxId");
    openapiFields.add("holderType");
    openapiFields.add("branchNumber");
    openapiFields.add("accountNumber");
    openapiFields.add("bankId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("holderName");
    openapiRequiredFields.add("holderTaxId");
    openapiRequiredFields.add("holderType");
    openapiRequiredFields.add("branchNumber");
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("bankId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecipientCreateWithdrawalRequestBankAccount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecipientCreateWithdrawalRequestBankAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecipientCreateWithdrawalRequestBankAccount is not found in the empty JSON string", RecipientCreateWithdrawalRequestBankAccount.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecipientCreateWithdrawalRequestBankAccount.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (!jsonObj.get("holderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderName").toString()));
      }
      if (!jsonObj.get("holderTaxId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderTaxId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderTaxId").toString()));
      }
      if (!jsonObj.get("holderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `holderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("holderType").toString()));
      }
      if (!jsonObj.get("branchNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branchNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branchNumber").toString()));
      }
      if (!jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      if (!jsonObj.get("bankId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bankId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bankId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecipientCreateWithdrawalRequestBankAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecipientCreateWithdrawalRequestBankAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecipientCreateWithdrawalRequestBankAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecipientCreateWithdrawalRequestBankAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<RecipientCreateWithdrawalRequestBankAccount>() {
           @Override
           public void write(JsonWriter out, RecipientCreateWithdrawalRequestBankAccount value) throws IOException {
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
           public RecipientCreateWithdrawalRequestBankAccount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecipientCreateWithdrawalRequestBankAccount instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecipientCreateWithdrawalRequestBankAccount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecipientCreateWithdrawalRequestBankAccount
  * @throws IOException if the JSON string is invalid with respect to RecipientCreateWithdrawalRequestBankAccount
  */
  public static RecipientCreateWithdrawalRequestBankAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecipientCreateWithdrawalRequestBankAccount.class);
  }

 /**
  * Convert an instance of RecipientCreateWithdrawalRequestBankAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

