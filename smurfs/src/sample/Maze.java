package sample;

import java.awt.Component;
import javax.swing.JFrame;

public class Maze {
    public static void main(String[] args) {
        new Maze();
    }

    public Maze() {
        JFrame f = new JFrame();
        f.setTitle("Maze Game");
        f.add(new Board());
        f.setSize(500, 400);
        f.setLocationRelativeTo((Component)null);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

}
