package LyfBeanInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LyfBeanInterfaceTest {

	public static void main(String[] args) {
AbstractApplicationContext context=new ClassPathXmlApplicationContext("LyfBeanInterface.xml");
LyfBeanInterface lyf=(LyfBeanInterface) context.getBean("life");
System.out.println(lyf);
context.registerShutdownHook();
	}

}
