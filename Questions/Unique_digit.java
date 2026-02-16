// Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.



import java.util.Scanner;

public class Unique_digit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=4;j++){
                for(int k = 0;k<=4;k++){
                    if(i!= k && j!= i && j!= k){
                        count++;
                        System.out.println(i + " " + j +" "+k+" ");
                    }
                }
            }
        }
        // System.out.print("COunt",count);
    }
}
