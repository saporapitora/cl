
import java.rmi.*;

public class HelloServer {
    public static void main(String args[]) {

        try {
            Hello robj = new Hello();// rmiregistry
            Naming.rebind("Hello", robj);
            System.out.println("Server is Ready!!");
        }

        catch (Exception e) {
            System.out.println("Hello Server Failed! " + e);
        }
    }
}
