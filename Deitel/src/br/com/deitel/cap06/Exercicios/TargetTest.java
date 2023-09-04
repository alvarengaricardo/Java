package br.com.deitel.cap06.Exercicios;

import javax.swing.*;

public class TargetTest {
    public static void main(String[] args) {
        // cria painel
        Target panel = new Target();

        JFrame application = new JFrame(); // cria novo JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(320, 340);
        application.setVisible(true);
    }
}

