public class MultiplyOverload {
    public static void main(String[] args) {
//            Multiply product = new Multiply();
            double result1 = Multiply.mul(12 , 14);
            double result2 = Multiply.mul(12 , 14 , 13);
            double result3 = Multiply.mul(13.0 , 14.0);
        System.out.println(result1 + " " + result2 + " " + result3);

    }
}
class Multiply{
    static double mul(double a , double b ){
            return a *b;

    }
    static int mul(int a , int b , int c){
        return a *b*c;

    }
    static int mul(int a , int b){
        return a *b;
    }

}