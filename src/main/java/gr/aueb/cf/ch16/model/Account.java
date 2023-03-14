package gr.aueb.cf.ch16.model;

import gr.aueb.cf.ch16.exceptions.InsufficientAmountException;
import gr.aueb.cf.ch16.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch16.exceptions.SsnNotValidException;

public class Account {
    private String iban;
    private User holder;
    private double balance;

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = new User(holder);
        this.balance = balance;
    }

    public Account() {
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return new User(holder);
    }

    public void setHolder(User holder) {
        this.holder = new User(holder);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    //Service Layer -Public API

    /**
     * @param amount
     * @throws InsufficientAmountException
     */
    public void deposit(double amount) throws InsufficientAmountException {
        try {
            if (amount < 0) {
                throw new InsufficientAmountException(amount);
            }
            balance += amount;
        } catch (InsufficientAmountException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws
            InsufficientBalanceException, SsnNotValidException {

        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;

        } catch (InsufficientBalanceException | SsnNotValidException ex) {
            System.err.println("Error in withdraw " + ex.toString());
            throw ex;
        }
    }

    protected boolean isSsnValid(String ssn) {
        if ((ssn == null) || (holder.getSsn() == null)) {
            return false;
        }
        return holder.getSsn().equals(ssn);
    }
}
