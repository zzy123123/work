package 第二题;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.File;
import java.io.IOException;

@Aspect
public class Helper {
    @Before("execution(* 第二题.FileWriterService.write(..))")
    public void createFile(){
        File file = new File(FIleApplicationTest.path);
        System.out.println("Before,创建文件");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @AfterReturning("execution(* 第二题.FileWriterService.destroy(..))")
    public void Close(){
        System.out.println("文件已关闭");
    }

}
