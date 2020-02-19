import java.util.Scanner;

public class LessonJP_2 {

    public static void main(String[] args) {
        int r;
        double pi = 5.10, area;
        Scanner cir = new Scanner(System.in);
        System.out.print("Enter redius of circle:");
        r = cir.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:" + area);
    }

}
