package com.shopify.model;

import static com.google.common.collect.Lists.newArrayList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.joda.time.DateTime;
import org.junit.Test;

import com.shopify.model.webhook.ShopifyWebhook;
import com.shopify.model.webhook.ShopifyWebhookFormat;
import com.shopify.model.webhook.ShopifyWebhookTopic;

public class ShopifyWebhookTest {

    private static final String SOME_ADDRESS = "http://example.com";
    private static final String SOME_API_VERSION = "2023-10";
    private static final List<String> SOME_FIELDS = newArrayList("FIELD1", "FIELD2");
    private static final ShopifyWebhookFormat SOME_FORMAT = ShopifyWebhookFormat.JSON;
    private static final ShopifyWebhookTopic SOME_TOPIC = ShopifyWebhookTopic.ORDERS_UPDATED;
    private static final DateTime SOME_DATE = new DateTime();
    private static final String SOME_ID = "someId";

    @Test
    public void givenSomeValuesWhenSettingWebhookValuesWhenCreatingShopifyWebhookThenExpectCorrectValues() throws Exception {
        final ShopifyWebhook shopifyWebhook = new ShopifyWebhook();
        shopifyWebhook.setAddress(SOME_ADDRESS);
        shopifyWebhook.setApiVersion(SOME_API_VERSION);
        shopifyWebhook.setCreatedAt(SOME_DATE);
        shopifyWebhook.setFields(SOME_FIELDS);
        shopifyWebhook.setFormat(SOME_FORMAT);
        shopifyWebhook.setId(SOME_ID);
        shopifyWebhook.setTopic(SOME_TOPIC);
        shopifyWebhook.setUpdatedAt(SOME_DATE);

        assertEquals(SOME_ADDRESS, shopifyWebhook.getAddress());
        assertEquals(SOME_API_VERSION, shopifyWebhook.getApiVersion());
        assertEquals(SOME_DATE, shopifyWebhook.getCreatedAt());
        assertEquals(SOME_FIELDS, shopifyWebhook.getFields());
        assertEquals(SOME_FORMAT, shopifyWebhook.getFormat());
        assertEquals(SOME_ID, shopifyWebhook.getId());
        assertEquals(SOME_TOPIC, shopifyWebhook.getTopic());
        assertEquals(SOME_DATE, shopifyWebhook.getUpdatedAt());

    }

}
