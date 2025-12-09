import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        Calculator calculator = new Calculator();

        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("Calculator", calculator);

        System.out.println("Server Started");
    }
}
