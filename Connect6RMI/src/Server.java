import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements ServerRemote {

    public static int fieldSize = 19;
    public static int winnumber = 6;

    private static int[][] sfield;
    private static int playerCount;
    private static int winner;
    private static int[] coord;

    public Server() {
        resetGame();
    }

    private static boolean chkWin(int x, int y, int checkColor) {
        // по горизонтали
        int curX = x;
        int curY = y;
        int counter = 0;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX++;
        }
        curX = x - 1;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX--;
        }
        if (counter >= winnumber)
            return true;

        // по вертикали
        curX = x;
        curY = y;
        counter = 0;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curY++;
        }
        curY = y - 1;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curY--;
        }
        if (counter >= winnumber)
            return true;

        // по диагонали (убывающая)
        curX = x;
        curY = y;
        counter = 0;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX++;
            curY--;
        }
        curX = x - 1;
        curY = y - 1;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX--;
            curY--;
        }
        if (counter >= winnumber)
            return true;

        // по диагонали (возрастающая)
        counter = 0;
        curX = x;
        curY = y;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX++;
            curY++;
        }
        curX = x - 1;
        curY = y + 1;
        while (chkBorder(curX, curY) && sfield[curX][curY] == (checkColor)) {
            counter++;
            curX--;
            curY++;
        }
        return counter >= winnumber;
    }

    private static boolean chkBorder(int x, int y) {
        return (x >= 0 && y >= 0) && (x < fieldSize && y < fieldSize);
    }

    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1234);
        Server server = new Server();
        ServerRemote proxy = (ServerRemote) UnicastRemoteObject.exportObject(server, 1234);

        registry.rebind("RMIServer", proxy);
        System.out.println("Server started!");
        System.out.println("proxy = " + proxy);
    }

    public void resetGame() {
        sfield = new int[fieldSize][fieldSize];
        for (int i = 0; i < fieldSize; i++)
            for (int j = 0; j < fieldSize; j++)
                sfield[i][j] = 2;

        playerCount = 0;
        winner = 2;
        coord = new int[2];
        coord[0] = -1;
        coord[1] = -1;
    }

    public void setPoint(int x, int y, int color) {
        sfield[x][y] = color;
        coord[0] = x;
        coord[1] = y;

        if (chkWin(x, y, color))
            winner = color;
    }

    public int getSize() {
        return fieldSize;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public int getWinner() {
        return winner;
    }

    public int getColor() {
        if (playerCount == 0) {
            playerCount++;
            return 0;
        }
        if (playerCount == 1) {
            playerCount++;
            return 1;
        }
        playerCount++;
        return 2;
    }

    public int[] getEnemyTurn() {
        int[] enemy = new int[2];
        enemy[0] = coord[0];
        enemy[1] = coord[1];
        coord[0] = -1;
        coord[1] = -1;

        return enemy;
    }
}
