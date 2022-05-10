import java.rmi.*;
import java.util.*;

public class HelloClient {
    public static void main(String[] args) {

        System.out.println("Enter your number in cm: ");
        Scanner sc = new Scanner(System.in);
        Float num = sc.nextFloat();
        Float ans;
        try {
            HelloInterface hello = (HelloInterface) Naming.lookup("//localhost/Hello");

            ans = hello.convert(num);

            System.out.println("Output in Meter is : " + ans);
        }

        catch (Exception e) {
            System.out.println("Hello Server Failed! " + e);
        }
    }
}
