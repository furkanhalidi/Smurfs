package sample;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Map {
    private Scanner m;
    private String[] Map = new String[11];
    private Image floor;
    private Image wall;
    private Image finish;

    public Map() {
        ImageIcon img = new ImageIcon("C://Users//Hp//Desktop//PROLAB2-1//floor.png");
        this.floor = img.getImage();
        img = new ImageIcon("C://Users//Hp//Desktop//PROLAB2-1//duvar.png");
        this.wall = img.getImage();
        img = new ImageIcon("");
        this.finish = img.getImage();
        this.openFile();
        this.readFile();
        this.closeFile();
    }

    public Image getFloor() {
        return this.floor;
    }

    public Image getWall() {
        return this.wall;
    }

    public Image getFinish() {
        return this.finish;
    }

    public String getMap(int x, int y) {
        String index = this.Map[y].substring(x, x + 1);
        return index;
    }

    public void openFile() {
        try {
            this.m = new Scanner(new File("C://Users//Hp//Desktop//PROLAB2-1//harita.txt"));
        } catch (Exception var2) {
            System.out.println("error loading map");
        }

    }

    public void readFile() {
        label16:
        while(true) {
            if (this.m.hasNext()) {
                int i = 0;

                while(true) {
                    if (i >= 11) {
                        continue label16;
                    }

                    this.Map[i] = this.m.next();
                    ++i;
                }
            }

            return;
        }
    }

    public void closeFile() {
        this.m.close();
    }
}
