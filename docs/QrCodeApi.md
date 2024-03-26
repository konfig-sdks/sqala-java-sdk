# QrCodeApi

All URIs are relative to *https://api.sqala.tech/developer/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateQrCode**](QrCodeApi.md#generateQrCode) | **POST** /pix-qrcode-payments | Create a Pix QR Code |
| [**getQrCodeById**](QrCodeApi.md#getQrCodeById) | **GET** /pix-qrcode-payments/{id} | Retrieve a Pix QR Code |
| [**listAll**](QrCodeApi.md#listAll) | **GET** /pix-qrcode-payments | List all Pix QR Codes |


<a name="generateQrCode"></a>
# **generateQrCode**
> QrCodeGenerateQrCodeResponse generateQrCode().qrCodeGenerateQrCodeRequest(qrCodeGenerateQrCodeRequest).execute();

Create a Pix QR Code



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QrCodeApi;
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
    Integer amount = 56; // Amount in cents to be paid.
    String code = "code_example"; // Unique identifier for the object in your system.
    QrCodeGenerateQrCodeRequestPayer payer = new QrCodeGenerateQrCodeRequestPayer();
    List<QrCodeGenerateQrCodeRequestSplitInner> split = Arrays.asList(); // This object represents a list of recipients who will receive part of the payment.
    List<QrCodeGenerateQrCodeRequestMetadataInner> metadata = Arrays.asList(); // Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    try {
      QrCodeGenerateQrCodeResponse result = client
              .qrCode
              .generateQrCode(amount)
              .code(code)
              .payer(payer)
              .split(split)
              .metadata(metadata)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getPaidAmount());
      System.out.println(result.getPayload());
      System.out.println(result.getPayer());
      System.out.println(result.getSplit());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getPaidAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodeApi#generateQrCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QrCodeGenerateQrCodeResponse> response = client
              .qrCode
              .generateQrCode(amount)
              .code(code)
              .payer(payer)
              .split(split)
              .metadata(metadata)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodeApi#generateQrCode");
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
| **qrCodeGenerateQrCodeRequest** | [**QrCodeGenerateQrCodeRequest**](QrCodeGenerateQrCodeRequest.md)|  | [optional] |

### Return type

[**QrCodeGenerateQrCodeResponse**](QrCodeGenerateQrCodeResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getQrCodeById"></a>
# **getQrCodeById**
> QrCodeGetQrCodeByIdResponse getQrCodeById(id).execute();

Retrieve a Pix QR Code



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QrCodeApi;
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
    String id = "id_example"; // Unique identifier for the object.
    try {
      QrCodeGetQrCodeByIdResponse result = client
              .qrCode
              .getQrCodeById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCode());
      System.out.println(result.getType());
      System.out.println(result.getAmount());
      System.out.println(result.getPaidAmount());
      System.out.println(result.getPayload());
      System.out.println(result.getPayer());
      System.out.println(result.getSplit());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getProcessedAt());
      System.out.println(result.getPaidAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodeApi#getQrCodeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QrCodeGetQrCodeByIdResponse> response = client
              .qrCode
              .getQrCodeById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodeApi#getQrCodeById");
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
| **id** | **String**| Unique identifier for the object. | |

### Return type

[**QrCodeGetQrCodeByIdResponse**](QrCodeGetQrCodeByIdResponse.md)

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
> QrCodeListAllResponse listAll().limit(limit).before(before).after(after).execute();

List all Pix QR Codes



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.QrCodeApi;
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
      QrCodeListAllResponse result = client
              .qrCode
              .listAll()
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling QrCodeApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<QrCodeListAllResponse> response = client
              .qrCode
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
      System.err.println("Exception when calling QrCodeApi#listAll");
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

[**QrCodeListAllResponse**](QrCodeListAllResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

