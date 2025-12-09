import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements CalculatorInterface {
    protected Calculator() throws RemoteException {
        super();
    }

    @Override
    public double add(double x, double y) throws RemoteException {
        return x+y;
    }

    @Override
    public double substraction(double x, double y) throws RemoteException {
        return x-y;
    }

    @Override
    public double multiply(double x, double y) throws RemoteException {
        return x*y;
    }

    @Override
    public double division(double x, double y) throws RemoteException {
        return x/y;
    }
}
