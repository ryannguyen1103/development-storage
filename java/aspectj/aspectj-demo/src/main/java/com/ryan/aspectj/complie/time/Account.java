package com.ryan.aspectj.complie.time;

/**
 *
 * @author ryan.nguyen
 */
public class Account {

    public int balance = 20;

    public boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        }
        balance = balance - amount;
        System.out.println("Balance after withdrawal: " + balance);
        return true;
    }
}
