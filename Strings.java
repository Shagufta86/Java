package Java;

public class Strings {
public static void main(String[] args) {
    
          /////////  String Methods   ///////////
             String name = "Harry";
           int value = name.length();
           System.out.println(value);
           String lstring = name.toLowerCase();
           System.out.println(lstring);
           String ustring = name.toUpperCase();
           System.out.println(ustring);
           String nonTrimmedString = "        Harry         ";
           System.out.println(nonTrimmedString);
           String trimmedString = nonTrimmedString.trim();
           System.out.println(trimmedString);
           System.out.println(name.substring(1));
             System.out.println(name.substring(0,5));
           System.out.println(name.replace('r','p'));


           // concatenation
           String Firstname = "tony";
           String Lastname = "stark";
           String Fullname = Firstname + Lastname;
           System.out.println(Fullname.length());


           //charAt
           for(int i=0;i<Fullname.length();i++){
            System.out.println(Fullname.charAt(i));
           }
              String name1 ="Tony";
              String name2 ="Stark";
           if(name1.compareTo(name2)==0){
               System.out.println("Strings are equal");
           }else{
               System.out.println("Strings are not equal");
           }
           System.out.println(name.startsWith("Har"));
           System.out.println(name.endsWith("rry"));
           System.out.println(name.charAt(4));
           String modifiedName = "Harryrryrry";
           System.out.println(modifiedName.indexOf("rry"));
           System.out.println(modifiedName.indexOf("rry",4));
           System.out.println(modifiedName.lastIndexOf("rry",4));
           System.out.println(name.equals("Harry"));
           System.out.println(name.equalsIgnoreCase("harry"));
  
    
           //////////  STRINGBUILDER   //////////
           StringBuilder sb= new StringBuilder("Harry");
           System.out.println(sb.capacity());
           System.out.println(sb);
           sb.insert(2,'n');
           System.out.println(sb);
           sb.reverse();
           System.out.println(sb);
           sb.delete(1,3);
           System.out.println(sb);
           sb.append(" "+"is");
           sb.append(" "+"a");
           sb.append(" "+"great");
           sb.append(" "+"tutor.");
           System.out.println(sb);
           System.out.println(sb.length());
           System.out.println(sb.capacity());
        }
    }
