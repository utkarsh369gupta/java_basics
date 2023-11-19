// variable argument (VarArgs) in java
public class method_overloading {
    // static int sum(int x, int ...arr){
    static int sum(int ...arr){
        int result= 0;
        for (int i : arr) {
            result +=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7));
        System.out.println(sum());

    }
}


// public class method_overloading {
//     static void wish(){
//         System.out.println("hello bro ");
//     }
//     static void wish(int a){   //here a is a parameter
//         System.out.println("hello bro " + a);
//     }
//     public static void main(String[] args) {
//         wish(3);  // here 3 is an argument
//         wish();
        
//     }
// }
