import java.util.ArrayList;
import java.util.List;

public class AuctionSubject {
    private List<Bidder> bidders = new ArrayList<>();
    private int highestBid = 0;

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void removeBidder(Bidder bidder) {
        bidders.remove(bidder);
    }

    public void submitBid(String bidderName, int bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            notifyBidders(bidderName, bidAmount);
        } else {
            System.out.println("Bid too low by " + bidderName + ": $" + bidAmount);
        }
    }

    private void notifyBidders(String bidderName, int bidAmount) {
        for (Bidder b : bidders) {
            b.update(bidderName, bidAmount);
        }
    }
}
