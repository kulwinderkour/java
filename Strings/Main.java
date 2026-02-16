import java.util.Scanner;
public class Main{
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            // String mystring = sc.nextLine();
            // int lenString = mystring.length();
            // System.out.println(lenString);  // returns the length of the string
            // System.out.println(mystring.charAt(0));   // returns that element on that index and return type is char

            // codepointat
            // System.out.println(mystring.codePointAt(1));  // unicode value of at index
            
            // cehck that it is presnt or not returns true or false return type is string 
            // System.out.println(mystring.contains("moon"));
            
            
            // check theindex of that elemnt
            // System.out.println(mystring.indexOf("l"));
            
            // check the index of first elemnent from mutilple elemnts
            // System.out.println(mystring.indexOf("i"));
            
            
            // find last index of 
            // System.out.println(mystring.lastIndexOf("i"));
            
            
            // equal function compare two string only checks the equality fo only two string
            String a = "hello";
            String b ="ii";

            System.out.println(a.equals(b));


            // equal ignore case lowarecase and uppercase are traeated as same
            System.out.println(a.equalsIgnoreCase(b));


            // to remove the spaces from the beginning
            System.out.println(a.trim());   // spaces in the beggining are leadnign spaces and space in the last is trailing spaces


            // replace fucntion takes 2 paramters  remove from everywhere in string
            System.out.println(a.replace("hello", "hii"));
            

            //check if string si empty or not
            System.out.println(a.isEmpty());
            // compareto have return type of int and compare two strings
            System.out.println(a.compareTo(b));
            
            System.out.println(a.compareToIgnoreCase(b));
            
            
            // upper case and lowercase
            System.out.println(a.toUpperCase());
            System.out.println(a.toLowerCase());
            
            
            // string to char array
            System.out.println(a.toCharArray());
    }
}