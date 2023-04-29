package uz.mkh.springcoreapp.aspectJs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Operation e = (Operation) context.getBean("opBean");
        Operation op = (Operation) context.getBean("opBean");
//        System.out.println("calling msg...");
//        e.msg();
//        System.out.println("calling m...");
//        e.m();
//        System.out.println("calling k...");
//        e.k();
//        op.msg();
//        op.display();
        System.out.println("calling validate...");
        try{
            op.validate(19);
        }catch(Exception e){System.out.println(e);}
        System.out.println("calling validate again...");

        try{
            op.validate(11);
        }catch(Exception e){System.out.println(e);}
    }

}

