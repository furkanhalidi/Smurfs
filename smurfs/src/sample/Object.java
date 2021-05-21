package sample;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Object {

    private Image gold;
    private int tileX;
    private int tileY;


    public Object(){
        Random random = new Random();

        ImageIcon img = new ImageIcon("C://Users//Hp//Desktop//PROLAB2-1//gold.png");
        this.gold = img.getImage();
        this.tileX = 1;
        this.tileY = 1;
    }

    public Image getGold() {
        return this.gold;
    }

    public int getTileX() {
        return this.tileX;
    }

    public int getTileY() {
        return this.tileY;
    }
}
