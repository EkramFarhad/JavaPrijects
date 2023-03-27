package SecondProjects;
/*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    Test your code.*/


public interface Shape {

    double calculateArea();

    double calculateParameter();


}

// first class circle

class Circle implements Shape {

    double radius;

    Circle(double radius) {

        this.radius = radius;

    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public double calculateParameter() {
        return 0;
    }
}


// second class square
class Square implements Shape {

    double parameter;

    Square(double parameter) {
        this.parameter = parameter;
    }


    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateParameter() {
        return 4*parameter;
    }
}

//Main method class -------------------------------------------------

