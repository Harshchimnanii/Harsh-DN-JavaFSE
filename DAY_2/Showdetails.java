class Employee{
    String empName;
    int empId;
    Employee(int empId , String empName){
        this.empId = empId;
        this.empName = empName;

    }
    void ShowDetails(){
        System.out.println("Employee name : " + this.empName + " , Employeeid : " + this.empId);
    }
}


public class Showdetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1 , "Amit Goyal");
        Employee emp2 = new Employee(2 , "Harsh Chimnani");
        emp1.ShowDetails();
        emp2.ShowDetails();

    }
}