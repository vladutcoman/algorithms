package designpatterns.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applprice;
    private double googlePrice;

    public StockGrabber() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
        System.out.println("Adding observer: " + o);
    }

    @Override
    public void unregister(Observer o) {
        int index = this.observers.indexOf(o);
        System.out.println("Deleting observer " + (index + 1));
        this.observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer obs : this.observers) {
            obs.update(this.ibmPrice, this.applprice, this.googlePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        this.notifyObserver();
    }

    public void setApplprice(double applprice) {
        this.applprice = applprice;
        this.notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        this.notifyObserver();
    }
}
