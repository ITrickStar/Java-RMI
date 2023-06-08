import javax.swing.*;
import java.awt.*;


public class Stone extends JPanel {

    private final int color;
    private final int x;
    private final int y;

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
