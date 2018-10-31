package 第二题;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class Config {
    @Bean
    public FileWriterService fileWriterService(){
        return new FileWriterService();
    }
    @Bean
    public Helper helper(){
        return  new Helper();
    }
}
