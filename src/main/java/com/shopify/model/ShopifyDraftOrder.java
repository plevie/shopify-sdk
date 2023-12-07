package com.shopify.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.joda.time.DateTime;

import com.shopify.model.adapters.CurrencyAdapter;
import com.shopify.model.adapters.DateTimeAdapter;

public class ShopifyDraftOrder {
    private String id;
    private String note;
    private String email;
    private DateTime closedAt;
    @XmlElement(name = "taxes_included")
    private boolean taxesIncluded;
    @XmlJavaTypeAdapter(CurrencyAdapter.class)
    private Currency currency;
    @XmlElement(name = "invoice_sent_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime invoiceSentAt;
    @XmlElement(name = "created_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime createdAt;
    @XmlElement(name = "updated_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime updatedAt;
    @XmlElement(name = "tax_exempt")
    private boolean taxExempt;
    @XmlElement(name = "completed_at")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private DateTime completedAt;
    private String name;
    private String status;
    @XmlElement(name = "line_items")
    private List<ShopifyLineItem> lineItems = new LinkedList<>();
    @XmlElement(name = "shipping_address")
    private ShopifyAddress shippingAddress = new ShopifyAddress();
    @XmlElement(name = "billing_address")
    private ShopifyAddress billingAddress = new ShopifyAddress();
    @XmlElement(name = "invoice_url")
    private String invoiceUrl;
    @XmlElement(name = "order_id")
    private String orderId;
    @XmlElement(name = "shipping_lines")
    private List<ShopifyShippingLine> shippingLines = new LinkedList<>();
    @XmlElement(name = "tax_lines")
    private List<ShopifyTaxLine> taxLines = new LinkedList<>();
    @XmlElement(name = "tags")
    private String tags;
    @XmlElement(name = "note_attributes")
    private List<ShopifyAttribute> noteAttributes = new LinkedList<>();
    @XmlElement(name = "total_price")
    private BigDecimal totalPrice;
    @XmlElement(name = "subtotal_price")
    private BigDecimal subtotalPrice;
    @XmlElement(name = "total_tax")
    private BigDecimal totalTax;
    private ShopifyCustomer customer = new ShopifyCustomer();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(DateTime closedAt) {
        this.closedAt = closedAt;
    }

    public boolean isTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public DateTime getInvoiceSentAt() {
        return invoiceSentAt;
    }

    public void setInvoiceSentAt(DateTime invoiceSentAt) {
        this.invoiceSentAt = invoiceSentAt;
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

    public boolean isTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public DateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(DateTime completedAt) {
        this.completedAt = completedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ShopifyLineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<ShopifyLineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public ShopifyAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShopifyAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ShopifyAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(ShopifyAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<ShopifyShippingLine> getShippingLines() {
        return shippingLines;
    }

    public void setShippingLines(List<ShopifyShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public List<ShopifyTaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<ShopifyTaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public List<ShopifyAttribute> getNoteAttributes() {
        return noteAttributes;
    }

    public void setNoteAttributes(List<ShopifyAttribute> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(BigDecimal subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public ShopifyCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ShopifyCustomer customer) {
        this.customer = customer;
    }

}
