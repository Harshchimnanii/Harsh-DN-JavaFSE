package in.Harsh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
// bean definition 1
 @Bean
 @Scope("Prototype")
    public OrderService order (){
     return new OrderService();
 }
    // bean definition 2
    @Bean
    @Scope("Prototype")
    public OrderService order1 (){
        return new OrderService();
    }
}
