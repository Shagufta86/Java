package Java;

public class Varargs {
  static int product(int...arr){
        int result=1;
        for(int a:arr){
            result *= a;
        }
        return result;
    }
   public static void main(String[] args) {
       System.out.println("The product of 4 ,5 and 9 is: "+ product(4,5,9));
    } 
   }


   /////////  Find average of given number in method  //////////
/*static float average(float...marks){
       float total=0;
       for (float scan:marks){
           total+=scan;
       }
       System.out.println(total/ marks.length);
       return total;
   }

   public static void main(String[] args) {

       float sum=average(1,2,3,4);
*/
