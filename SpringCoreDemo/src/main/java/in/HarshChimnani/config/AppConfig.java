package in.HarshChimnani.config;

import in.BloodWork.CartService;
import in.HarshChimnani.PaymentHandling.CardPayment;
import in.HarshChimnani.PaymentHandling.NetBanking;
import in.HarshChimnani.PaymentHandling.Payment;
import in.HarshChimnani.PaymentHandling.UPI;
import in.HarshChimnani.Service.OrderService;
import in.HarshChimnani.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.HarshChimnani")
public class AppConfig {
    @Bean
    public User CreateUser()
    {
        return new User("Kashish" , 21);
    }
    @Bean
    public CartService cart(){
        return new CartService();
    }
    @Bean
//    @Primary//    method 1
    @Qualifier("NB") //    method 2
    public Payment payment(){
        return new NetBanking();
    }
    @Bean
    @Qualifier("CP")
    public Payment payment3(){
        return new CardPayment();
    }
    @Bean
    public OrderService order(@Qualifier("CP") Payment payment){
        return new OrderService(payment);
    }


}
