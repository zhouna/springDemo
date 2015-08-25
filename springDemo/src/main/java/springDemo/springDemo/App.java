package springDemo.springDemo;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zz.service.Person;
import com.zz.service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        
        String[] a = {"周周"};
        String hello = ctx.getMessage("hello", a, Locale.getDefault());
        
        Object[] b = {new Date()};
        String now = ctx.getMessage("now", b, Locale.getDefault());
       
        System.out.println(hello);
        System.out.println(now);
        
        
    }
}
