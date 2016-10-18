package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryDriver {
	public static void main(String[] args) 
	{
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/XMLBean.xml");
		Car c= (Car)ap.getBean("cf");
		c.drive();
		
		Car c1= (Car)ap.getBean("cf");
		System.out.println(c==c1);
		
	}
}
