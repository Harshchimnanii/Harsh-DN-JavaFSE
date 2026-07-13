class Bank {
    public int getRoi(){
        return 5;
    }
}
class HDFC extends Bank{
    @Override
    public int getRoi() {
        return 7;
    }
}
public class Overriding {
    public static void main(String[] args) {
        HDFC c1 = new HDFC();
        System.out.println(c1.getRoi());
    }
}