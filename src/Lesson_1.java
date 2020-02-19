public class Lesson_1 {
    // instance variable x2
    int a = 100;
    int b = 200;
    //main method
    public static void main(String[] args) {
        //Creation on object
        Lesson_1 Plus = new Lesson_1();
        Plus.addition();
    }
    //instance method
    public void addition() {
        int c = a + b;
        System.out.println(c);
    }
}
