package StrategyPattern;

public class Order {
    private boolean isClosed=false;
    private double totalCost = 0.0;

    public void processOrder(PaymentStrategy strategy){
        strategy.collectPaymentDetails();
    }

    public boolean isClosed() {
        return this.isClosed;
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public void setClosed() {
        this.isClosed = true;
    }

    public void setTotalCost(double cost) {
        this.totalCost = +cost;
    }
}
