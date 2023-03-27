package SecondProjects;
/*
* Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
*  which should be returning a price of the car.Create 2 sub classes: Sedan and Truck. The Truck class has a field
*  as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated as
* following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of
*  sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount*/

public class Car {

    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

class Truck extends Car {

    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
        System.out.println("Car price is: " + carPrice + ", The Truck color is: " + color + ", The Truck weight is:" + weight + " Lbs");
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            System.out.print("Truck discount include: ");
            return super.calculateSalePrice() * 0.9;
        } else {
            System.out.print("Truck discount include: ");
            return super.calculateSalePrice() * 0.8;

        }

    }
}

class Sedan extends Car {

    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
        System.out.println("The Sedan price is: " + carPrice + ", The color is: " + color + ", and length is:" + length + " fts.");
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            System.out.print("Sedan discount include: ");
            return super.calculateSalePrice() * 0.5;
        } else {
            System.out.print("Sedan discount include: ");
            return super.calculateSalePrice() * 0.8;
        }
    }
}
