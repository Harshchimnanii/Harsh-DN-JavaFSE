class checkEven{
    static Boolean isEven(int num){
        if(num%2 == 0){
            return true;

        }
        return false;
    }
}
public class Even {
    public static void main(String[] args) {
        System.out.println(checkEven.isEven(17));

    }
}