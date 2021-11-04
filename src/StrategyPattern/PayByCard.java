package StrategyPattern;

import java.io.*;

public class PayByCard implements PaymentStrategy{
    private Card card;
    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void collectPaymentDetails(){
        try{
            System.out.println("Enter your Card Number : ");
            String number = in.readLine();
            System.out.println("Enter Card Holder Name : ");
            String name = in.readLine();
            System.out.println("Enter the 3 digit CVV (at the back of your card) : ");
            int cvv = Integer.parseInt(in.readLine());
            card = new Card(number,name,cvv,100000.35);

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pay(double amount){
        if(cardIsPresent() && card.getBalance()>=amount){
            System.out.println("Paying "+amount+" using your card");
            card.setBalance(card.getBalance()-amount);
            return true;
        }else{
            return false;
        }

    }

    private boolean cardIsPresent(){
        return card != null;
    }
}
