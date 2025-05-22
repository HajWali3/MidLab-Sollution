public class ConcreteBidder implements Bidder {
    private String name;

    public ConcreteBidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String bidderName, int bidAmount) {
        System.out.println(name + " has been notified: " + bidderName + " placed a new highest bid of $" + bidAmount);
    }
}
