package br.com.deitel.cap04.Tests;

import java.sql.SQLOutput;

public class Test01 {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int studentGrade = 59;
        String text = (studentGrade >= 60 ? "Passed" : "Failed");
        System.out.println(text);
        if (x > 5)
            if (y > 5)
                System.out.println("x and y are > 5");
            else
                System.out.println("x is <= 5");
        else
            System.out.println("else else");
        System.out.println(studentGrade >= 60 ? "Passed" : "Failed");

    }
}
