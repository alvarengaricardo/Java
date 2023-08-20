package br.com.deitel.cap05.GUI;

import javax.swing.*;

public class CirclesTest {
    public static void main(String[] args) {
        // cria painel
        Circles panel = new Circles();

        JFrame application = new JFrame(); // cria novo JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(320, 340);
        application.setVisible(true);
    }
}
