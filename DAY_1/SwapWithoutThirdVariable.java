public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        a = a+b;
        System.out.println(a + " "+ b);
//        30
        b = a-b;
        System.out.println(a + " "+ b);
//        10
        a = a-b;
        System.out.println(a + " "+ b);
//        20
        a = a^b ;
        System.out.println(a + " "+ b);
        b = b^a;
        System.out.println(a + " "+ b);
        a = a^b;
        System.out.println(a + " "+ b);
    }

}