class Car{
    String Brand;
    double Price;
    Car(String Brand , double Price){
        this.Brand = Brand;
        this.Price = Price;
    }
    void display(){
        System.out.println("Brand : "+ this.Brand + ", Price : " + this.Price);
    }
}
public class CarOops {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota" , 100000.00);
        Car car2 = new Car("Tata" , 1010100.00);
        car1.display();
        car2.display();
    }
}