import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value: ");
        int inputNumber = sc.nextInt();
        pr.println(inputNumber);
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        float result = Float.parseFloat(str);
        System.out.println("Value in Meter is: " + result);

    }

}
