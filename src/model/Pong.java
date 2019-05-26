package model;
import java.awt.Color;

import javax.swing.JFrame;

public class Pong extends JFrame {
    private final static int WIDTH = 700, HEIGHT = 450;
    private PongPanel panel;

    public Pong() {
        setSize(WIDTH, HEIGHT);
        setTitle("Pong");
        setBackground(Color.BLACK);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new PongPanel(this);
        add(panel);
    }

    public PongPanel getPanel() {
        return panel;
    }

    public static void main(String[] args) {
        //TODO make the game more awesome!
        new Pong();
    }
}