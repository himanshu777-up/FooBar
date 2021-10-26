package com.himanshu.foobar.Items;

import com.himanshu.foobar.Users.Buyer;
import com.himanshu.foobar.Users.Seller;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Auction {

    private String auctionId;
    private AuctionItem auctionItem;
    private String state;
    private int minBidAmount;
    private int maxBidAmount;
    private int partCost;
    private Seller seller;
    private Map<Buyer, Integer> bidMap;
    private Buyer winner;
    private int winningAmount;


    public Auction() {
    }

    public Auction(String auctionId, AuctionItem auctionItem, int minBidAmount, int maxBidAmount, int partCost, Seller seller) {
        this.auctionId = auctionId;
        this.auctionItem = auctionItem;
        this.minBidAmount = minBidAmount;
        this.maxBidAmount = maxBidAmount;
        this.partCost = partCost;
        this.seller = seller;
        this.state = "OPEN";
        this.bidMap = new HashMap<>();
        this.winner = new Buyer();
        this.winningAmount = -1;

    }

    //Methods
    public void displayAllBuyers() {
        System.out.println("Showing all the buyers for the auction......" + auctionId);
        for (Buyer buy : getBidMap().keySet()) {
            System.out.println(buy.getBuyerId() + "  " + bidMap.get(buy));
        }
    }

    public void winPrice() {

        int winAmount = Integer.MIN_VALUE;

        for (Buyer buyer : bidMap.keySet()) {
            if (bidMap.get(buyer) > winAmount) {
                winAmount = bidMap.get(buyer);
                winner = buyer;
            }
        }

        winningAmount = winAmount;
    }

    public void profit() {

        double gain=0;

        System.out.println("Calculating profit for the seller..." + seller.getSellerId());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int val : bidMap.values()) {
            if (min > val) {
                min = val;
            }

            if (max < val) {
                max = val;
            }
        }


        gain = winningAmount + (bidMap.size() * (0.2) * partCost) - ((getMinBidAmount()+ getMaxBidAmount()) / 2);
        System.out.println("The profit comes out to be..." + gain);

    }

    public void closeAuction(){

        setState("CLOSED");
        System.out.println(" The auction is closed now---"+ auctionId);
        System.out.println(" The winner for the auction is---"+ winner.getBuyerId());
        System.out.println(" The winning amount paid for the auction is---"+ getWinningAmount());
        System.out.println(" The profit earned by the seller ---"+ seller.getSellerId() + "   is  ");
        profit();

    }

    public String getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(String auctionId) {
        this.auctionId = auctionId;
    }

    public AuctionItem getAuctionItem() {
        return auctionItem;
    }

    public void setAuctionItem(AuctionItem auctionItem) {
        this.auctionItem = auctionItem;
    }

    public void setWinner(Buyer winner) {
        this.winner = winner;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Buyer getWinner() {
        return winner;
    }

    public Map<Buyer, Integer> getBidMap() {
        return bidMap;
    }

    public void setBidMap(Map<Buyer, Integer> bidMap) {
        this.bidMap = bidMap;
    }

    public int getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(int minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public int getMaxBidAmount() {
        return maxBidAmount;
    }

    public void setMaxBidAmount(int maxBidAmount) {
        this.maxBidAmount = maxBidAmount;
    }

    public int getPartCost() {
        return partCost;
    }

    public void setPartCost(int partCost) {
        this.partCost = partCost;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
