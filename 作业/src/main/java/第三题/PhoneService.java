package 第三题;

import org.springframework.stereotype.Component;

@Component
public class PhoneService extends  Service{
    public void addPhone(){
        System.out.println("添加手机");
    }
    public void delPhone(){
        System.out.println("删除手机");
    }
    public void updatePhone(){
        System.out.println("修改收集信息");
    }
    public void selectPhone(){
        System.out.println("查询手机");
    }
}
