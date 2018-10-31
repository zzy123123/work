package 第三题;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        BookService bookService= (BookService) context.getBean("bookService");
        PhoneService phoneService= (PhoneService) context.getBean("phoneService");
        bookService.addBook();
        bookService.selectBook();
        phoneService.addPhone();
        phoneService.selectPhone();
    }
}
