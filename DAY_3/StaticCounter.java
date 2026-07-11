class Counter{
     static int count = 0;

    Counter(){
        count++;
    }
    void display(){
        System.out.println(count);
    }
}
public class StaticCounter {
    public static void main(String[] args) {
        Counter myObj1 = new Counter();
        Counter myObj2 = new Counter();
        Counter myObj3 = new Counter();
        myObj1.display();
        myObj2.display();
        myObj3.display();
    }
}