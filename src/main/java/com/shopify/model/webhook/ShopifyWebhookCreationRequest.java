package com.shopify.model.webhook;

public class ShopifyWebhookCreationRequest {
    ShopifyWebhook request;

    public static interface AddressStep {
        TopicStep withAddress(final String address);
    }

    public static interface TopicStep {
        FormatStep withTopic(final ShopifyWebhookTopic topic);
    }

    public static interface FormatStep {
        BuildStep withFormat(final ShopifyWebhookFormat format);
    }

    public static interface BuildStep {
        ShopifyWebhookCreationRequest build();
    }

    public static AddressStep newBuilder() {
        return new Steps();
    }

    public ShopifyWebhook getRequest() {
        return request;
    }

    private ShopifyWebhookCreationRequest(final ShopifyWebhook request) {
        this.request = request;
    }

    private static class Steps implements AddressStep, TopicStep, FormatStep, BuildStep {

        private final ShopifyWebhook request = new ShopifyWebhook();

        @Override
        public ShopifyWebhookCreationRequest build() {
            return new ShopifyWebhookCreationRequest(request);
        }

        @Override
        public TopicStep withAddress(String address) {
            request.setAddress(address);
            return this;
        }

        @Override
        public FormatStep withTopic(ShopifyWebhookTopic topic) {
            request.setTopic(topic);
            return this;
        }

        @Override
        public BuildStep withFormat(ShopifyWebhookFormat format) {
            request.setFormat(format);
            return this;
        }

    }
}
