package oop.inheritance;

import java.util.Objects;

public class BankAccount {
    private int bankCode;
    private String accountNumber;
    private double balance;

    public BankAccount(int bankCode, String accountNumber, double balance) {
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(int bankCode, String accountNumber) {
        this.bankCode = bankCode;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public int getBankCode() {
        return bankCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public void setAccountNumber(String accountNumber) {
        accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankCode=" + bankCode +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return bankCode == that.bankCode &&
                Double.compare(that.balance, balance) == 0 &&
                Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankCode, accountNumber, balance);
    }
}
