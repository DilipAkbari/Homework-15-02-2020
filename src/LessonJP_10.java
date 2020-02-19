public class LessonJP_10 {
    public static void main(String[] args) {
        final double width = 5.6;
        final double height = 8.5;
        double perimeter = 2 * (height + width);
        double area = perimeter;

        System.out.printf("Perimeter is 2*(%.1f+%.1f)=%.2f\n", height, width, perimeter);
        System.out.printf("Area is %.1f * %1f= %.1f", width, height, area);

    }

}
