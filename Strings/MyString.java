import java.util.*;
public class MyString {
    public static void main(String args[]){
        // char[]  arr = new String("My new str").toCharArray();
        // String s = new String(arr);
        // System.out.println(s);


        int[] arr = {97,99,-83,69};
        String s = new String(arr,3,1);
        System.out.print(s);
    }
}

// string builder when we dont have that much threads
// but string buffer is when we have lot of threads
// string buffer is when we have lot of threads

