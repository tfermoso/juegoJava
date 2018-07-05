/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego1;

import javax.swing.JFrame;

/**
 *
 * @author Tomás
 */
public class Juego1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        JFrame frame = new JFrame("Mini Tennis");
        Game game = new Game();
        frame.add(game);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }

}
