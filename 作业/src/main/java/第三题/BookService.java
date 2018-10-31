package 第三题;

import org.springframework.stereotype.Component;

@Component
public class BookService  extends  Service{
    public void addBook(){
        System.out.println("添加一本书");
    }
    public void delBook(){
        System.out.println("删除一本书");
    }
    public void updateBook(){
        System.out.println("修改书");
    }
    public void selectBook(){
        System.out.println("查询书");
    }
}
