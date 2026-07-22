package in.problem;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {
    public OrderService orderService;
    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

//    public PaymentService(OrderService orderService) {
//        this.orderService = orderService;
//    }
    public void pay(){
        System.out.println("paid");
        orderService.getdetails();
    }
}
