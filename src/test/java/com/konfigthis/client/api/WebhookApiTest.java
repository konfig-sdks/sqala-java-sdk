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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.WebhookGetResponse;
import com.konfigthis.client.model.WebhookListAllResponse;
import com.konfigthis.client.model.WebhookResendAttemptResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebhookApi
 */
@Disabled
public class WebhookApiTest {

    private static WebhookApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new WebhookApi(apiClient);
    }

    /**
     * Retrieve a Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        String id = null;
        WebhookGetResponse response = api.get(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List all Webhooks
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllTest() throws ApiException {
        String status = null;
        String event = null;
        String endpointId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        WebhookListAllResponse response = api.listAll()
                .status(status)
                .event(event)
                .endpointId(endpointId)
                .limit(limit)
                .before(before)
                .after(after)
                .execute();
        // TODO: test validations
    }

    /**
     * Resend a Webhook
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendAttemptTest() throws ApiException {
        String id = null;
        WebhookResendAttemptResponse response = api.resendAttempt(id)
                .execute();
        // TODO: test validations
    }

}
