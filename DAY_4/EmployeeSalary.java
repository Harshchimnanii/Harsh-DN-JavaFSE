class Employee{
    private int salary ;
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        if(salary>0){
            this.salary = salary;
        }
    }

}
public class EmployeeSalary {
    public static void main(String[] args) {
    Employee Sumit = new Employee();
    Sumit.setsalary(0);
    System.out.println(Sumit.getsalary());
    Sumit.setsalary(50000);
    System.out.println(Sumit.getsalary());
    Sumit.setsalary(-1000);
    System.out.println(Sumit.getsalary());
    }
}