interface Shape{
        void draw();
    }
    class Circle implements Shape{
        @Override
        public void draw(){
            System.out.println("Drwaing circle");
        }
    }
    class Square implements Shape{
        @Override
        public void draw(){
            System.out.println("Drwaing Square");
        }
    }
public class Inteface_Explain
{
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}