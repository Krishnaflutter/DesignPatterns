package StrategyPattern;

public interface PaymentStrategy {
    boolean pay(double amount);
    void collectPaymentDetails();
}
