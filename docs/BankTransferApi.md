# BankTransferApi

All URIs are relative to *https://api.sqala.tech/developer/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBankTransfer**](BankTransferApi.md#getBankTransfer) | **GET** /bank-transfer-payments/{bankTransferId} | Retrieve a Bank Transfer |
| [**listAllBankTransfers**](BankTransferApi.md#listAllBankTransfers) | **GET** /bank-transfer-payments | List all Bank Transfers |


<a name="getBankTransfer"></a>
# **getBankTransfer**
> Object getBankTransfer(bankTransferId).execute();

Retrieve a Bank Transfer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankTransferApi;
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
    String bankTransferId = "bankTransferId_example";
    try {
      Object result = client
              .bankTransfer
              .getBankTransfer(bankTransferId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankTransferApi#getBankTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bankTransfer
              .getBankTransfer(bankTransferId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BankTransferApi#getBankTransfer");
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
| **bankTransferId** | **String**|  | |

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

<a name="listAllBankTransfers"></a>
# **listAllBankTransfers**
> Object listAllBankTransfers().limit(limit).before(before).after(after).execute();

List all Bank Transfers



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BankTransferApi;
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
    String limit = "10"; // A limit on the number of objects to be returned, between 1 and 50.
    String before = "before_example"; // A cursor for use in pagination. ```before``` is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with ```obj_bar```, your subsequent call can include ```before=obj_bar``` in order to fetch the previous page of the list.
    String after = "after_example"; // A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
    try {
      Object result = client
              .bankTransfer
              .listAllBankTransfers()
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BankTransferApi#listAllBankTransfers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .bankTransfer
              .listAllBankTransfers()
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
      System.err.println("Exception when calling BankTransferApi#listAllBankTransfers");
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

