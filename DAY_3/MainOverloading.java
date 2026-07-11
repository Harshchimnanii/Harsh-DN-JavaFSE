public class MainOverloading {

    public static void main(String[] args) {

        System.out.println("Original Main");

        main(10);          // overloaded main call
        main("Harsh");     // overloaded main call
    }

    public static void main(int a) {
        System.out.println("Integer Main : " + a);
    }

    public static void main(String name) {
        System.out.println("String Main : " + name);
    }
}