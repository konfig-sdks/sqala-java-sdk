package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.sqala.tech/developer/v1";
        
        // Configure HTTP basic authorization: sec0
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        Sqala client = new Sqala(configuration);
        assertNotNull(client);
    }
}
