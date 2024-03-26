# RecipientApi

All URIs are relative to *https://api.sqala.tech/developer/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBankAccount**](RecipientApi.md#createBankAccount) | **POST** /recipients/{recipientId}/bank-accounts | Create a Bank Account |
| [**createRecipient**](RecipientApi.md#createRecipient) | **POST** /recipients | Create a Recipient |
| [**createWithdrawal**](RecipientApi.md#createWithdrawal) | **POST** /recipients/{recipientId}/withdrawals | Create a Withdrawal |
| [**deleteBankAccount**](RecipientApi.md#deleteBankAccount) | **DELETE** /recipients/{recipientId}/bank-accounts/{bankAccountId} | Delete a Bank Account |
| [**getBalance**](RecipientApi.md#getBalance) | **GET** /recipients/{recipientId}/balance | Get Balance |
| [**getBankAccount**](RecipientApi.md#getBankAccount) | **GET** /recipients/{recipientId}/bank-accounts/{bankAccountId} | Retrieve a Bank Account |
| [**getById**](RecipientApi.md#getById) | **GET** /recipients/{id} | Retrieve a Recipient |
| [**getWithdrawalById**](RecipientApi.md#getWithdrawalById) | **GET** /recipients/{recipientId}/withdrawals/{withdrawalId} | Retrieve a Withdrawal |
| [**listAll**](RecipientApi.md#listAll) | **GET** /recipients | List all Recipients |
| [**listBankAccounts**](RecipientApi.md#listBankAccounts) | **GET** /recipients/{recipientId}/bank-accounts | List all Bank Accounts |
| [**listTransactions**](RecipientApi.md#listTransactions) | **GET** /recipients/{recipientId}/transactions | List all Transactions |
| [**listWithdrawals**](RecipientApi.md#listWithdrawals) | **GET** /recipients/{recipientId}/withdrawals | List all Withdrawals |
| [**updateRecipientById**](RecipientApi.md#updateRecipientById) | **PUT** /recipients/{id} | Update a Recipient |


<a name="createBankAccount"></a>
# **createBankAccount**
> RecipientCreateBankAccountResponse createBankAccount(recipientId).recipientCreateBankAccountRequest(recipientCreateBankAccountRequest).execute();

Create a Bank Account



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String holderName = "holderName_example"; // The name of the person or business that owns the bank account.
    String holderTaxId = "holderTaxId_example"; // The tax ID of the account holder (CPF for individual account holders or CNPJ for businesses account holders).
    String holderType = "INDIVIDUAL"; // The type of entity that holds the account. Can be INDIVIDUAL or COMPANY.
    String branchNumber = "branchNumber_example";
    String accountNumber = "accountNumber_example";
    String bankId = "bankId_example"; // The ID of the bank associated with the account.
    String recipientId = "DEFAULT";
    String type = "CHECKING"; // The type of bank account. Can be CHEKING or SAVINGS.
    try {
      RecipientCreateBankAccountResponse result = client
              .recipient
              .createBankAccount(holderName, holderTaxId, holderType, branchNumber, accountNumber, bankId, recipientId)
              .type(type)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getHolderName());
      System.out.println(result.getHolderTaxId());
      System.out.println(result.getHolderType());
      System.out.println(result.getBranchNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getBankId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientCreateBankAccountResponse> response = client
              .recipient
              .createBankAccount(holderName, holderTaxId, holderType, branchNumber, accountNumber, bankId, recipientId)
              .type(type)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **recipientCreateBankAccountRequest** | [**RecipientCreateBankAccountRequest**](RecipientCreateBankAccountRequest.md)|  | [optional] |

### Return type

[**RecipientCreateBankAccountResponse**](RecipientCreateBankAccountResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createRecipient"></a>
# **createRecipient**
> String createRecipient().recipientCreateRecipientRequest(recipientCreateRecipientRequest).execute();

Create a Recipient



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String name = "name_example"; // The name of the recipient.
    String taxId = "taxId_example"; // The tax ID of the recipient (CPF for individual recipients or CNPJ for businesses recipients).
    String type = "INDIVIDUAL"; // The type of the recipient.
    String code = "code_example"; // Unique identifier for the object in your system.
    List<QrCodeGenerateQrCodeRequestMetadataInner> metadata = Arrays.asList(); // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      String result = client
              .recipient
              .createRecipient(name, taxId, type)
              .code(code)
              .metadata(metadata)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createRecipient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .recipient
              .createRecipient(name, taxId, type)
              .code(code)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createRecipient");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientCreateRecipientRequest** | [**RecipientCreateRecipientRequest**](RecipientCreateRecipientRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createWithdrawal"></a>
# **createWithdrawal**
> RecipientCreateWithdrawalResponse createWithdrawal(recipientId).recipientCreateWithdrawalRequest(recipientCreateWithdrawalRequest).execute();

Create a Withdrawal



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    Integer amount = 56; // Amount in cents to be transferred.
    String method = "STANDARD"; // The method of the withdrawal.
    String recipientId = "DEFAULT";
    String code = "code_example"; // Unique identifier for the object in your system.
    String pixKey = "pixKey_example"; // The PIX key of the destination bank account. Required if method is PIX
    RecipientCreateWithdrawalRequestBankAccount bankAccount = new RecipientCreateWithdrawalRequestBankAccount();
    String bankAccountId = "bankAccountId_example"; // The ID of the destination bank account. Required if method is STANDARD.
    List<QrCodeGenerateQrCodeRequestMetadataInner> metadata = Arrays.asList(); // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      RecipientCreateWithdrawalResponse result = client
              .recipient
              .createWithdrawal(amount, method, recipientId)
              .code(code)
              .pixKey(pixKey)
              .bankAccount(bankAccount)
              .bankAccountId(bankAccountId)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getAmount());
      System.out.println(result.getMethod());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getApprovedAt());
      System.out.println(result.getRejectedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getPaidAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getPixKey());
      System.out.println(result.getBankAccount());
      System.out.println(result.getRecipient());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createWithdrawal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientCreateWithdrawalResponse> response = client
              .recipient
              .createWithdrawal(amount, method, recipientId)
              .code(code)
              .pixKey(pixKey)
              .bankAccount(bankAccount)
              .bankAccountId(bankAccountId)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#createWithdrawal");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **recipientCreateWithdrawalRequest** | [**RecipientCreateWithdrawalRequest**](RecipientCreateWithdrawalRequest.md)|  | [optional] |

### Return type

[**RecipientCreateWithdrawalResponse**](RecipientCreateWithdrawalResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteBankAccount"></a>
# **deleteBankAccount**
> RecipientDeleteBankAccountResponse deleteBankAccount(recipientId, bankAccountId).execute();

Delete a Bank Account



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    String bankAccountId = "bankAccountId_example";
    try {
      RecipientDeleteBankAccountResponse result = client
              .recipient
              .deleteBankAccount(recipientId, bankAccountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getHolderName());
      System.out.println(result.getHolderTaxId());
      System.out.println(result.getHolderType());
      System.out.println(result.getBranchNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getBankId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#deleteBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientDeleteBankAccountResponse> response = client
              .recipient
              .deleteBankAccount(recipientId, bankAccountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#deleteBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **bankAccountId** | **String**|  | |

### Return type

[**RecipientDeleteBankAccountResponse**](RecipientDeleteBankAccountResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getBalance"></a>
# **getBalance**
> Object getBalance(recipientId).execute();

Get Balance



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    try {
      Object result = client
              .recipient
              .getBalance(recipientId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .recipient
              .getBalance(recipientId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getBalance");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getBankAccount"></a>
# **getBankAccount**
> RecipientGetBankAccountResponse getBankAccount(recipientId, bankAccountId).execute();

Retrieve a Bank Account



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    String bankAccountId = "bankAccountId_example";
    try {
      RecipientGetBankAccountResponse result = client
              .recipient
              .getBankAccount(recipientId, bankAccountId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getHolderName());
      System.out.println(result.getHolderTaxId());
      System.out.println(result.getHolderType());
      System.out.println(result.getBranchNumber());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getBankId());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getDeletedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientGetBankAccountResponse> response = client
              .recipient
              .getBankAccount(recipientId, bankAccountId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getBankAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **bankAccountId** | **String**|  | |

### Return type

[**RecipientGetBankAccountResponse**](RecipientGetBankAccountResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getById"></a>
# **getById**
> String getById(id).execute();

Retrieve a Recipient



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String id = "id_example";
    try {
      String result = client
              .recipient
              .getById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .recipient
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getWithdrawalById"></a>
# **getWithdrawalById**
> RecipientGetWithdrawalByIdResponse getWithdrawalById(recipientId, withdrawalId).execute();

Retrieve a Withdrawal



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    String withdrawalId = "withdrawalId_example";
    try {
      RecipientGetWithdrawalByIdResponse result = client
              .recipient
              .getWithdrawalById(recipientId, withdrawalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getAmount());
      System.out.println(result.getMethod());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getApprovedAt());
      System.out.println(result.getRejectedAt());
      System.out.println(result.getPaidAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getPixKey());
      System.out.println(result.getBankAccount());
      System.out.println(result.getRecipient());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getWithdrawalById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientGetWithdrawalByIdResponse> response = client
              .recipient
              .getWithdrawalById(recipientId, withdrawalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#getWithdrawalById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **withdrawalId** | **String**|  | |

### Return type

[**RecipientGetWithdrawalByIdResponse**](RecipientGetWithdrawalByIdResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listAll"></a>
# **listAll**
> RecipientListAllResponse listAll().limit(limit).before(before).after(after).execute();

List all Recipients



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    Integer limit = 10; // A limit on the number of objects to be returned, between 1 and 50.
    String before = "before_example"; // A cursor for use in pagination. ```before``` is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with ```obj_bar```, your subsequent call can include ```before=obj_bar``` in order to fetch the previous page of the list.
    String after = "after_example"; // A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
    try {
      RecipientListAllResponse result = client
              .recipient
              .listAll()
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientListAllResponse> response = client
              .recipient
              .listAll()
              .limit(limit)
              .before(before)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| A limit on the number of objects to be returned, between 1 and 50. | [optional] [default to 10] |
| **before** | **String**| A cursor for use in pagination. &#x60;&#x60;&#x60;before&#x60;&#x60;&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with &#x60;&#x60;&#x60;obj_bar&#x60;&#x60;&#x60;, your subsequent call can include &#x60;&#x60;&#x60;before&#x3D;obj_bar&#x60;&#x60;&#x60; in order to fetch the previous page of the list. | [optional] |
| **after** | **String**| A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**RecipientListAllResponse**](RecipientListAllResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listBankAccounts"></a>
# **listBankAccounts**
> RecipientListBankAccountsResponse listBankAccounts(recipientId).execute();

List all Bank Accounts



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    try {
      RecipientListBankAccountsResponse result = client
              .recipient
              .listBankAccounts(recipientId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientListBankAccountsResponse> response = client
              .recipient
              .listBankAccounts(recipientId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listBankAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |

### Return type

[**RecipientListBankAccountsResponse**](RecipientListBankAccountsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listTransactions"></a>
# **listTransactions**
> Object listTransactions(recipientId).limit(limit).before(before).after(after).execute();

List all Transactions



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    String limit = "10"; // A limit on the number of objects to be returned, between 1 and 50.
    String before = "before_example"; // A cursor for use in pagination. ```before``` is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with ```obj_bar```, your subsequent call can include ```before=obj_bar``` in order to fetch the previous page of the list.
    String after = "after_example"; // A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
    try {
      Object result = client
              .recipient
              .listTransactions(recipientId)
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .recipient
              .listTransactions(recipientId)
              .limit(limit)
              .before(before)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **limit** | **String**| A limit on the number of objects to be returned, between 1 and 50. | [optional] [default to 10] |
| **before** | **String**| A cursor for use in pagination. &#x60;&#x60;&#x60;before&#x60;&#x60;&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with &#x60;&#x60;&#x60;obj_bar&#x60;&#x60;&#x60;, your subsequent call can include &#x60;&#x60;&#x60;before&#x3D;obj_bar&#x60;&#x60;&#x60; in order to fetch the previous page of the list. | [optional] |
| **after** | **String**| A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listWithdrawals"></a>
# **listWithdrawals**
> RecipientListWithdrawalsResponse listWithdrawals(recipientId).limit(limit).before(before).after(after).execute();

List all Withdrawals



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String recipientId = "DEFAULT";
    String limit = "10"; // A limit on the number of objects to be returned, between 1 and 50.
    String before = "before_example"; // A cursor for use in pagination. ```before``` is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with ```obj_bar```, your subsequent call can include ```before=obj_bar``` in order to fetch the previous page of the list.
    String after = "after_example"; // A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
    try {
      RecipientListWithdrawalsResponse result = client
              .recipient
              .listWithdrawals(recipientId)
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listWithdrawals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RecipientListWithdrawalsResponse> response = client
              .recipient
              .listWithdrawals(recipientId)
              .limit(limit)
              .before(before)
              .after(after)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#listWithdrawals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recipientId** | **String**|  | [default to DEFAULT] |
| **limit** | **String**| A limit on the number of objects to be returned, between 1 and 50. | [optional] [default to 10] |
| **before** | **String**| A cursor for use in pagination. &#x60;&#x60;&#x60;before&#x60;&#x60;&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with &#x60;&#x60;&#x60;obj_bar&#x60;&#x60;&#x60;, your subsequent call can include &#x60;&#x60;&#x60;before&#x3D;obj_bar&#x60;&#x60;&#x60; in order to fetch the previous page of the list. | [optional] |
| **after** | **String**| A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**RecipientListWithdrawalsResponse**](RecipientListWithdrawalsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateRecipientById"></a>
# **updateRecipientById**
> String updateRecipientById(id).execute();

Update a Recipient



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.RecipientApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.sqala.tech/developer/v1";
    
    // Configure HTTP basic authorization: sec0
    configuration.username = "YOUR USERNAME";
    configuration.password = "YOUR PASSWORD";
    Sqala client = new Sqala(configuration);
    String id = "id_example";
    try {
      String result = client
              .recipient
              .updateRecipientById(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#updateRecipientById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .recipient
              .updateRecipientById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling RecipientApi#updateRecipientById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

