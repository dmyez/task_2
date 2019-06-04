public class Car {
    String engineType;
    int maxSpeed;
    int numberOfDoors;
    int oilType;
    int numberOfPassangers;

    // Class Коеструктор

    public Car () {
        engineType = "First type";
    }

    // Class constructor with parameters

    public  Car ( String engineType, int maxSpeed, int numberOfDoors, int oilType, int numperOfPassangers){
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.numberOfDoors = numberOfDoors;
        this.oilType = oilType;
        this.numberOfPassangers = numperOfPassangers;


    }



}
