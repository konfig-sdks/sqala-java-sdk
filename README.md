<div align="left">

[![Visit Sqala](./header.png)](https://www.sqala.tech&#x2F;)

# [Sqala](https://www.sqala.tech&#x2F;)

At Sqala, we believe that everyone deserves access to financial services, and we are committed to providing secure and reliable payment solutions to clients who may have been overlooked by traditional financial institutions.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Sqala&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>sqala-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:sqala-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sqala-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.sqala.tech/developer/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BankTransferApi* | [**getBankTransfer**](docs/BankTransferApi.md#getBankTransfer) | **GET** /bank-transfer-payments/{bankTransferId} | Retrieve a Bank Transfer
*BankTransferApi* | [**listAllBankTransfers**](docs/BankTransferApi.md#listAllBankTransfers) | **GET** /bank-transfer-payments | List all Bank Transfers
*ItpApi* | [**createPaymentInstruction**](docs/ItpApi.md#createPaymentInstruction) | **POST** /itp-payments | Create an ITP
*ItpApi* | [**getItp**](docs/ItpApi.md#getItp) | **GET** /itp-payments/{id} | Retrieve an ITP
*ItpApi* | [**listAll**](docs/ItpApi.md#listAll) | **GET** /itp-payments | List all ITPs
*QrCodeApi* | [**generateQrCode**](docs/QrCodeApi.md#generateQrCode) | **POST** /pix-qrcode-payments | Create a Pix QR Code
*QrCodeApi* | [**getQrCodeById**](docs/QrCodeApi.md#getQrCodeById) | **GET** /pix-qrcode-payments/{id} | Retrieve a Pix QR Code
*QrCodeApi* | [**listAll**](docs/QrCodeApi.md#listAll) | **GET** /pix-qrcode-payments | List all Pix QR Codes
*RecipientApi* | [**createBankAccount**](docs/RecipientApi.md#createBankAccount) | **POST** /recipients/{recipientId}/bank-accounts | Create a Bank Account
*RecipientApi* | [**createRecipient**](docs/RecipientApi.md#createRecipient) | **POST** /recipients | Create a Recipient
*RecipientApi* | [**createWithdrawal**](docs/RecipientApi.md#createWithdrawal) | **POST** /recipients/{recipientId}/withdrawals | Create a Withdrawal
*RecipientApi* | [**deleteBankAccount**](docs/RecipientApi.md#deleteBankAccount) | **DELETE** /recipients/{recipientId}/bank-accounts/{bankAccountId} | Delete a Bank Account
*RecipientApi* | [**getBalance**](docs/RecipientApi.md#getBalance) | **GET** /recipients/{recipientId}/balance | Get Balance
*RecipientApi* | [**getBankAccount**](docs/RecipientApi.md#getBankAccount) | **GET** /recipients/{recipientId}/bank-accounts/{bankAccountId} | Retrieve a Bank Account
*RecipientApi* | [**getById**](docs/RecipientApi.md#getById) | **GET** /recipients/{id} | Retrieve a Recipient
*RecipientApi* | [**getWithdrawalById**](docs/RecipientApi.md#getWithdrawalById) | **GET** /recipients/{recipientId}/withdrawals/{withdrawalId} | Retrieve a Withdrawal
*RecipientApi* | [**listAll**](docs/RecipientApi.md#listAll) | **GET** /recipients | List all Recipients
*RecipientApi* | [**listBankAccounts**](docs/RecipientApi.md#listBankAccounts) | **GET** /recipients/{recipientId}/bank-accounts | List all Bank Accounts
*RecipientApi* | [**listTransactions**](docs/RecipientApi.md#listTransactions) | **GET** /recipients/{recipientId}/transactions | List all Transactions
*RecipientApi* | [**listWithdrawals**](docs/RecipientApi.md#listWithdrawals) | **GET** /recipients/{recipientId}/withdrawals | List all Withdrawals
*RecipientApi* | [**updateRecipientById**](docs/RecipientApi.md#updateRecipientById) | **PUT** /recipients/{id} | Update a Recipient
*TokenApi* | [**generateAccessToken**](docs/TokenApi.md#generateAccessToken) | **POST** /access-tokens | Create an Access Token
*WebhookApi* | [**get**](docs/WebhookApi.md#get) | **GET** /webhooks/{id} | Retrieve a Webhook
*WebhookApi* | [**listAll**](docs/WebhookApi.md#listAll) | **GET** /webhooks | List all Webhooks
*WebhookApi* | [**resendAttempt**](docs/WebhookApi.md#resendAttempt) | **POST** /webhooks/{id}/attempts | Resend a Webhook


## Documentation for Models

 - [ItpCreatePaymentInstructionRequest](docs/ItpCreatePaymentInstructionRequest.md)
 - [ItpCreatePaymentInstructionResponse](docs/ItpCreatePaymentInstructionResponse.md)
 - [ItpCreatePaymentInstructionResponseMetadataInner](docs/ItpCreatePaymentInstructionResponseMetadataInner.md)
 - [ItpCreatePaymentInstructionResponsePayer](docs/ItpCreatePaymentInstructionResponsePayer.md)
 - [ItpCreatePaymentInstructionResponseSplitInner](docs/ItpCreatePaymentInstructionResponseSplitInner.md)
 - [ItpGetItpResponse](docs/ItpGetItpResponse.md)
 - [ItpGetItpResponseMetadataInner](docs/ItpGetItpResponseMetadataInner.md)
 - [ItpGetItpResponsePayer](docs/ItpGetItpResponsePayer.md)
 - [ItpGetItpResponseSplitInner](docs/ItpGetItpResponseSplitInner.md)
 - [ItpListAllResponse](docs/ItpListAllResponse.md)
 - [ItpListAllResponseDataInner](docs/ItpListAllResponseDataInner.md)
 - [ItpListAllResponseDataInnerMetadataInner](docs/ItpListAllResponseDataInnerMetadataInner.md)
 - [ItpListAllResponseDataInnerPayer](docs/ItpListAllResponseDataInnerPayer.md)
 - [ItpListAllResponseDataInnerSplitInner](docs/ItpListAllResponseDataInnerSplitInner.md)
 - [ItpListAllResponsePaging](docs/ItpListAllResponsePaging.md)
 - [QrCodeGenerateQrCodeRequest](docs/QrCodeGenerateQrCodeRequest.md)
 - [QrCodeGenerateQrCodeRequestMetadataInner](docs/QrCodeGenerateQrCodeRequestMetadataInner.md)
 - [QrCodeGenerateQrCodeRequestPayer](docs/QrCodeGenerateQrCodeRequestPayer.md)
 - [QrCodeGenerateQrCodeRequestSplitInner](docs/QrCodeGenerateQrCodeRequestSplitInner.md)
 - [QrCodeGenerateQrCodeResponse](docs/QrCodeGenerateQrCodeResponse.md)
 - [QrCodeGenerateQrCodeResponseMetadataInner](docs/QrCodeGenerateQrCodeResponseMetadataInner.md)
 - [QrCodeGenerateQrCodeResponsePayer](docs/QrCodeGenerateQrCodeResponsePayer.md)
 - [QrCodeGenerateQrCodeResponseSplitInner](docs/QrCodeGenerateQrCodeResponseSplitInner.md)
 - [QrCodeGetQrCodeByIdResponse](docs/QrCodeGetQrCodeByIdResponse.md)
 - [QrCodeGetQrCodeByIdResponseMetadataInner](docs/QrCodeGetQrCodeByIdResponseMetadataInner.md)
 - [QrCodeGetQrCodeByIdResponsePayer](docs/QrCodeGetQrCodeByIdResponsePayer.md)
 - [QrCodeGetQrCodeByIdResponseSplitInner](docs/QrCodeGetQrCodeByIdResponseSplitInner.md)
 - [QrCodeListAllResponse](docs/QrCodeListAllResponse.md)
 - [QrCodeListAllResponseDataInner](docs/QrCodeListAllResponseDataInner.md)
 - [QrCodeListAllResponseDataInnerMetadataInner](docs/QrCodeListAllResponseDataInnerMetadataInner.md)
 - [QrCodeListAllResponseDataInnerPayer](docs/QrCodeListAllResponseDataInnerPayer.md)
 - [QrCodeListAllResponseDataInnerSplitInner](docs/QrCodeListAllResponseDataInnerSplitInner.md)
 - [QrCodeListAllResponsePaging](docs/QrCodeListAllResponsePaging.md)
 - [RecipientCreateBankAccountRequest](docs/RecipientCreateBankAccountRequest.md)
 - [RecipientCreateBankAccountResponse](docs/RecipientCreateBankAccountResponse.md)
 - [RecipientCreateBankAccountResponseMetadata](docs/RecipientCreateBankAccountResponseMetadata.md)
 - [RecipientCreateRecipientRequest](docs/RecipientCreateRecipientRequest.md)
 - [RecipientCreateWithdrawalRequest](docs/RecipientCreateWithdrawalRequest.md)
 - [RecipientCreateWithdrawalRequestBankAccount](docs/RecipientCreateWithdrawalRequestBankAccount.md)
 - [RecipientCreateWithdrawalResponse](docs/RecipientCreateWithdrawalResponse.md)
 - [RecipientCreateWithdrawalResponseBankAccount](docs/RecipientCreateWithdrawalResponseBankAccount.md)
 - [RecipientCreateWithdrawalResponseMetadata](docs/RecipientCreateWithdrawalResponseMetadata.md)
 - [RecipientCreateWithdrawalResponseRecipient](docs/RecipientCreateWithdrawalResponseRecipient.md)
 - [RecipientDeleteBankAccountResponse](docs/RecipientDeleteBankAccountResponse.md)
 - [RecipientDeleteBankAccountResponseMetadata](docs/RecipientDeleteBankAccountResponseMetadata.md)
 - [RecipientGetBankAccountResponse](docs/RecipientGetBankAccountResponse.md)
 - [RecipientGetBankAccountResponseMetadata](docs/RecipientGetBankAccountResponseMetadata.md)
 - [RecipientGetWithdrawalByIdResponse](docs/RecipientGetWithdrawalByIdResponse.md)
 - [RecipientGetWithdrawalByIdResponseBankAccount](docs/RecipientGetWithdrawalByIdResponseBankAccount.md)
 - [RecipientGetWithdrawalByIdResponseMetadata](docs/RecipientGetWithdrawalByIdResponseMetadata.md)
 - [RecipientGetWithdrawalByIdResponseRecipient](docs/RecipientGetWithdrawalByIdResponseRecipient.md)
 - [RecipientListAllResponse](docs/RecipientListAllResponse.md)
 - [RecipientListAllResponseDataInner](docs/RecipientListAllResponseDataInner.md)
 - [RecipientListAllResponseDataInnerMetadata](docs/RecipientListAllResponseDataInnerMetadata.md)
 - [RecipientListAllResponsePaging](docs/RecipientListAllResponsePaging.md)
 - [RecipientListBankAccountsResponse](docs/RecipientListBankAccountsResponse.md)
 - [RecipientListBankAccountsResponseDataInner](docs/RecipientListBankAccountsResponseDataInner.md)
 - [RecipientListBankAccountsResponseDataInnerMetadata](docs/RecipientListBankAccountsResponseDataInnerMetadata.md)
 - [RecipientListBankAccountsResponsePaging](docs/RecipientListBankAccountsResponsePaging.md)
 - [RecipientListWithdrawalsResponse](docs/RecipientListWithdrawalsResponse.md)
 - [RecipientListWithdrawalsResponseDataInner](docs/RecipientListWithdrawalsResponseDataInner.md)
 - [RecipientListWithdrawalsResponseDataInnerBankAccount](docs/RecipientListWithdrawalsResponseDataInnerBankAccount.md)
 - [RecipientListWithdrawalsResponseDataInnerMetadata](docs/RecipientListWithdrawalsResponseDataInnerMetadata.md)
 - [RecipientListWithdrawalsResponseDataInnerRecipient](docs/RecipientListWithdrawalsResponseDataInnerRecipient.md)
 - [RecipientListWithdrawalsResponsePaging](docs/RecipientListWithdrawalsResponsePaging.md)
 - [TokenGenerateAccessTokenRequest](docs/TokenGenerateAccessTokenRequest.md)
 - [TokenGenerateAccessTokenResponse](docs/TokenGenerateAccessTokenResponse.md)
 - [WebhookGetResponse](docs/WebhookGetResponse.md)
 - [WebhookGetResponseData](docs/WebhookGetResponseData.md)
 - [WebhookGetResponseDataDestination](docs/WebhookGetResponseDataDestination.md)
 - [WebhookGetResponseDataPayer](docs/WebhookGetResponseDataPayer.md)
 - [WebhookGetResponseDataSource](docs/WebhookGetResponseDataSource.md)
 - [WebhookGetResponseObject](docs/WebhookGetResponseObject.md)
 - [WebhookGetResponseResponsesInner](docs/WebhookGetResponseResponsesInner.md)
 - [WebhookListAllResponse](docs/WebhookListAllResponse.md)
 - [WebhookListAllResponseDataInner](docs/WebhookListAllResponseDataInner.md)
 - [WebhookListAllResponseDataInnerData](docs/WebhookListAllResponseDataInnerData.md)
 - [WebhookListAllResponseDataInnerDataDestination](docs/WebhookListAllResponseDataInnerDataDestination.md)
 - [WebhookListAllResponseDataInnerDataPayer](docs/WebhookListAllResponseDataInnerDataPayer.md)
 - [WebhookListAllResponseDataInnerDataSource](docs/WebhookListAllResponseDataInnerDataSource.md)
 - [WebhookListAllResponseDataInnerObject](docs/WebhookListAllResponseDataInnerObject.md)
 - [WebhookListAllResponseDataInnerResponsesInner](docs/WebhookListAllResponseDataInnerResponsesInner.md)
 - [WebhookListAllResponsePaging](docs/WebhookListAllResponsePaging.md)
 - [WebhookResendAttemptResponse](docs/WebhookResendAttemptResponse.md)
 - [WebhookResendAttemptResponseData](docs/WebhookResendAttemptResponseData.md)
 - [WebhookResendAttemptResponseDataDestination](docs/WebhookResendAttemptResponseDataDestination.md)
 - [WebhookResendAttemptResponseDataPayer](docs/WebhookResendAttemptResponseDataPayer.md)
 - [WebhookResendAttemptResponseDataSource](docs/WebhookResendAttemptResponseDataSource.md)
 - [WebhookResendAttemptResponseObject](docs/WebhookResendAttemptResponseObject.md)
 - [WebhookResendAttemptResponseResponsesInner](docs/WebhookResendAttemptResponseResponsesInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
