# TokenApi

All URIs are relative to *https://api.sqala.tech/developer/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateAccessToken**](TokenApi.md#generateAccessToken) | **POST** /access-tokens | Create an Access Token |


<a name="generateAccessToken"></a>
# **generateAccessToken**
> TokenGenerateAccessTokenResponse generateAccessToken().tokenGenerateAccessTokenRequest(tokenGenerateAccessTokenRequest).execute();

Create an Access Token



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TokenApi;
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
    String refreshToken = "refreshToken_example"; // The Refresh Token is used to get a new Access Token, when the old one expires.
    try {
      TokenGenerateAccessTokenResponse result = client
              .token
              .generateAccessToken(refreshToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getExpiresIn());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TokenGenerateAccessTokenResponse> response = client
              .token
              .generateAccessToken(refreshToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TokenApi#generateAccessToken");
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
| **tokenGenerateAccessTokenRequest** | [**TokenGenerateAccessTokenRequest**](TokenGenerateAccessTokenRequest.md)|  | [optional] |

### Return type

[**TokenGenerateAccessTokenResponse**](TokenGenerateAccessTokenResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

