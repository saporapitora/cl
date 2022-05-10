import java.rmi.*;
import java.rmi.server.*;

public class Hello extends UnicastRemoteObject implements HelloInterface {

    public Hello() throws RemoteException {
        super();
    }

    public Float value;

    public float convert(Float val) throws RemoteException {
        value = val / 100;
        return value;
    }
}