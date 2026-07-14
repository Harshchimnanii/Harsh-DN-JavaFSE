class Student{
    int age ;
    String name ;
    Student(String name , int age){
        this.name = name;
        this.age= age;
    }
    void display(){
        System.out.println("Name : " + this.name + ", age : " + this.age);
    }
}
public class oopsBasicCode {

    public static void main(String[] args) {
        Student s1 = new Student("Amit" , 23);
        Student s2 = new Student("Kajal" , 26);
        s1.display();
        s2.display();
    }
}