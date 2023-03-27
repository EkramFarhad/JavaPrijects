package SecondProjects;

public class CarTest {

    public static void main(String[] args) {
        Truck truck = new Truck(3000,"white",4000);
        System.out.println(truck.calculateSalePrice());

        System.out.println("----------------");

        Sedan sedan = new Sedan(2000,"Red",21);
        System.out.println(sedan.calculateSalePrice());
    }
}
