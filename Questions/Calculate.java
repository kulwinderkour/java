import  java.util.Scanner;

public class Calculate {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int a = sc.nextInt();
        
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("addition is : " + a+b);
        System.out.println("multiplication is : " + a*b);
        System.out.println("division is : " + a/b);
        System.out.println("remainder is : " + a%b);

    }
}
