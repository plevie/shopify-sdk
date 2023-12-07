package com.shopify.model;

import javax.xml.bind.annotation.XmlElement;

public class ShopifyDraftOrderRoot {

    @XmlElement(name = "draft_order")
    private ShopifyDraftOrder draftOrder;

    public ShopifyDraftOrder getDraftOrder() {
        return draftOrder;
    }

    public void setDraftOrder(ShopifyDraftOrder draftOrder) {
        this.draftOrder = draftOrder;
    }
}
