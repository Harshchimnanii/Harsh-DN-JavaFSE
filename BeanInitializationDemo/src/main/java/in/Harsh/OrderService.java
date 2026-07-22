package in.Harsh;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
//@Lazy // for lazy initialization
public class OrderService {
    public PaymentService paymentservice;

    public OrderService(@Lazy PaymentService paymentservice) {
        this.paymentservice = paymentservice;
        System.out.println("os created");
    }
    public void placeOrder(){
        paymentservice.pay();
        System.out.println("Order Placed");
    }

    public void getOrderDetails() {
        System.out.println("take the details ");
    }
}
