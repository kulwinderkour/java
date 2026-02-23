public class enumrations {

    public static void main(String args[]){
        // enum names{kulwinder, mehr,rahul,saima}
        // names n = names.saima;
        // System.out.println(n);
        void sum(int a , double b, int... nums){
            int s = Arrays.stream(nums).sum();
            for(int v:nums){
                s+=v;
            }
        }
    }
}



//  enumeratiosn is special type of data type where we define a fixed set of constants