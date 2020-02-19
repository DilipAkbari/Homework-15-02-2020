import java.util.Scanner;

public class LessonJP_6 {
public static void main (String[] args){
    Scanner table = new Scanner((System.in));
    System.out.print("Enter Number:");
    int a = table.nextInt();
    for (int b=1;b<=10;b++) {
    System.out.println(a+"*"+b+"="+a*b);
    }
}


}
