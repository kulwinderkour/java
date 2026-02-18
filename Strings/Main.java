import java.util.*;

public class Main{
    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            String mystring = sc.nextLine();
            // int lenString = mystring.length();
            // System.out.println(lenString);  // returns the length of the string
            // System.out.println(mystring.charAt(0));   // returns that element on that index and return type is char

            // codepointat
            // System.out.println(mystring.codePointAt(1));  // unicode value of at index
            System.out.println(mystring.codePointBefore(1));  // unicode value of
            
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

            // System.out.println(a.equals(b));


            // equal ignore case lowarecase and uppercase are traeated as same
            // System.out.println(a.equalsIgnoreCase(b));


            // to remove the spaces from the beginning
            // System.out.println(a.trim());   // spaces in the beggining are leadnign spaces and space in the last is trailing spaces


            // replace fucntion takes 2 paramters  remove from everywhere in string
            // System.out.println(a.replace("hello", "hii"));
            

            //check if string si empty or not
            // System.out.println(a.isEmpty());
            // compareto have return type of int and compare two strings
            // System.out.println(a.compareTo(b));
            
            // System.out.println(a.compareToIgnoreCase(b));
            
            
            // upper case and lowercase
            // System.out.println(a.toUpperCase());
            // System.out.println(a.toLowerCase());
            
            
            // string to char array
            // System.out.println(a.toCharArray());   


            // string to byte arrays
            
            byte[] res= a.getBytes();
            // System.out.println(Arrays.toString(res));  // arrays to string can be unicode values
            
            
            
            
            String arr[] = mystring.split(" " );
            // System.out.println(Arrays.toString(arr));
            
            
            
            
            // startwith  and ends with this can take strigns also
            // System.out.println(mystring.startsWith("k"));
            // System.out.println(mystring.endsWith("kulwinder"));


            char[] newarr = {'a','b','c','d','e'};
            String r;
            r.valueOf(newarr);
            System.out.println(r);


        mystring.getChars(1, 2, newarr,4);
        // System.out.println(Arrays.toString(newarr));   // 1 is the first index of the input and 2 is the last index of the input and 4 is the place where we want to place our string in the array



        String c = "hello";
        String d = "world";
        String e = "ok";
        String result = c.concat(" ").concat(d).concat(d);
        System.out.println(result);
        
        
        System.out.println(mystring.substring(2));   // start from this index and print till last



        
    }
}