package com.himanshu.foobar.Items;

import com.himanshu.foobar.Users.Seller;

public class AuctionItem {

    private String itemId;
    private String itemName;

    public AuctionItem() {
    }

    public AuctionItem(String itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
