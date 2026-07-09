public class Demo {
    public static void main(String[] args) {
        BankAccount holder1 = new BankAccount("199901000033847");
        holder1.deposit(1000);
        holder1.withdraw(500);
        holder1.withdrawcheckBalance();
        BankAccount holder2 = new BankAccount("19990");
        holder2.deposit(10008);
        holder2.withdraw(5008);
        holder2.withdrawcheckBalance();
        BankAccount holder3 = new BankAccount("1999010000");
        holder3.deposit(10009);
        holder3.withdraw(5009);
        holder3.withdrawcheckBalance();
    }
}
class BankAccount{
    String accountNumber;
    double balance;
    double amount;
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 500.0;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Updated balance : " + this.balance);
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Updated balance : " + this.balance);
    }
    void checkBalance(){
        System.out.println("Updated balance : " + this.balance);
    }
}