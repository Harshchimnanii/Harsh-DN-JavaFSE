class inVar {
    int a;
    String b;
    char c;

    inVar(int a, String b, char c) {
//        a = a;
//        b = b;
//        c = c;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void print() {
        System.out.println(this.a+" " +this.b+" "+ this.c);
    }
}
public class NOThisKeyword {
    public static void main(String[] args) {
        inVar p = new inVar(14 , "Amit" , 'a');
        p.print();
    }
}