package in.harsh.springbootcoredemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public PaymentService() {
        System.out.println("service created for payement ");

    }
    public void pay(){
        System.out.println("Amount Paid");
    }
}
