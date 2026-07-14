class Box{
    int length;
    int side ;
    int breadth;
    int width;
    Box(int side) {
        this(side, side, side);
    }
    Box(int length , int breadth , int width){
        this.length = length;
        this.breadth = breadth;
        this.width = width;
    }
    void calculate() {
        System.out.println("The Volume of the rectangle is : " + this.length*this.breadth*this.width);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Box b1 = new Box(12);
        b1.calculate();
        Box b2 = new Box(12 , 13 ,18 );
        b2.calculate();
    }
}