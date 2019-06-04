public class ClassesTest {

    String name;

    public static void main (String[] args) {
        int [] a = new int[10];
        Car car = new Car ();
        System.out.println(car.engineType);
        System.out.println(car.maxSpeed);
        System.out.println(car.numberOfDoors);
        car.engineType = "first type";
        car.maxSpeed = 150;
        car.numberOfDoors = 4;
        System.out.println(car.engineType);
        System.out.println(car.maxSpeed);
        System.out.println(car.numberOfDoors);

        Car anotherCar = new Car ();
        anotherCar.engineType = "Second type";
        anotherCar.maxSpeed = 200;
        anotherCar.numberOfDoors = 5;


    }

}
