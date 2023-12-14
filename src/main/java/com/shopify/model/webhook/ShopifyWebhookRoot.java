package com.shopify.model.webhook;

import javax.xml.bind.annotation.XmlElement;

public class ShopifyWebhookRoot {

    private ShopifyWebhook webhook;

    public ShopifyWebhook getWebhook() {
        return webhook;
    }

    public void setWebhook(ShopifyWebhook webhook) {
        this.webhook = webhook;
    }

}
