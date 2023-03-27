package SecondProjects;

public class MarksTest {

    public static void main(String[] args) {
        A a = new A(90, 85, 95);
        B b = new B(80, 75, 85, 90);

        System.out.println("Student A's percentage: " + a.getPercentage());
        System.out.println("Student B's percentage: " + b.getPercentage());
    }
}


