package com.shopify.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopify.model.webhook.ShopifyWebhook;
import com.shopify.model.webhook.ShopifyWebhookCreationRequest;
import com.shopify.model.webhook.ShopifyWebhookFormat;
import com.shopify.model.webhook.ShopifyWebhookTopic;

public class ShopifyWebhookCreationRequestTest {

    private static final String SOME_ADDRESS = "http://example.com";
    private static final ShopifyWebhookFormat SOME_FORMAT = ShopifyWebhookFormat.JSON;
    private static final ShopifyWebhookTopic SOME_TOPIC = ShopifyWebhookTopic.ORDERS_UPDATED;

    @Test
    public void givenSomeOrderIdAndSomeTrackingNumberAndSomeTrackingCompanyAndSomeLineItemsWhenCreatingWebhookCreationRequestThenReturnCorrectRequest() {
        final ShopifyWebhookCreationRequest shopifyWebhookCreationRequest = ShopifyWebhookCreationRequest.newBuilder()
                .withAddress(SOME_ADDRESS).withTopic(SOME_TOPIC).withFormat(SOME_FORMAT).build();

        final ShopifyWebhook actualRequest = shopifyWebhookCreationRequest.getRequest();

        assertEquals(SOME_ADDRESS, actualRequest.getAddress());
        assertEquals(SOME_FORMAT, actualRequest.getFormat());
        assertEquals(SOME_TOPIC, actualRequest.getTopic());
    }

}
