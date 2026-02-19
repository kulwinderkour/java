import java.util.*;

public class Static {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String e = a.replace(" ","#");
        System.out.println(e);

        String decoded = a.replace("#", " ");
        String[] words = decoded.split(" ");   // use the string array

        for(String i:words){
            System.out.println(i);
        }
        System.out.println(decoded);

    }
}
