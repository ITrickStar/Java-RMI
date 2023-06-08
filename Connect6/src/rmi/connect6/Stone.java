package rmi.connect6;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


public class Stone extends JPanel {

    private int color;
    private int x, y;

    Stone(int x, int y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        if (color == 1) {
            g2d.drawOval(x, y, 24, 24);
        } else {
            g2d.fillOval(x, y, 24, 24);
        }
    }
}
