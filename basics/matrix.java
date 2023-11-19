import java.util.*;

class functions{
    int r, c;
    int[][] arr;
    Scanner sc = new Scanner(System.in);
    public void row(){
        System.out.println("Enter the number of rows: ");
        r = sc.nextInt();
    }
    public void column(){
        System.out.println("Enter the number of columns: ");
        c = sc.nextInt();
    }
    public void values(){
        arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public void add(functions m1, functions m2){
        int[][] cc = new int[r][c];
        if(m1.r == m2.r && m1.c == m2.c){
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    cc[i][j] = m1.arr[i][j] + m2.arr[i][j];
                    System.out.print(cc[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("matrix can't be added");
        }
    }
}
public class matrix {
    public static void main(String[] args) {
        functions m1 = new functions();
        functions m2 = new functions();
        System.out.println("Matrix 1: ");
        m1.row();
        m1.column();
        System.out.println("Matrix 2: ");
        m2.row();
        m2.column();
        System.out.println("enter the value for matrix 1: ");
        m1.values();
        System.out.println("enter the value for matrix 2: ");
        m2.values();
        System.out.println("Addition: ");
        m1.add(m1,m2);

    }
}
