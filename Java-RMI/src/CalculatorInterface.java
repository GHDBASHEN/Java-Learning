import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {

    double add(double x, double y) throws RemoteException;

    double substraction(double x, double y) throws RemoteException;

    double multiply(double x, double y) throws  RemoteException;

    double division(double x , double y) throws RemoteException;
}
