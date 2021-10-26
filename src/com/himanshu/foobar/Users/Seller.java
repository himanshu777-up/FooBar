package com.himanshu.foobar.Users;

import com.himanshu.foobar.Items.AuctionItem;


public class Seller {

    private String sellerId;
    private String sellerName;

    public Seller() {
    }

    public Seller(String sellerId, String sellerName) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
}
