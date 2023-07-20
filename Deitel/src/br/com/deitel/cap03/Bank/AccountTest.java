package br.com.deitel.cap03.Bank;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        System.out.printf("Account1 name is: %s%n", account1.getName());
        System.out.printf("Account2 name is: %s%n", account2.getName());

        Account account3 = new Account();
        System.out.print("Account3 name: ");
        String name = input.nextLine();
        account3.setName(name);
        System.out.printf("Account3 name is: %s%n", account3.getName());


    }
}