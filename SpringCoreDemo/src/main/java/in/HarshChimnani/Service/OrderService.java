package in.HarshChimnani.Service;

import in.HarshChimnani.PaymentHandling.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    public Payment payment;
    public OrderService( Payment payment) {
        this.payment = payment;
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order placed");
    }
}
