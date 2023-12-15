package com.shopify.model.webhook;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyWebhooksRoot {
    private List<ShopifyWebhook> webhooks = new LinkedList<>();

    public List<ShopifyWebhook> getWebhooks() {
        return webhooks;
    }

    public void setWebhooks(List<ShopifyWebhook> webhooks) {
        this.webhooks = webhooks;
    }

}
