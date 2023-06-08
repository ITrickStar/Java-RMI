import javax.swing.*;
import java.awt.*;


public class Board extends JPanel {

    private static int n;
    private static int w, h;

    public Board(int size) {
        super();
        n = size;
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.gray);
        drawGrid(g);
    }

    public void drawGrid(Graphics g) {
        h = getHeight();
        w = h;
        int dh = h / n;
        int dw = dh;

        g.setColor(Color.RED);
        for (int i = 1; i < n; i++) {
            g.drawLine(0, dh * i, w, dh * i); // hor
            g.drawLine(dw * i, 0, dw * i, h); // ver
        }
    }
}
