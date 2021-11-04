package StrategyPattern;

public class Card {
    // haven't added expiration date of card i.e. valid until
    // next commit I shall add this too .
    public String cardNumber;
    public String cardHolderName;
    public int cvv;
    private double balance;

    // Constructor
    public Card(String cardNumber,String cardHolderName,int cvv,double balance){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.cvv=cvv;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
