package com.shopify.model;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ShopifyDraftOrdersRoot {
    @XmlElement(name = "draft_orders")
    private List<ShopifyDraftOrder> draftOrders = new LinkedList<>();

    public List<ShopifyDraftOrder> getDraftOrders() {
        return draftOrders;
    }

    public void setDraftOrders(List<ShopifyDraftOrder> draftOrders) {
        this.draftOrders = draftOrders;
    }

}
