package in.problem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public PaymentService paymentService(){
        return new PaymentService();
    }
    @Bean
    public OrderService orderService(PaymentService PaymentService){
        return new OrderService();
    }
}