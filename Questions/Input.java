import java.util.Scanner;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter another number: ");
        int n2 = sc.nextInt();
        int res = n*n2;
        System.out.println("produt is: " + n * n2);

            
    }
}
