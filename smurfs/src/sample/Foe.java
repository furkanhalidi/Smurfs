package sample;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Foe extends Character {
    private Image foe;
    private int tileX;
    private int tileY;

    public Foe(int locationx, int locationy, int dusmanID, String dusmanAdi, String dusmanTur) {
        super(locationx, locationy, dusmanID, dusmanAdi, dusmanTur);
        ImageIcon img = new ImageIcon("C://Users//Hp//Desktop//PROLAB2-1//gargamel.png");
        this.foe = img.getImage();
        this.tileX = 10;
        this.tileY = 0;
    }

    public Image getFoe() {
        return this.foe;
    }

    public int getTileX() {
        return this.tileX;
    }

    public int getTileY() {
        return this.tileY;
    }
}
