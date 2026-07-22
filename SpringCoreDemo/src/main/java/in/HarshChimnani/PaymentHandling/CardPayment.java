package in.HarshChimnani.PaymentHandling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier
public class Card implements Payment{
    public void pay(){
        System.out.println("Paid By Card");
    }
}
