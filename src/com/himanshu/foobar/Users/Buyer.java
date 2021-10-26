package com.himanshu.foobar.Users;

public class Buyer {

    private String buyerId;
    private String buyerName;

    public Buyer() {
    }

    public Buyer(String buyerId, String buyerName) {
        this.buyerId = buyerId;
        this.buyerName = buyerName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }
}
