package in.harsh.springbootcoredemo;

import org.springframework.stereotype.Component;

@Component
public class orderService {
    public PaymentService paymentService;

    public orderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Service created for Order");
    }

    public void PlaceOrder(){
        paymentService.pay();
        System.out.println("order Placed");
    }
}
