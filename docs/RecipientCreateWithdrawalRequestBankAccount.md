

# RecipientCreateWithdrawalRequestBankAccount

The destination bank account. Required if method is STANDARD.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of bank account. Can be CHEKING or SAVINGS. |  [optional] |
|**holderName** | **String** | The name of the person or business that owns the bank account. |  |
|**holderTaxId** | **String** | The tax ID of the account holder (CPF for individual account holders or CNPJ for businesses account holders). |  |
|**holderType** | [**HolderTypeEnum**](#HolderTypeEnum) | The type of entity that holds the account. Can be INDIVIDUAL or COMPANY. |  |
|**branchNumber** | **String** |  |  |
|**accountNumber** | **String** |  |  |
|**bankId** | **String** | The ID of the bank associated with the account. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CHECKING | &quot;CHECKING&quot; |
| SAVINGS | &quot;SAVINGS&quot; |



## Enum: HolderTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| COMPANY | &quot;COMPANY&quot; |



