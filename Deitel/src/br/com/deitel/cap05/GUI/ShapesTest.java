package br.com.deitel.cap05.GUI;

import javax.swing.*;

public class ShapesTest {
    public static void main(String[] args) {
        // entrada usuário
        String input = JOptionPane.showInputDialog(
                "Enter 1 to draw rectangles\n" +
                "Enter 2 to draw ovals");

        int choice = Integer.parseInt(input); // converte a entrada para int

        // cria painel
        Shapes panel = new Shapes(choice);

        JFrame application = new JFrame(); // cria novo JFrame

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300, 300);
        application.setVisible(true);
    }
}
