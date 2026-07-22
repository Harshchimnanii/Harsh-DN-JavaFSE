package in.Harsh;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy // for lazy initialization
public class PaymentService {
    public OrderService orderService;

    public PaymentService(@Lazy OrderService orderService) {
        this.orderService = orderService;

        System.out.println("ps created");
    }
    public void pay(){
        System.out.println("Paid");
        orderService.getOrderDetails();
    }


}
