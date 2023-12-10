package Java;    
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for ,while ,do - while ,break &continue concept
       for (int counter = 0; counter < 11; counter++) {
           System.out.println("hello world");
           System.out.println(counter);


           /////// i from 0 to 10  ///////
           int i=0;
           while (i<11) {
               System.out.println(i);
           i = i+1;
             }


           ////// j from 0 to 11 using do-while //////
           int j =0;
           do {
           System.out.println(j);
               j=j+1;
           }while (j<11);

           ////////////////////////////////////////   
           Scanner sc = new Scanner(System.in);  
           int n = sc.nextInt();
           int sum=0;
           for (int k=0;k<=n;k++){
               sum = sum + k;
           }
           System.out.println(sum);


           /////////// ques 1 //////////
           for (int b = 1; b < 11; b++) {
           System.out.println(b * n);
           int a=10;
           do {
           System.out.println(a);
               a++;}
           while(a<5);


          //////////  ques 2 //////////
       int d=0;
       do{
           d++;
           if(d==2){
               System.out.println("Ending loop here");
               continue;
           }
           System.out.println(d);
           System.out.println("Java is great");
       }while(d<5);
       System.out.println("Loop ends here");


          /////// star pattern 1   //////////
          int s = 4;
          int m = 5;

          //outer
           for(int u=1; u<=n; u++) {
               //inner
               for (int v=1; v<=m; v++) {

                   if( u == 1 || v == 1 || u == s || v == m ) {
                       System.out.print("*");
                   }else{
                       System.out.print("");
                   }
               }
               System.out.println();
       }


       ////////  rock, scissors, paper Game  ///////////
       Scanner scan = new Scanner(System.in);
       System.out.println("Player 1: Choose rock, scissors, or paper:");
       String player1 = scan.next().toLowerCase();
       System.out.println("Player 2: Choose rock, scissors, or paper:");
       String player2 = scan.next().toLowerCase();

       if (player1.equals(player2))
       {
           System.out.print("It is a tie");
        }
      }    
    }   
  } 
}
