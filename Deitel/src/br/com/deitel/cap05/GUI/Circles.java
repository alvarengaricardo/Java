package br.com.deitel.cap05.GUI;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circles extends JPanel {
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        int diametro;
        for (int i = 1; i <= 12; i++) {
            diametro = i * 20;
            graphics.drawOval(150 - diametro/2, 150 - diametro/2, diametro, diametro);
        }
    }
}