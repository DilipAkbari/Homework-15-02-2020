import java.util.Scanner;

public class LessonJP_9 {
    public static void main(String[] args) {
        Scanner avg = new Scanner(System.in);
        System.out.print("Type fist Digits:");
        float x = avg.nextFloat();
        System.out.print("Type Second Digits:");
        float y = avg.nextFloat();
        System.out.print("Type Third Digits:");
        float z = avg.nextFloat();
      //  System.out.print("Average value is: " + average(x, y , z,) + "\n");
    }

    public static float average(float x, float y, float z) {
        return (x + y + z) / 3;

    }
}
