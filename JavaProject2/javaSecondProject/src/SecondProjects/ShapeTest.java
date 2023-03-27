package SecondProjects;

class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Circle(5);
        System.out.println("The calculate area is = " + shape.calculateArea());

        Square square = new Square(5);
        System.out.println("The calculate parameter is = " + square.calculateParameter());


    }
}
