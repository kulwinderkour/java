import java.util.Scanner;
import java.util.Arrays;
public class MyString {
    public static void main(String args[]){
        char[]  arr = new String("My new str").toCharArray();
        String s = new String(arr);
        System.out.println(s);


        int[] newarr = {97,99,-83,69};
        String s2 = new String(arr,3,1);
        System.out.print(s2);
    }
}

// string builder when we dont have that much threads
// but string buffer is when we have lot of threads


