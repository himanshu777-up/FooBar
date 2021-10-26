package com.himanshu.foobar.Items;

import com.himanshu.foobar.Users.Buyer;

public class Bid {

    private Buyer buyer;
    private Auction auction;
    private int price;

    public Bid() {
    }

    public Bid(Buyer buyer, Auction auction, int price) {
        this.buyer = buyer;
        this.auction = auction;
        if(price<= auction.getMaxBidAmount() && price>= auction.getMinBidAmount()) {
            this.price = price;
        }else{
            this.price = -1;
        }
        if (auction.getState().equalsIgnoreCase("OPEN")) {
            this.auction.getBidMap().put(buyer, price);
        }
    }

    public void updateBid(Buyer buy, Auction auction, int amount) {
        auction.getBidMap().put(buy, amount);
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
