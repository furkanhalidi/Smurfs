package sample;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player extends Character {
    private int tileX;
    private int tileY;
    private Image player;
    int skor;

    public Player(int oyuncuID, String oyuncuAdi, String oyuncuTur, int locationx, int locationy, int skor) {
        super(oyuncuID, oyuncuAdi, oyuncuTur, locationx, locationy);
        ImageIcon img = new ImageIcon("C://Users//Hp//Desktop//PROLAB2-1//sirin1.png");
        this.player = img.getImage();
        this.tileX = 6;
        this.tileY = 5;
        this.skor = skor;
    }

    public Image getPlayer() {
        return this.player;
    }

    public int getTileX() {
        return this.tileX;
    }

    public int getTileY() {
        return this.tileY;
    }

    public void move(int dx, int dy) {
        this.tileX += dx;
        this.tileY += dy;
    }
    public void PuaniGoster(){

    }
}
