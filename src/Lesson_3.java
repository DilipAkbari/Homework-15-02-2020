public class Lesson_3 {
    int a = 50;
    static int b = 50;

    public static void main(String[] args) {
Lesson_3 obj = new Lesson_3();
        obj.inst();
        add();
    }

    public void inst() {
        int a = 50;
        Lesson_3 b;
        System.out.println(a);
        System.out.println(50);
    }

    public static void add() {
        int b = 50;
        System.out.println(b);
        Lesson_3 obj = new Lesson_3();
        System.out.println(b);
        System.out.println(obj.a);
    }

}

