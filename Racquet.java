/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author Tomás
 */
public class Racquet {

    int x = 0;
    int xa = 0;
    private Juego game;
    private static final int Y = 330;
    private static final int WITH = 60;
    private static final int HEIGHT = 20;

    public Racquet(Juego game) {
        this.game = game;
    }

    public void move() {
        if (x + xa > 0 && x + xa < game.getWidth() - 60) {
            x = x + xa;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, Y, WITH, HEIGHT);
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, 330, 60, 10);
    }

    public int getTopY() {
        return Y - HEIGHT;
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
    }

    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode() + " " + KeyEvent.VK_LEFT + " " + KeyEvent.VK_RIGHT);
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            xa = -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            xa = 1;
        }
    }
}
