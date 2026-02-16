public class Number_sum {
    public static void main(String args[]){
        int n = 24;
        int sum = 0;
        while(n>0){
            sum +=n%10;
            n = n/10;
        }
        System.out.print(sum);
    }
}
