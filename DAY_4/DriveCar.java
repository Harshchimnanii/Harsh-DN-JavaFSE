abstract class Vehicle{
    String StartEngine(){
        return "Starting The Enginee ... !";
    }
    abstract void Drive();
}
class Car extends Vehicle{
    @Override
    void Drive(){

        System.out.println("Drive the car");
    }
}
public class DriveCar {
    public static void main(String[] args) {
        Car Car1 = new Car();
        System.out.println(Car1.StartEngine());
        Car1.Drive();

    }
}