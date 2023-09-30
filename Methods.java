package Java;
import java.util.Scanner;
public class Methods {
    public class Functions{
    public static void printMyName(String name){
    System.out.println(name);
    return;
    }
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    printMyName(name); 
    }
  }
}
    
             //////// ques 1  /////////
   /* public static void main(String [] args){
     static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*5;
        }
        return z;
    }
        int a=5;
        int b=7;
        int c;
        //Method invocation using object creation
        //J16_Methods obj = new J16_Methods();
        //c=obj.logic(a,b);
         c=logic(a,b);
        int a1=6;
        int b1=4;
        int c1;
        //c1=obj.logic(a1,b1);
        c1=logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
  }*/


                 //////// ques 2  /////////
    /*public static void main(String [] args){
     static int mySum(int a, int b){
     int c;
     if(a<b){
       c=a+b;
     }else{
         c=(a+b)*2;
    }
    return c;
}
         int a=3;
         int b=4;
         int c;
         c= mySum(a,b);
      System.out.println(c);
      }
  }*/


              //////// ques 3  /////////
   /*static void change(int a){
   a=98;
   }
   static void change2(int []arr){
       arr[0]=98;
   }
   static void tellJoke(){
       System.out.println("I invented a new word\n"+"Plagiarism");
   }
   public static void main(String [] args){
      //tellJoke();
      // case 1: changing the Integer
      // int x = 45;
      // change(x);
      // System.out.println("The value of x after running change is:"+x);

      //case 1: changing the Array
      int []marks = {52,73,77,89,98,94};
      change2(marks);
      System.out.println("The value of x after running change is:"+marks[0]);
   }
}*/

   
           //////// ques 4  /////////
  /*  static void foo() {
      System.out.println("Good Morning");
   }

   static void foo(int a) {
      System.out.println("Morning" + a + " bro");
   }

   static void foo(int a, int b) {
      System.out.println("Morning" + a + " bro ");
      System.out.println("Morning" + a + " bro ");
   }

   public static void main(String[] args) {
      //method overloading
      foo();
      foo(3000);
      foo(3000, 40000);
   }*/


          //////// ques 5  /////////
  /*static void Table( int n) {
       int Table;
       for(int i=1; i<=10; i++) {
           System.out.println(n + "x" + i + "="+ n*i);
       }
       return ;
               }
               public static void main(String[]args){
                   Scanner sc = new Scanner(System.in);
                   int n = sc.nextInt();
                   sc.close();
                   Table(n);
               }*/


            //////// ques 6  /////////
    /*  public static void Prime(int num) {
          boolean flag = false;
          for (int i = 2; i <= num / 2; ++i)
      {

          if (num % i == 0) {
              flag = true;
              break;
          }
      }

          if (!flag)
              System.out.println(num + " is a prime number.");
          else
                  System.out.println(num + " is not a prime number.");
  }


      public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int num= s.nextInt();

          Prime(num);
      }*/


             //////// ques 7  /////////
    /*static void pattern() {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
      pattern();
    }*/
