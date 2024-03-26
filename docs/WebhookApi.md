# WebhookApi

All URIs are relative to *https://api.sqala.tech/developer/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**get**](WebhookApi.md#get) | **GET** /webhooks/{id} | Retrieve a Webhook |
| [**listAll**](WebhookApi.md#listAll) | **GET** /webhooks | List all Webhooks |
| [**resendAttempt**](WebhookApi.md#resendAttempt) | **POST** /webhooks/{id}/attempts | Resend a Webhook |


<a name="get"></a>
# **get**
> WebhookGetResponse get(id).execute();

Retrieve a Webhook



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
      WebhookGetResponse result = client
              .webhook
              .get(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponses());
      System.out.println(result.getId());
      System.out.println(result.getEvent());
      System.out.println(result.getObject());
      System.out.println(result.getSignature());
      System.out.println(result.getData());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getQueuedAt());
      System.out.println(result.getDeliveredAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getLastAttemptAt());
      System.out.println(result.getNextAttemptAt());
      System.out.println(result.getEndpointId());
      System.out.println(result.getOrganizationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#get");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookGetResponse> response = client
              .webhook
              .get(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#get");
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

[**WebhookGetResponse**](WebhookGetResponse.md)

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
> WebhookListAllResponse listAll().status(status).event(event).endpointId(endpointId).limit(limit).before(before).after(after).execute();

List all Webhooks



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
    String status = "PENDING";
    String event = "event_example";
    String endpointId = "endpointId_example";
    Integer limit = 10; // A limit on the number of objects to be returned, between 1 and 50.
    String before = "before_example"; // A cursor for use in pagination. ```before``` is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with ```obj_bar```, your subsequent call can include ```before=obj_bar``` in order to fetch the previous page of the list.
    String after = "after_example"; // A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
    try {
      WebhookListAllResponse result = client
              .webhook
              .listAll()
              .status(status)
              .event(event)
              .endpointId(endpointId)
              .limit(limit)
              .before(before)
              .after(after)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getPaging());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#listAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookListAllResponse> response = client
              .webhook
              .listAll()
              .status(status)
              .event(event)
              .endpointId(endpointId)
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
      System.err.println("Exception when calling WebhookApi#listAll");
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
| **status** | **String**|  | [optional] [enum: PENDING, QUEUED, DELIVERED, FAILED] |
| **event** | **String**|  | [optional] |
| **endpointId** | **String**|  | [optional] |
| **limit** | **Integer**| A limit on the number of objects to be returned, between 1 and 50. | [optional] [default to 10] |
| **before** | **String**| A cursor for use in pagination. &#x60;&#x60;&#x60;before&#x60;&#x60;&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with &#x60;&#x60;&#x60;obj_bar&#x60;&#x60;&#x60;, your subsequent call can include &#x60;&#x60;&#x60;before&#x3D;obj_bar&#x60;&#x60;&#x60; in order to fetch the previous page of the list. | [optional] |
| **after** | **String**| A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. | [optional] |

### Return type

[**WebhookListAllResponse**](WebhookListAllResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="resendAttempt"></a>
# **resendAttempt**
> WebhookResendAttemptResponse resendAttempt(id).execute();

Resend a Webhook



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Sqala;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WebhookApi;
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
      WebhookResendAttemptResponse result = client
              .webhook
              .resendAttempt(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getResponses());
      System.out.println(result.getId());
      System.out.println(result.getEvent());
      System.out.println(result.getObject());
      System.out.println(result.getSignature());
      System.out.println(result.getData());
      System.out.println(result.getStatus());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getQueuedAt());
      System.out.println(result.getDeliveredAt());
      System.out.println(result.getFailedAt());
      System.out.println(result.getLastAttemptAt());
      System.out.println(result.getNextAttemptAt());
      System.out.println(result.getEndpointId());
      System.out.println(result.getOrganizationId());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#resendAttempt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<WebhookResendAttemptResponse> response = client
              .webhook
              .resendAttempt(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#resendAttempt");
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

[**WebhookResendAttemptResponse**](WebhookResendAttemptResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

