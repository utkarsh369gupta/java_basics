// class Calculator{
//     static int sum(int a, int b){
//         return a+b;
//     }
// }


// public class oops {
//     public static void main(String[] args) {

//         // Calculator calc = new Calculator();
//         // int a = calc.sum(3,4);
//         // System.out.println(a);

//         int r = Calculator.sum(2,3);
//         System.out.println(r);
//     }
// }


import java.util.Scanner;

class account{
    String name;
    double accountnumber;
    String accounttype;
    double balance = 0;
    Scanner sc = new Scanner(System.in);
    
    public account(){
        System.out.print("enter name: ");
        name = sc.nextLine();
        System.out.print("enter account number: ");
        accountnumber = sc.nextDouble();
        sc.nextLine();
        System.out.print("enter account type(S or C): ");
        accounttype = sc.nextLine();
    }
    
    public void updatebalance(){
        System.out.print("enter the amount you want to deposite: ");
        double deposite = sc.nextDouble();
        balance += deposite; 
    }
    public void displaybalance(){
        System.out.printf("Your Balance: %.2f", balance);
    }
    public void withdrawal(){
        System.out.print("\nenter the amount you want to withdraw: ");
        double wd = sc.nextDouble();
        balance -= wd; 
    }
    public double penalty(){
        if(accounttype == "C" && balance < 500){
            balance -= 200;    // if penalty amount is 200
            System.out.print("\nAccording to bank terms and conditions, you have to pay 200 ru as penalty\n");
        }
        return balance;
    }
}

public class oops{
    public static void main(String[] args){
        account obj = new account();
        obj.updatebalance();
        obj.displaybalance();
        obj.withdrawal();
        obj.penalty();
        
    }
}


