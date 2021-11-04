package StrategyPattern;

import java.io.*;
import java.util.*;

/**
 * Concrete strategy. Implements PayPal payment method.
 */

public class PayByPayPal implements PaymentStrategy{
    private static final Map<String,String> DATA_BASE = new HashMap<>();
    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    /** Static variables are intialized inside the static block
     * **/

    static {
        DATA_BASE.put("123456","krishna@gmail.com");
        DATA_BASE.put("qwerty","divya@gmail.com");
    }

    /**
     * Collect customer's data
     */

    public void collectPaymentDetails(){
        try{
            while(!signedIn) {
                System.out.println("Enter the  user's email :");
                email = in.readLine();
                System.out.println("Enter user's password : ");
                password = in.readLine();
                if (verify()) {
                    System.out.println("Successfully signed in !!");
                } else {
                    System.out.println("Check your login credentials!!");
                }
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private boolean verify(){
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    public void setSignedIn(boolean signedIn){
        this.signedIn = signedIn;
    }

    @Override
    public boolean pay(double amount){
        if(signedIn){
            System.out.println("Paying "+amount+" using PayPal.");
            return true;
        }else{
            return false;
        }
    }



}
