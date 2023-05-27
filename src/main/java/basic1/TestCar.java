package basic1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
	Car car=(Car) context.getBean("mycar");
	car.model();
}
}
