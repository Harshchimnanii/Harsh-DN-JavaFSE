package in.HarshChimnani.PaymentHandling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
@Qualifier
public class NetBanking implements Payment{
    public void pay(){
        System.out.println("Paid By NB");
    }
}
