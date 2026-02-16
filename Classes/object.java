// java is object oriented programming means creating object and staic belongs to whole class
// DRY - dont repeat yourself focus on code readabilty
// class - blueprint of objects 
// objects are the instance or examples of classes
// encapsulation - is the act of bundling all elements together in a capsule - e.g - laptop is the single capsule that is storing everything like wifi speakers passwords many more

// abstract class - is the secret class that is not used to creating the objects



class calc{
    int a;
    public int add(int a,int b){
        a = 4;
        b = 5;

        System.out.println("in add");
        return a +b;
    }
}

public class object{
    public static void main(String s[]){
        int a =5;
        int b =4;
        calc newcal = new calc();  //class name, varibale name , new keyword and again call the calc() method
        int result = newcal.add(a,b);
        
        System.out.println(result);
        
    }
}