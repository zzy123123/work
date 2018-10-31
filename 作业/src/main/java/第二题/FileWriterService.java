package 第二题;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService {
    public String path;
    FileWriter fileWriter;


    public boolean write(String content){
        path=FIleApplicationTest.path;
        //System.out.println("write"+path);
        File file=new File(path);
        try {
            fileWriter=new FileWriter(path,true);
            fileWriter.write(content);
            System.out.println("已输入");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void destroy() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
