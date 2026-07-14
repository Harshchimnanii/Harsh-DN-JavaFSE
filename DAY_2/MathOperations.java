class Add{
    int a ;
    int b ;
    Add(int a , int b ){
        this.a = a;
        this.b = b;
    }
    int sum(){
        System.out.print("Addition of a & b gives : " );
        return a+b;
    }
}
public class MathOperations {
    public static void main(String[] args) {
        Add Sum = new Add(10 , 18);
        System.out.println(Sum.sum());

    }
}