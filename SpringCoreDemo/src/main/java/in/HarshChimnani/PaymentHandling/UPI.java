package in.HarshChimnani.PaymentHandling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
//@Component
//@Qualifier
public class UPI implements Payment{
    @Override
    public void pay(){
        System.out.println("Paid By UPI");
    }
}
