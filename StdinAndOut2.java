package introduction;

import java.util.Scanner;

public class StdinAndOut2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //getting the input from user
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        
        //printing the output on the console
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
