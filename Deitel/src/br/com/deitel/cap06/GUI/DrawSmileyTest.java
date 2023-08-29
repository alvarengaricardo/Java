package br.com.deitel.cap06.GUI;

import javax.swing.JFrame;
public class DrawSmileyTest {
    public static void main(String[] args) {
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(250, 270);
        application.setVisible(true);
    }
}
