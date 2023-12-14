package com.shopify.model.webhook;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.shopify.model.adapters.DateTimeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ShopifyWebhook {
    private String id;
    private String address;
    private ShopifyWebhookTopic topic;
    @XmlElement(name = "created_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime createdAt;
    @XmlElement(name = "updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime updatedAt;
    private ShopifyWebhookFormat format;
    private List<String> fields;
    @XmlElement(name = "metafield_namespaces")
    private List<String> metafieldNamespaces;
    @XmlElement(name = "api_version")
    private String apiVersion;
    @XmlElement(name = "private_metafield_namespaces")
    private List<String> privateMetafieldNamespaces;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ShopifyWebhookTopic getTopic() {
        return topic;
    }

    public void setTopic(ShopifyWebhookTopic topic) {
        this.topic = topic;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShopifyWebhookFormat getFormat() {
        return format;
    }

    public void setFormat(ShopifyWebhookFormat format) {
        this.format = format;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getMetafieldNamespaces() {
        return metafieldNamespaces;
    }

    public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
        this.metafieldNamespaces = metafieldNamespaces;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<String> getPrivateMetafieldNamespaces() {
        return privateMetafieldNamespaces;
    }

    public void setPrivateMetafieldNamespaces(List<String> privateMetafieldNamespaces) {
        this.privateMetafieldNamespaces = privateMetafieldNamespaces;
    }

}
