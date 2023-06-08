package rmi.connect6;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ServerRemote extends Remote {
    void resetGame() throws RemoteException;
    void setPoint(int x, int y, int color) throws RemoteException;
    int getSize() throws RemoteException;
    int getPlayerCount() throws RemoteException;
    int getWinner() throws RemoteException;
    int getColor() throws RemoteException;
    int[] getEnemyTurn() throws RemoteException;
}
