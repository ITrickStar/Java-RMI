package rmi.connect6;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Client extends JPanel {

    private static JFrame frame;
    private static int click_x, click_y;
    private static int myColor;

    private static int[][] cfield;
    private static int fsize;
    private static int turns;

    public static void createGUI() {
        frame = new JFrame("Connect6");

        frame.setSize(475, 495);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // JTextField text = new JTextField("Твой ход: " + turnCounter);
        // frame.add(text);
        frame.add(new Board(fsize));
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                click_x = e.getX();
                click_y = e.getY();
            }
        });
    }

    public static void boardInit() {
        cfield = new int[fsize][fsize];
        for (int i = 0; i < fsize; i++)
            for (int j = 0; j < fsize; j++)
                cfield[i][j] = 2;
    }

    public static boolean overflow() {
        for (int i = 0; i < fsize; i++)
            for (int j = 0; j < fsize; j++) {
                if (cfield[i][j] == 2)
                    return false;
            }

        return true;
    }

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry(1234);
        ServerRemote server = (ServerRemote) registry.lookup("RMIServer");

        System.out.println("Connected! ");
        System.out.println("server = " + server);

        fsize = server.getSize();
        boardInit();
        createGUI();

        myColor = server.getColor();
        boolean myTurn = false;
        if (myColor == 0) {
            frame.setTitle("Connect6 - Поле черных камней");
            myTurn = true;
        }
        if (myColor == 1) {
            frame.setTitle("Connect6 - Поле белых камней");
        }
        if (myColor >= 2) {
            frame.setTitle("Connect6 - Spectator");
        }

        int x, y;
        int turnCounter = 1;
        int[] enemyTurn = new int[2];
        while (server.getWinner() == 2) {
            if (myTurn && myColor < 2) {
                x = (click_x - 12) / 24;
                y = (click_y - 12) / 24 - 1;

                if (x >= 0 && x < fsize && y >= 0 && y < fsize && cfield[x][y] == 2) {
                    cfield[x][y] = myColor;
                    server.setPoint(x, y, myColor);

                    frame.add(new Stone(24 * x, 24 * y, myColor));
                    frame.setVisible(true);

                    turnCounter++;
                    turns++;
                    if (turnCounter == 2) {
                        myTurn = false;
                        turnCounter = 0;
                    }
                }
            } else {
                enemyTurn = server.getEnemyTurn();
                if (enemyTurn[0] != -1) {
                    cfield[enemyTurn[0]][enemyTurn[1]] = 1 - myColor;

                    frame.add(new Stone(24 * enemyTurn[0], 24 * enemyTurn[1], 1 - myColor));
                    frame.setVisible(true);

                    turnCounter++;
                    turns++;
                    if (turnCounter == 2) {
                        myTurn = true;
                        turnCounter = 0;
                    }
                }
            }

            if (overflow()) {
                JOptionPane.showMessageDialog(null, "Ничья! " + "Ходов: " + turns);
                server.resetGame();
                System.exit(0);
            }
        }

        int win = server.getWinner();
        if (win == myColor) {
            JOptionPane.showMessageDialog(null, "Вы победили! " + "Ходов: " + turns);
            server.resetGame();
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Вы проиграли! " + "Ходов: " + turns);
            server.resetGame();
            System.exit(0);
        }
    }
}
