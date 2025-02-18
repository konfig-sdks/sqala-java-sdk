/*
 * Developer API
 * At Sqala, we believe that everyone deserves access to financial services, and we are committed to providing secure and reliable payment solutions to clients who may have been overlooked by traditional financial institutions.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.QrCodeGenerateQrCodeRequest;
import com.konfigthis.client.model.QrCodeGenerateQrCodeRequestMetadataInner;
import com.konfigthis.client.model.QrCodeGenerateQrCodeRequestPayer;
import com.konfigthis.client.model.QrCodeGenerateQrCodeRequestSplitInner;
import com.konfigthis.client.model.QrCodeGenerateQrCodeResponse;
import com.konfigthis.client.model.QrCodeGetQrCodeByIdResponse;
import com.konfigthis.client.model.QrCodeListAllResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class QrCodeApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QrCodeApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public QrCodeApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call generateQrCodeCall(QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = qrCodeGenerateQrCodeRequest;

        // create path and map variables
        String localVarPath = "/pix-qrcode-payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateQrCodeValidateBeforeCall(QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest, final ApiCallback _callback) throws ApiException {
        return generateQrCodeCall(qrCodeGenerateQrCodeRequest, _callback);

    }


    private ApiResponse<QrCodeGenerateQrCodeResponse> generateQrCodeWithHttpInfo(QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest) throws ApiException {
        okhttp3.Call localVarCall = generateQrCodeValidateBeforeCall(qrCodeGenerateQrCodeRequest, null);
        Type localVarReturnType = new TypeToken<QrCodeGenerateQrCodeResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateQrCodeAsync(QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest, final ApiCallback<QrCodeGenerateQrCodeResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateQrCodeValidateBeforeCall(qrCodeGenerateQrCodeRequest, _callback);
        Type localVarReturnType = new TypeToken<QrCodeGenerateQrCodeResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateQrCodeRequestBuilder {
        private final Integer amount;
        private String code;
        private QrCodeGenerateQrCodeRequestPayer payer;
        private List<QrCodeGenerateQrCodeRequestSplitInner> split;
        private List<QrCodeGenerateQrCodeRequestMetadataInner> metadata;

        private GenerateQrCodeRequestBuilder(Integer amount) {
            this.amount = amount;
        }

        /**
         * Set code
         * @param code Unique identifier for the object in your system. (optional)
         * @return GenerateQrCodeRequestBuilder
         */
        public GenerateQrCodeRequestBuilder code(String code) {
            this.code = code;
            return this;
        }
        
        /**
         * Set payer
         * @param payer  (optional)
         * @return GenerateQrCodeRequestBuilder
         */
        public GenerateQrCodeRequestBuilder payer(QrCodeGenerateQrCodeRequestPayer payer) {
            this.payer = payer;
            return this;
        }
        
        /**
         * Set split
         * @param split This object represents a list of recipients who will receive part of the payment. (optional)
         * @return GenerateQrCodeRequestBuilder
         */
        public GenerateQrCodeRequestBuilder split(List<QrCodeGenerateQrCodeRequestSplitInner> split) {
            this.split = split;
            return this;
        }
        
        /**
         * Set metadata
         * @param metadata Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. (optional)
         * @return GenerateQrCodeRequestBuilder
         */
        public GenerateQrCodeRequestBuilder metadata(List<QrCodeGenerateQrCodeRequestMetadataInner> metadata) {
            this.metadata = metadata;
            return this;
        }
        
        /**
         * Build call for generateQrCode
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest = buildBodyParams();
            return generateQrCodeCall(qrCodeGenerateQrCodeRequest, _callback);
        }

        private QrCodeGenerateQrCodeRequest buildBodyParams() {
            QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest = new QrCodeGenerateQrCodeRequest();
            qrCodeGenerateQrCodeRequest.code(this.code);
            qrCodeGenerateQrCodeRequest.amount(this.amount);
            qrCodeGenerateQrCodeRequest.payer(this.payer);
            qrCodeGenerateQrCodeRequest.split(this.split);
            qrCodeGenerateQrCodeRequest.metadata(this.metadata);
            return qrCodeGenerateQrCodeRequest;
        }

        /**
         * Execute generateQrCode request
         * @return QrCodeGenerateQrCodeResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public QrCodeGenerateQrCodeResponse execute() throws ApiException {
            QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest = buildBodyParams();
            ApiResponse<QrCodeGenerateQrCodeResponse> localVarResp = generateQrCodeWithHttpInfo(qrCodeGenerateQrCodeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generateQrCode request with HTTP info returned
         * @return ApiResponse&lt;QrCodeGenerateQrCodeResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<QrCodeGenerateQrCodeResponse> executeWithHttpInfo() throws ApiException {
            QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest = buildBodyParams();
            return generateQrCodeWithHttpInfo(qrCodeGenerateQrCodeRequest);
        }

        /**
         * Execute generateQrCode request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<QrCodeGenerateQrCodeResponse> _callback) throws ApiException {
            QrCodeGenerateQrCodeRequest qrCodeGenerateQrCodeRequest = buildBodyParams();
            return generateQrCodeAsync(qrCodeGenerateQrCodeRequest, _callback);
        }
    }

    /**
     * Create a Pix QR Code
     * 
     * @return GenerateQrCodeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GenerateQrCodeRequestBuilder generateQrCode(Integer amount) throws IllegalArgumentException {
        if (amount == null) throw new IllegalArgumentException("\"amount\" is required but got null");
        return new GenerateQrCodeRequestBuilder(amount);
    }
    private okhttp3.Call getQrCodeByIdCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pix-qrcode-payments/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getQrCodeByIdValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getQrCodeById(Async)");
        }

        return getQrCodeByIdCall(id, _callback);

    }


    private ApiResponse<QrCodeGetQrCodeByIdResponse> getQrCodeByIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getQrCodeByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<QrCodeGetQrCodeByIdResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getQrCodeByIdAsync(String id, final ApiCallback<QrCodeGetQrCodeByIdResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQrCodeByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<QrCodeGetQrCodeByIdResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetQrCodeByIdRequestBuilder {
        private final String id;

        private GetQrCodeByIdRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Build call for getQrCodeById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getQrCodeByIdCall(id, _callback);
        }


        /**
         * Execute getQrCodeById request
         * @return QrCodeGetQrCodeByIdResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public QrCodeGetQrCodeByIdResponse execute() throws ApiException {
            ApiResponse<QrCodeGetQrCodeByIdResponse> localVarResp = getQrCodeByIdWithHttpInfo(id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getQrCodeById request with HTTP info returned
         * @return ApiResponse&lt;QrCodeGetQrCodeByIdResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<QrCodeGetQrCodeByIdResponse> executeWithHttpInfo() throws ApiException {
            return getQrCodeByIdWithHttpInfo(id);
        }

        /**
         * Execute getQrCodeById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<QrCodeGetQrCodeByIdResponse> _callback) throws ApiException {
            return getQrCodeByIdAsync(id, _callback);
        }
    }

    /**
     * Retrieve a Pix QR Code
     * 
     * @param id Unique identifier for the object. (required)
     * @return GetQrCodeByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetQrCodeByIdRequestBuilder getQrCodeById(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetQrCodeByIdRequestBuilder(id);
    }
    private okhttp3.Call listAllCall(Integer limit, String before, String after, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/pix-qrcode-payments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (before != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("before", before));
        }

        if (after != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("after", after));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllValidateBeforeCall(Integer limit, String before, String after, final ApiCallback _callback) throws ApiException {
        return listAllCall(limit, before, after, _callback);

    }


    private ApiResponse<QrCodeListAllResponse> listAllWithHttpInfo(Integer limit, String before, String after) throws ApiException {
        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, before, after, null);
        Type localVarReturnType = new TypeToken<QrCodeListAllResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listAllAsync(Integer limit, String before, String after, final ApiCallback<QrCodeListAllResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAllValidateBeforeCall(limit, before, after, _callback);
        Type localVarReturnType = new TypeToken<QrCodeListAllResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListAllRequestBuilder {
        private Integer limit;
        private String before;
        private String after;

        private ListAllRequestBuilder() {
        }

        /**
         * Set limit
         * @param limit A limit on the number of objects to be returned, between 1 and 50. (optional, default to 10)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder limit(Integer limit) {
            this.limit = limit;
            return this;
        }
        
        /**
         * Set before
         * @param before A cursor for use in pagination. &#x60;&#x60;&#x60;before&#x60;&#x60;&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, starting with &#x60;&#x60;&#x60;obj_bar&#x60;&#x60;&#x60;, your subsequent call can include &#x60;&#x60;&#x60;before&#x3D;obj_bar&#x60;&#x60;&#x60; in order to fetch the previous page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder before(String before) {
            this.before = before;
            return this;
        }
        
        /**
         * Set after
         * @param after A cursor for use in pagination. after is an object ID that defines your place in the list. For instance, if you make a list request and receive 50 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. (optional)
         * @return ListAllRequestBuilder
         */
        public ListAllRequestBuilder after(String after) {
            this.after = after;
            return this;
        }
        
        /**
         * Build call for listAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listAllCall(limit, before, after, _callback);
        }


        /**
         * Execute listAll request
         * @return QrCodeListAllResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public QrCodeListAllResponse execute() throws ApiException {
            ApiResponse<QrCodeListAllResponse> localVarResp = listAllWithHttpInfo(limit, before, after);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listAll request with HTTP info returned
         * @return ApiResponse&lt;QrCodeListAllResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<QrCodeListAllResponse> executeWithHttpInfo() throws ApiException {
            return listAllWithHttpInfo(limit, before, after);
        }

        /**
         * Execute listAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<QrCodeListAllResponse> _callback) throws ApiException {
            return listAllAsync(limit, before, after, _callback);
        }
    }

    /**
     * List all Pix QR Codes
     * 
     * @return ListAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public ListAllRequestBuilder listAll() throws IllegalArgumentException {
        return new ListAllRequestBuilder();
    }
}
