

# QrCodeGenerateQrCodeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique identifier for the object in your system. |  [optional] |
|**amount** | **Integer** | Amount in cents to be paid. |  |
|**payer** | [**QrCodeGenerateQrCodeRequestPayer**](QrCodeGenerateQrCodeRequestPayer.md) |  |  [optional] |
|**split** | [**List&lt;QrCodeGenerateQrCodeRequestSplitInner&gt;**](QrCodeGenerateQrCodeRequestSplitInner.md) | This object represents a list of recipients who will receive part of the payment. |  [optional] |
|**metadata** | [**List&lt;QrCodeGenerateQrCodeRequestMetadataInner&gt;**](QrCodeGenerateQrCodeRequestMetadataInner.md) | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



