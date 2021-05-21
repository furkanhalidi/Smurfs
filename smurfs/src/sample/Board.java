package sample;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
    private Timer timer;
    private Map m = new Map();
    private Player p = new Player(1, "Gozluklu", "oyuncu", 6, 5, 20);
    private Foe f = new Foe(1, 1, 1, "Gargamel", "dusman");

    private Object o = new Object();

    public Board() {
        this.addKeyListener(new Board.Al());
        this.setFocusable(true);
        this.timer = new Timer(25, this);
        this.timer.start();
    }

    public void actionPerformed(ActionEvent e) {


        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);

        for(int y = 0; y < 11; ++y) {
            for(int x = 0; x < 13; ++x) {
                if (this.m.getMap(x, y).equals("f")) {
                    g.drawImage(this.m.getFinish(), x * 32, y * 32, (ImageObserver)null);
                }

                if (this.m.getMap(x, y).equals("1")) {
                    g.drawImage(this.m.getFloor(), x * 32, y * 32, (ImageObserver)null);
                }

                if (this.m.getMap(x, y).equals("0")) {
                    g.drawImage(this.m.getWall(), x * 32, y * 32, (ImageObserver)null);
                }
            }
        }

        g.drawImage(this.p.getPlayer(), this.p.getTileX() * 32, this.p.getTileY() * 32, (ImageObserver)null);
        g.drawImage(this.f.getFoe(), this.f.getTileX() * 32, this.f.getTileY() * 32, (ImageObserver)null);
       // g.drawImage(this.o.getGold(),this.o.getTileX() * 32, this.o.getTileY() * 32, (ImageObserver)null);
    }

    public class Al extends KeyAdapter {
        public Al() {
        }

        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            if (keycode == 38 && Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() - 1).equals("1")) {
                Board.this.p.move(0, -1);
            }

            if (keycode == 40 && Board.this.m.getMap(Board.this.p.getTileX(), Board.this.p.getTileY() + 1).equals("1")) {
                Board.this.p.move(0, 1);
            }

            if (keycode == 37 && Board.this.m.getMap(Board.this.p.getTileX() - 1, Board.this.p.getTileY()).equals("1")) {
                Board.this.p.move(-1, 0);
            }

            if (keycode == 39 && Board.this.m.getMap(Board.this.p.getTileX() + 1, Board.this.p.getTileY()).equals("1")) {
                Board.this.p.move(1, 0);
            }

        }

        public void keyRelased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }
    }
}
