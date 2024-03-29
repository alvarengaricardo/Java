package br.com.deitel.cap06.GUI;

import javax.swing.*;
import java.awt.*;

public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        // rosto
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(10, 10, 200, 200);

        // olhos
        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);

        // boca
        g.fillOval(50, 110, 120, 60);

        // sorriso
        g.setColor(Color.lightGray);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
