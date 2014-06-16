package com.thoughtworks.accountbalance;

import org.junit.Test;
import org.junit.Assert.*;
public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        AccountBalance bal = new AccountBalance(100);
        bal.deposit(50);
        assert(bal.getBalance()==150);
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        AccountBalance bal = new AccountBalance(100);
        bal.withdraw(50);
        assert(bal.getBalance()==50);
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        AccountBalance bal = new AccountBalance(50);
        bal.withdraw(100);
        assert(bal.getBalance()==50);
    }
}
