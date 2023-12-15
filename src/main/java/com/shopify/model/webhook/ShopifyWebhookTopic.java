package com.shopify.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ShopifyWebhookTopic {
    // @formatter:off
    @JsonProperty(value =  "app/uninstalled")
    APP_UNINSTALLED,
    @JsonProperty(value = "app_subscriptions/update")
    APP_SUBSCRIPTION_UPDATE,
    @JsonProperty(value = "bulk_operations/finish")
    BULK_OPERATION_FINISH,
    @JsonProperty(value = "carts/create")
    CARTS_CREATE,
    @JsonProperty(value = "carts/update")
    CARTS_UPDATE,
    @JsonProperty(value = "checkouts/create")
    CHECKOUTS_CREATE,
    @JsonProperty(value = "checkouts/delete")
    CHECKOUTS_DELETE,
    @JsonProperty(value = "checkouts/update")
    CHECKOUTS_UPDATE,
    @JsonProperty(value = "collection_listings/add")
    COLLECTION_LISTINGS_ADD,
    @JsonProperty(value = "collection_listings/remove")
    COLLECTION_LISTINGS_REMOVE,
    @JsonProperty(value = "collection_listings/update")
    COLLECTION_LISTINGS_UPDATE,
    @JsonProperty(value = "collections/create")
    COLLECTIONS_CREATE,
    @JsonProperty(value = "collections/delete")
    COLLECTIONS_DELETE,
    @JsonProperty(value = "collections/update")
    COLLECTIONS_UPDATE,
    @JsonProperty(value = "customer_payment_methods/create")
    CUSTOMER_PAYMENT_METHODS_CREATE,
    @JsonProperty(value = "customer_payment_methods/revoke")
    CUSTOMER_PAYMENT_METHODS_REVOKE,
    @JsonProperty(value = "customer_payment_methods/update")
    CUSTOMER_PAYMENT_METHODS_UPDATE,
    @JsonProperty(value = "customers/create")
    CUSTOMERS_CREATE,
    @JsonProperty(value = "customers/delete")
    CUSTOMERS_DELETE,
    @JsonProperty(value = "customers/disable")
    CUSTOMERS_DISABLE,
    @JsonProperty(value = "customers/enable")
    CUSTOMERS_ENABLE,
    @JsonProperty(value = "customers/update")
    CUSTOMERS_UPDATE,
    @JsonProperty(value = "customers_marketing_consent/update")
    CUSTOMERS_MARKETING_CONSENT_UPDATE,
    @JsonProperty(value = "disputes/create")
    DISPUTES_CREATE,
    @JsonProperty(value = "disputes/update")
    DISPUTES_UPDATE,
    @JsonProperty(value = "domains/create")
    DOMAINS_CREATE,
    @JsonProperty(value = "domains/destroy")
    DOMAINS_DESTROY,
    @JsonProperty(value = "domains/update")
    DOMAINS_UPDATE,
    @JsonProperty(value = "draft_orders/create")
    DRAFT_ORDERS_CREATE,
    @JsonProperty(value = "draft_orders/delete")
    DRAFT_ORDERS_DELETE,
    @JsonProperty(value = "draft_orders/update")
    DRAFT_ORDERS_UPDATE,    
    @JsonProperty(value = "fulfillment_events/create")
    FULFILLMENT_EVENTS_CREATE,
    @JsonProperty(value = "fulfillment_events/delete")
    FULFILLMENT_EVENTS_DELETE,
    @JsonProperty(value = "fulfillment_orders/cancellation_request_accepted")
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_ACCEPTED,
    @JsonProperty(value = "fulfillment_orders/cancellation_request_rejected")
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_REJECTED,
    @JsonProperty(value = "fulfillment_orders/cancellation_request_submitted")
    FULFILLMENT_ORDERS_CANCELLATION_REQUEST_SUBMITTED,
    @JsonProperty(value = "fulfillment_orders/cancelled")
    FULFILLMENT_ORDERS_CANCELLED,
    @JsonProperty(value = "fulfillment_orders/fulfillment_request_accepted")
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_ACCEPTED,
    @JsonProperty(value = "fulfillment_orders/fulfillment_request_rejected")
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_REJECTED,
    @JsonProperty(value = "fulfillment_orders/fulfillment_request_submitted")
    FULFILLMENT_ORDERS_FULFILLMENT_REQUEST_SUBMITTED,
    @JsonProperty(value = "fulfillment_orders/fulfillment_service_failed_to_complete")
    FULFILLMENT_ORDERS_FULFILLMENT_SERVICE_FAILED_TO_COMPLETE,
    @JsonProperty(value = "fulfillment_orders/hold_released")
    FULFILLMENT_ORDERS_HOLD_RELEASED,
    @JsonProperty(value = "fulfillment_orders/line_items_prepared_for_local_delivery")
    FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_LOCAL_DELIVERY,
    @JsonProperty(value = "fulfillment_orders/line_items_prepared_for_pickup")
    FULFILLMENT_ORDERS_LINE_ITEMS_PREPARED_FOR_PICKUP,
    @JsonProperty(value = "fulfillment_orders/moved")
    FULFILLMENT_ORDERS_MOVED,
    @JsonProperty(value = "fulfillment_orders/order_routing_complete")
    FULFILLMENT_ORDERS_ORDER_ROUTING_COMPLETE,
    @JsonProperty(value = "fulfillment_orders/placed_on_hold")
    FULFILLMENT_ORDERS_PLACED_ON_HOLD,
    @JsonProperty(value = "fulfillment_orders/rescheduled")
    FULFILLMENT_ORDERS_RESCHEDULED,
    @JsonProperty(value = "fulfillment_orders/scheduled_fulfillment_order_ready")
    FULFILLMENT_ORDERS_SCHEDULED_FULFILLMENT_ORDER_READY,
    @JsonProperty(value = "fulfillments/create")
    FULFILLMENTS_CREATE,
    @JsonProperty(value = "fulfillments/update")
    FULFILLMENTS_UPDATE,
    @JsonProperty(value = "inventory_items/create")
    INVENTORY_ITEMS_CREATE,
    @JsonProperty(value = "inventory_items/delete")
    INVENTORY_ITEMS_DELETE,
    @JsonProperty(value = "inventory_items/update")
    INVENTORY_ITEMS_UPDATE,
    @JsonProperty(value = "inventory_levels/connect")
    INVENTORY_LEVELS_CONNECT,
    @JsonProperty(value = "inventory_levels/disconnect")
    INVENTORY_LEVELS_DISCONNECT,
    @JsonProperty(value = "inventory_levels/update")
    INVENTORY_LEVELS_UPDATE,
    @JsonProperty(value = "locales/create")
    LOCALES_CREATE,
    @JsonProperty(value = "locales/update")
    LOCALES_UPDATE,
    @JsonProperty(value = "locations/activate")
    LOCATIONS_ACTIVATE,
    @JsonProperty(value = "locations/create")
    LOCATIONS_CREATE,
    @JsonProperty(value = "locations/deactivate")
    LOCATIONS_DEACTIVATE,
    @JsonProperty(value = "locations/delete")
    LOCATIONS_DELETE,
    @JsonProperty(value = "locations/update")
    LOCATIONS_UPDATE,
    @JsonProperty(value = "markets/create")
    MARKETS_CREATE,
    @JsonProperty(value = "markets/delete")
    MARKETS_DELETE,
    @JsonProperty(value = "markets/update")
    MARKETS_UPDATE,
    @JsonProperty(value = "order_transactions/create")
    ORDER_TRANSACTIONS_CREATE,
    @JsonProperty(value = "orders/cancelled")
    ORDERS_CANCELLED,
    @JsonProperty(value = "orders/create")
    ORDERS_CREATE,
    @JsonProperty(value = "orders/delete")
    ORDERS_DELETE,
    @JsonProperty(value = "orders/edited")
    ORDERS_EDITED,
    @JsonProperty(value = "orders/fulfilled")
    ORDERS_FULFILLED,
    @JsonProperty(value = "orders/paid")
    ORDERS_PAID,
    @JsonProperty(value = "orders/partially_fulfilled")
    ORDERS_PARTIALLY_FULFILLED,
    @JsonProperty(value = "orders/updated")
    ORDERS_UPDATED,
    @JsonProperty(value = "payment_schedules/due")
    PAYMENT_SCHEDULES_DUE,
    @JsonProperty(value = "product_listings/add")
    PRODUCT_LISTINGS_ADD,
    @JsonProperty(value = "product_listings/remove")
    PRODUCT_LISTINGS_REMOVE,
    @JsonProperty(value = "product_listings/update")
    PRODUCT_LISTINGS_UPDATE,
    @JsonProperty(value = "products/create")
    PRODUCTS_CREATE,
    @JsonProperty(value = "products/delete")
    PRODUCTS_DELETE,
    @JsonProperty(value = "products/update")
    PRODUCTS_UPDATE,
    @JsonProperty(value = "profiles/create")
    PROFILES_CREATE,
    @JsonProperty(value = "profiles/delete")
    PROFILES_DELETE,
    @JsonProperty(value = "profiles/update")
    PROFILES_UPDATE,
    @JsonProperty(value = "refunds/create")
    REFUNDS_CREATE,
    @JsonProperty(value = "scheduled_product_listings/add")
    SCHEDULED_PRODUCT_LISTINGS_ADD,
    @JsonProperty(value = "scheduled_product_listings/remove")
    SCHEDULED_PRODUCT_LISTINGS_REMOVE,
    @JsonProperty(value = "scheduled_product_listings/update")
    SCHEDULED_PRODUCT_LISTINGS_UPDATE,
    @JsonProperty(value = "selling_plan_groups/create")
    SELLING_PLAN_GROUPS_CREATE,
    @JsonProperty(value = "selling_plan_groups/delete")
    SELLING_PLAN_GROUPS_DELETE,
    @JsonProperty(value = "selling_plan_groups/update")
    SELLING_PLAN_GROUPS_UPDATE,
    @JsonProperty(value = "shop/update")
    SHOP_UPDATE,
    @JsonProperty(value = "subscription_billing_attempts/challenged")
    SUBSCRIPTION_BILLING_ATTEMPTS_CHALLENGED,
    @JsonProperty(value = "subscription_billing_attempts/failure")
    SUBSCRIPTION_BILLING_ATTEMPTS_FAILURE,
    @JsonProperty(value = "subscription_billing_attempts/success")
    SUBSCRIPTION_BILLING_ATTEMPTS_SUCCESS,
    @JsonProperty(value = "subscription_billing_cycle_edits/create")
    SUBSCRIPTION_BILLING_CYCLE_EDITS_CREATE,
    @JsonProperty(value = "subscription_billing_cycle_edits/delete")
    SUBSCRIPTION_BILLING_CYCLE_EDITS_DELETE,
    @JsonProperty(value = "subscription_billing_cycle_edits/update")
    SUBSCRIPTION_BILLING_CYCLE_EDITS_UPDATE,
    @JsonProperty(value = "subscription_contracts/create")
    SUBSCRIPTION_CONTRACTS_CREATE,
    @JsonProperty(value = "subscription_contracts/update")
    SUBSCRIPTION_CONTRACTS_UPDATE,
    @JsonProperty(value = "tender_transactions/create")
    TENDER_TRANSACTIONS_CREATE,
    @JsonProperty(value = "themes/create")
    THEMES_CREATE,
    @JsonProperty(value = "themes/delete")
    THEMES_DELETE,
    @JsonProperty(value = "themes/publish")
    THEMES_PUBLISH,
    @JsonProperty(value = "themes/update")
    THEMES_UPDATE;
    // @formatter:on
}
