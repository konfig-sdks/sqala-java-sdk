package com.konfigthis.client;

import com.konfigthis.client.api.BankTransferApi;
import com.konfigthis.client.api.ItpApi;
import com.konfigthis.client.api.QrCodeApi;
import com.konfigthis.client.api.RecipientApi;
import com.konfigthis.client.api.TokenApi;
import com.konfigthis.client.api.WebhookApi;

public class Sqala {
    private ApiClient apiClient;
    public final BankTransferApi bankTransfer;
    public final ItpApi itp;
    public final QrCodeApi qrCode;
    public final RecipientApi recipient;
    public final TokenApi token;
    public final WebhookApi webhook;

    public Sqala() {
        this(null);
    }

    public Sqala(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.bankTransfer = new BankTransferApi(this.apiClient);
        this.itp = new ItpApi(this.apiClient);
        this.qrCode = new QrCodeApi(this.apiClient);
        this.recipient = new RecipientApi(this.apiClient);
        this.token = new TokenApi(this.apiClient);
        this.webhook = new WebhookApi(this.apiClient);
    }

}
