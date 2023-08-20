package br.com.deitel.cap05.GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel{
    private int choice; // escolha do usuário sobre qual forma usar
    // construtor configura a escolha do usuário
    public Shapes(int userChoice){
        choice = userChoice;
    }

    // desenha uma cascata de formas
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);

        for(int i = 0; i < 15; i++){
            switch (choice){
                case 1: // retângulos
                    graphics.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 2: // ovais
                    graphics.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
            }
        }
    }
}