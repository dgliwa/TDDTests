package com.thoughtworks.accountbalance;

/**
 * Created by derekgliwa on 6/16/14.
 */
public class AccountBalance {
    private int balance;
    public AccountBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int depositAmt){
        balance +=depositAmt;
    }

    public void withdraw(int withdrawAmt){

    }

}
