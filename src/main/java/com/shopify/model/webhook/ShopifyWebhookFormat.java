package com.shopify.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShopifyWebhookFormat {
    // @formatter:off
    @JsonProperty(value = "json")
    JSON,
    @JsonProperty(value = "xml")
    XML;
    // @formatter:on
}
