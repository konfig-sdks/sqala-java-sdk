

# RecipientCreateWithdrawalRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique identifier for the object in your system. |  [optional] |
|**amount** | **Integer** | Amount in cents to be transferred. |  |
|**method** | [**MethodEnum**](#MethodEnum) | The method of the withdrawal. |  |
|**pixKey** | **String** | The PIX key of the destination bank account. Required if method is PIX |  [optional] |
|**bankAccount** | [**RecipientCreateWithdrawalRequestBankAccount**](RecipientCreateWithdrawalRequestBankAccount.md) |  |  [optional] |
|**bankAccountId** | **String** | The ID of the destination bank account. Required if method is STANDARD. |  [optional] |
|**metadata** | [**List&lt;QrCodeGenerateQrCodeRequestMetadataInner&gt;**](QrCodeGenerateQrCodeRequestMetadataInner.md) | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;STANDARD&quot; |
| PIX | &quot;PIX&quot; |



