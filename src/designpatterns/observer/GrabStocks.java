package designpatterns.observer;

public class GrabStocks {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(12.1);
        stockGrabber.setApplprice(13.4);
        stockGrabber.setGooglePrice(14.8);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(1.1);
        stockGrabber.setApplprice(2.2);
        stockGrabber.setGooglePrice(3.3);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(111.1);
        stockGrabber.setApplprice(222.2);
        stockGrabber.setGooglePrice(333.3);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 300);
        Runnable getAPPL = new GetTheStock(stockGrabber, 2, "APPL", 400);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 500);

        new Thread(getIBM).run();
        new Thread(getAPPL).run();
        new Thread(getGOOG).run();
    }

}
