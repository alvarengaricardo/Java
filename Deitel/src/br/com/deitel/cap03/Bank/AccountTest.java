package br.com.deitel.cap03.Bank;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("Account1 name is: %s%n", account1.getName());
        System.out.printf("Account2 name is: %s%n", account2.getName());

    }
}