import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String re = new StringBuilder(s).reverse().toString();   // it allows you yo chnage the same string wihtout creating new objects
        System.out.println(re);
    }
}


