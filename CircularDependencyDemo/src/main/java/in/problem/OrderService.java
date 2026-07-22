package in.problem;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {
    public PaymentService paymentservice;
    @Autowired
    public void setPaymentservice(PaymentService paymentservice) {
        this.paymentservice = paymentservice;
    }

    //    public OrderService(PaymentService paymentservice) {
//        this.paymentservice = paymentservice;
//    }
    public void placeorder(){
        paymentservice.pay();
        System.out.println("Order Placed");
    }

    public void getdetails() {
        System.out.println("Details of order");
    }
}
