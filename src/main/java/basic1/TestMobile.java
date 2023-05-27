package basic1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	public static void main(String[] args) {
//		ClassPathResource resource=new ClassPathResource("ioc.xml");
//		BeanFactory beanFactory=new XmlBeanFactory(resource);
//		Mobile mobile=(Mobile) beanFactory.getBean("mymobile");
//		mobile.musicplay();
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc.xml");
		Mobile mobile=(Mobile) context.getBean("mymobile");
		mobile.musicplay();
	}

}
