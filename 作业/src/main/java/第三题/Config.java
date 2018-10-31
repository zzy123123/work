package 第三题;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class Config {
    @Bean
   public BookService bookService(){
        return new BookService();
    }
    @Bean
    public PhoneService phoneService(){
        return new PhoneService();
    }
    @Bean
    public joinPointAop jAop(){
        return new joinPointAop();
    }
}
