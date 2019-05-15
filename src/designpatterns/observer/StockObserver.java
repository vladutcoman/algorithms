package designpatterns.observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applPrice;
    private double googlPrice;

    private static int observeIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observeIDTracker;

        System.out.println("New observer " + this.observerID);

        this.stockGrabber.register(this);
    }

    @Override
    public void update(double ibdmPrice, double applPrice, double googlPrice) {
        this.ibmPrice = ibdmPrice;
        this.applPrice = applPrice;
        this.googlPrice = googlPrice;

        this.printPrices();
    }

    public void printPrices() {
        System.out.println(observerID );
        System.out.println("IBM: " + this.ibmPrice);
        System.out.println("Apple: " + this.applPrice);
        System.out.println("Google: " + this.googlPrice);
    }
}
