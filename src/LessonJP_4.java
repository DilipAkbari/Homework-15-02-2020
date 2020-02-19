import java.util.Scanner;

public class LessonJP_4 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the Triangle Width:");
        double b = c.nextDouble();
        System.out.println("Enter the Trianle height:");
        double h = c.nextDouble();
        double area = (b * h) / 2;
        System.out.println("Triangle Area:" + area);


    }

}
