package br.com.deitel.cap06.Exercicios;

import javax.swing.JPanel;
import java.awt.*;
import java.security.SecureRandom;

public class Target extends JPanel {

    private static final SecureRandom randomNumbers = new SecureRandom();
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int color = randomNumbers.nextInt(2);

        for (int diametro = 300; diametro >= 0; diametro = diametro - 20) {

            if(color == 0){
                g.setColor(Color.BLACK);
                color = 1;
            } else {
                g.setColor(Color.YELLOW);
                color = 0;
            }
            g.fillOval(150 - diametro/2, 150 - diametro/2, diametro, diametro);
            //g.drawOval(150 - diametro/2, 150 - diametro/2, diametro, diametro);
        }
    }
}
