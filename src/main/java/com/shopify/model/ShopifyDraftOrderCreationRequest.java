package com.shopify.model;

import java.util.List;

public class ShopifyDraftOrderCreationRequest {
    ShopifyDraftOrder request;

    public static interface CustomerStep {
        LineItemsStep withCustomer(final ShopifyCustomer customer);

        LineItemsStep noCustomer();
    }

    public static interface LineItemsStep {
        ShippingAddressStep withLineItems(final List<ShopifyLineItem> lineItems);
    }

    public static interface ShippingAddressStep {
        BillingAddressStep withShippingAddress(final ShopifyAddress shippingAddress);
    }

    public static interface BillingAddressStep {
        ShippingLinesStep withBillingAddress(final ShopifyAddress billingAddress);
    }

    public static interface ShippingLinesStep {
        OptionalsStep withShippingLines(List<ShopifyShippingLine> shippingLines);
    }

    public static interface OptionalsStep {
        OptionalsStep withNoteAttributes(final List<ShopifyAttribute> noteAttributes);

        OptionalsStep withStatus(String status);

        OptionalsStep withNote(final String note);

        ShopifyDraftOrderCreationRequest build();
    }

    public static CustomerStep newBuilder() {
        return new Steps();
    }

    public ShopifyDraftOrder getRequest() {
        return request;
    }

    private ShopifyDraftOrderCreationRequest(final ShopifyDraftOrder request) {
        this.request = request;
    }

    private static class Steps
            implements CustomerStep, LineItemsStep, ShippingAddressStep, BillingAddressStep, ShippingLinesStep, OptionalsStep {

        private final ShopifyDraftOrder request = new ShopifyDraftOrder();

        @Override
        public ShopifyDraftOrderCreationRequest build() {
            return new ShopifyDraftOrderCreationRequest(request);
        }

        @Override
        public ShippingAddressStep withLineItems(final List<ShopifyLineItem> lineItems) {
            request.setLineItems(lineItems);
            return this;
        }

        @Override
        public LineItemsStep withCustomer(final ShopifyCustomer customer) {
            request.setCustomer(customer);
            return this;
        }

        @Override
        public LineItemsStep noCustomer() {
            request.setCustomer(null);
            return this;
        }

        @Override
        public ShippingLinesStep withBillingAddress(final ShopifyAddress shippingAddress) {
            request.setBillingAddress(shippingAddress);
            return this;
        }

        @Override
        public BillingAddressStep withShippingAddress(final ShopifyAddress billingAddress) {
            request.setShippingAddress(billingAddress);
            return this;
        }

        @Override
        public OptionalsStep withShippingLines(final List<ShopifyShippingLine> shippingLines) {
            request.setShippingLines(shippingLines);
            return this;
        }

        @Override
        public OptionalsStep withNoteAttributes(final List<ShopifyAttribute> noteAttributes) {
            request.setNoteAttributes(noteAttributes);
            return this;
        }

        @Override
        public OptionalsStep withNote(final String note) {
            request.setNote(note);
            return this;
        }

        @Override
        public OptionalsStep withStatus(final String status) {
            request.setStatus(status);
            return this;
        }

    }
}
