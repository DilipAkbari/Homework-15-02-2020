import java.util.Scanner;

public class LessonJP_3 {
    public static void main(String[] args) {
        float F;
        Scanner tem = new Scanner(System.in);
        System.out.println("Temp in Fahrenheit");
        F = tem.nextInt();
        F = ((F - 32) * 5)/9;
        System.out.println("temperature in Celsius = " + F);

    }

}
