package Task1.Servlet;

import Task1.Bean.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan
//@ImportResource("classpath:app-config.xml")
public class Starter{
    public static void main(String[] args){
        ConfigurableApplicationContext context=SpringApplication.run(Starter.class, args);
        Employee pers=(Employee) context.getBean("person");
    }
}
