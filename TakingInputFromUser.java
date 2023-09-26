package Java;

import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Taking input from the user");
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float sum = a + b;
        System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // String str = sc.next();
        // String str = sc.nextLine();
        // System.out.println(str);
    }
}
