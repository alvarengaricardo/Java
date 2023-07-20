package br.com.deitel.cap03.Bank;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if(balance >= 0) this.balance = balance;

    }
/*
    public Account(){
    }
 */

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit (double depositAmount){
        if (depositAmount > 0) balance = balance + depositAmount;
    }

    public void displayAcount(){
        System.out.println("****************************************");
        System.out.printf("Name: %s%n", this.name);
        System.out.printf("Balance %.2f%n", this.balance);
        System.out.println("****************************************");
    }


}
