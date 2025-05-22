public class AuctionMain {
    public static void main(String[] args) {
        AuctionSubject auction = new AuctionSubject();

        ConcreteBidder bidder1 = new ConcreteBidder("Alice");
        ConcreteBidder bidder2 = new ConcreteBidder("Bob");
        ConcreteBidder bidder3 = new ConcreteBidder("Charlie");

        auction.addBidder(bidder1);
        auction.addBidder(bidder2);
        auction.addBidder(bidder3);

        auction.submitBid("Alice", 100);
        auction.submitBid("Bob", 120);
        auction.submitBid("Charlie", 110);
        auction.submitBid("Alice", 130);
    }
}
