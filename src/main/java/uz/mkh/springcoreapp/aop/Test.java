package uz.mkh.springcoreapp.aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import uz.mkh.springcoreapp.aop.A;

public class Test {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

//        A a=factory.getBean("proxy",A.class);
//        System.out.println("proxy class name: "+a.getClass().getName());
//        a.m();

        Validator v =factory.getBean("proxy",Validator.class);
        try {
            v.validate(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
