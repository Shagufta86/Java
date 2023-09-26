package Java;
import java.util.*;

public class Conditions {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

         if(a==b) {
            System.out.println("a is equal to b");
         } else if (a>b) {
            System.out.println("a is greater than b");
         } else {
            System.out.println("a is less than b");
         }
        int button = sc.nextInt();
        if(button == 1){
        System.out.println("Hi");
        } else if(button == 2){
        System.out.println("Namaste");
        } else if(button == 3){
            System.out.println("Bonjour");
        }

        switch(button){
            case 1: System.out.println("Hi");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid statement");
            break;
        }
     }
}
    
