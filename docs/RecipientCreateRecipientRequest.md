

# RecipientCreateRecipientRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Unique identifier for the object in your system. |  [optional] |
|**name** | **String** | The name of the recipient. |  |
|**taxId** | **String** | The tax ID of the recipient (CPF for individual recipients or CNPJ for businesses recipients). |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of the recipient. |  |
|**metadata** | [**List&lt;QrCodeGenerateQrCodeRequestMetadataInner&gt;**](QrCodeGenerateQrCodeRequestMetadataInner.md) | Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| COMPANY | &quot;COMPANY&quot; |



