// their are basically three types of error:
// 1. compile time error
// 2. run time error  -> these are exceptions 
// 3. logical error

class bossexc extends Exception {
    public bossexc(String string) {
        super(string);
    }
}

class ToExpthrows {
    public void div(int i, int j) throws ArithmeticException {
        System.out.println(i / j);
    }
}

public class tryandcatch {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                // throw new ArithmeticException("bla bla bla");
                throw new bossexc("bla bla bla");
            }
        } catch (bossexc e) {
            System.out.println("Exception raised by boss!! " + e);
        } catch (ArithmeticException e) {
            System.out.println("division by zero not possible!!" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index is greater than the boundary!!");
        } catch (Exception e) {
            System.out.println("division by zero not possible!!");
        }

        System.out.println(j);
        System.out.println("bye!!");

        try {
            ToExpthrows object = new ToExpthrows();
            object.div(4, 0);
        } catch (Exception e) {
            System.out.println("hello!!! -> " + e);
        }
    }
}
