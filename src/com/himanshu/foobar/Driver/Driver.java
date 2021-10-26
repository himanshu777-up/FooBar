package com.himanshu.foobar.Driver;

import com.himanshu.foobar.Items.Auction;
import com.himanshu.foobar.Items.AuctionItem;
import com.himanshu.foobar.Items.Bid;
import com.himanshu.foobar.Users.Buyer;
import com.himanshu.foobar.Users.Seller;

public class Driver {

    public static void main(String[] args) {

        Buyer B1 = new Buyer("B1", "buyer1");
        Buyer B2 = new Buyer("B2", "buyer2");
        Buyer B5 = new Buyer("B5", "buyer5");

        Seller S1 = new Seller("S1", "seller1");

        AuctionItem item1 = new AuctionItem("item1", "item1");

        Auction auction1 = new Auction("auc1", item1, 10, 50, 1, S1);
        Bid bid1 = new Bid(B1, auction1, 17);
        Bid bid2 = new Bid(B2, auction1, 15);


        auction1.displayAllBuyers();
        bid1.updateBid(B1, auction1, 25);
        bid2.updateBid(B2, auction1, 50);



        auction1.displayAllBuyers();
        auction1.winPrice();

        System.out.println(" The winning bid goes to ..."+ auction1.getWinner().getBuyerId()+"   and the amount paid is   "+auction1.getWinningAmount());

        auction1.profit();

        auction1.closeAuction();

        Bid bid5 = new Bid(B5, auction1, 100);
        auction1.displayAllBuyers();

        System.out.println("test case 1 done here----------------------");
        System.out.println("----------------------------------------------------------");

        //test case 2

        Seller S2 = new Seller("S2", "seller2");
        Buyer B3 = new Buyer("B3", "buyer3");

        Auction auction2 = new Auction("auc2", item1, 5, 20, 2, S2);

        Bid bid3 = new Bid(B3, auction2, 25);
        Bid bid4 = new Bid(B2, auction2, 5);

        auction2.displayAllBuyers();
        auction2.winPrice();
        auction2.profit();

        auction2.closeAuction();


    }
}
