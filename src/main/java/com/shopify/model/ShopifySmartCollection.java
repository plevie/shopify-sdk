package com.shopify.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifySmartCollection extends ShopifyCollection {

    private List<ShopifySmartCollectionRule> rules;
    private boolean disjunctive;

    public List<ShopifySmartCollectionRule> getRules() {
        return rules;
    }

    public ShopifySmartCollection setRules(List<ShopifySmartCollectionRule> rules) {
        this.rules = rules;
        return this;
    }

    public boolean isDisjunctive() {
        return disjunctive;
    }

    public ShopifySmartCollection setDisjunctive(boolean disjunctive) {
        this.disjunctive = disjunctive;
        return this;
    }
}
