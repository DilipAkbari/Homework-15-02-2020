
import java.util.Scanner;

public class LessonJP_1 {

    public static void main(String[] args) {

        int a, ab, add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st No.:--->");
        a = scanner.nextInt();
        System.out.print("2nd No.:--->");
        ab = scanner.nextInt();

        add = a + ab;
        subtract = a - ab;
        multiply = a * ab;
        devide = (float) a / ab;
        System.out.println("Sum = " + add);
        System.out.println("Difference =" + subtract);
        System.out.println("Multiplication =" + multiply);
        System.out.println("Division =" + devide);

    }


}
