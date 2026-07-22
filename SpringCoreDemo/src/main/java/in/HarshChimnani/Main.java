package in.HarshChimnani;

import in.BloodWork.CartService;
import in.HarshChimnani.PaymentHandling.CardPayment;
import in.HarshChimnani.PaymentHandling.Payment;
import in.HarshChimnani.Service.OrderService;
import in.HarshChimnani.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        paymentService paid = new paymentService();
//        //dependencyInjection
//        OrderService order = new OrderService(paid);
//        order.placeOrder();
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
//        Payment pay = context.getBean("cardPayment" , Payment.class);
//        CartService cs = new CartService();
//        cs.addtocart();
//        User User1 = context.getBean(User.class);
//        System.out.println(User1.getName());
//        CartService cart = new CartService();
//        cart.addtocart();
//        Payment pay = new CardPayment();
//        pay.pay();
    }
}