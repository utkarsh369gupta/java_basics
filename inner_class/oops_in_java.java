class Calculator {
    int a;

    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class oops_in_java {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator cal = new Calculator();
        int result = cal.add(num1, num2);
        // int result = num1 + num2;
        System.out.println(result);

    }
}
