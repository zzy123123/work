package 第二题;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FIleApplicationTest {
   public  static String path="";

    public static void main(String[] args){
        Properties properties=new Properties();
        try {
            FileInputStream in=new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\SpringLearning-master\\src\\main\\resource\\fileApplication.properties");
            properties.load(in);
            path=properties.getProperty("path");
        } catch (IOException e) {
            System.out.println("读取配置文件失败"+e.getMessage());
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        FileWriterService fileWriterService= (FileWriterService) context.getBean("fileWriterService");
        //System.out.println("path:"+path);
        fileWriterService.path=path;
        //System.out.println("servicePath:"+fileWriterService.path);
        fileWriterService.write("Hello");

        fileWriterService.destroy();
    }
}
