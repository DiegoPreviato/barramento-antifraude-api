package com.barramentodemo.apiantifraude.models;

public class Transaction {

    
    private String transactionId;
    private String customerDocument;
    private String transactionValue;
    private String createdAt;
    private String brand;
    
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getCustomerDocument() {
        return customerDocument;
    }
    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }
    public String getTransactionValue() {
        return transactionValue;
    }
    public void setTransactionValue(String transactionValue) {
        this.transactionValue = transactionValue;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
        result = prime * result + ((customerDocument == null) ? 0 : customerDocument.hashCode());
        result = prime * result + ((transactionValue == null) ? 0 : transactionValue.hashCode());
        result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transaction other = (Transaction) obj;
        if (transactionId == null) {
            if (other.transactionId != null)
                return false;
        } else if (!transactionId.equals(other.transactionId))
            return false;
        if (customerDocument == null) {
            if (other.customerDocument != null)
                return false;
        } else if (!customerDocument.equals(other.customerDocument))
            return false;
        if (transactionValue == null) {
            if (other.transactionValue != null)
                return false;
        } else if (!transactionValue.equals(other.transactionValue))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        } else if (!createdAt.equals(other.createdAt))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        return true;
    }    
}
