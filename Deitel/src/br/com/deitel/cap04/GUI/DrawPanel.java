package br.com.deitel.cap04.GUI;

import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int y;

        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
        g.drawLine((width / 2), 0, (width / 2), height);
        g.drawLine(0, (height / 2), width, (height / 2));

        for (int x = 0; x <= 200; x++) {
            y = x * (x - 50) + 100;
            g.drawLine(0, 0, x, y);
        }
    }

}
