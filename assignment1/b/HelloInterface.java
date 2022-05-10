import java.rmi.*;

public interface HelloInterface extends Remote {

    public float convert(Float num) throws RemoteException;

}
