import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calculate() {
        try {
            System.out.println("Enter First Number ");
            n1 = sc.nextInt();
            System.out.println("Enter Second Number");
            n2 = sc.nextInt();
            result = n1 / n2;
        } catch (InputMismatchException ime) {
            System.out.println("IME Detected");
        } catch (ArithmeticException ae) {
            System.out.println("AE Detected");
        } catch (Exception e) {
            System.out.println("Ouch! Exception Detected! " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("The Division is " + result);
        }
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
}
