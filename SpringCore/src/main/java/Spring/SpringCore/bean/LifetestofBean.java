package Spring.SpringCore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifetestofBean {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("LifeOfBean.xml");
	LifeOfBean lyf=(LifeOfBean)context.getBean("life");
	System.out.println(lyf);
	((AbstractApplicationContext)context).registerShutdownHook();
}
}
