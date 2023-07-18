package br.com.deitel.cap03.Bank;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account();
        System.out.printf("Initial name: %s%n%n", account.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        account.setName(theName);
        System.out.println();

        System.out.printf("Name in object is: %n%s%n", account.getName());
    }

}
