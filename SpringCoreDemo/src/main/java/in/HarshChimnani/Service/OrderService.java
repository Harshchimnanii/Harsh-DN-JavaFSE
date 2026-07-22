package in.HarshChimnani.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentservice;
    @Autowired
    public OrderService(PaymentService paymentservice) {
        this.paymentservice = paymentservice;
    }
    public void placeOrder(){
        paymentservice.pay();
        System.out.println("Order placed");
    }
}
