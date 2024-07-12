package Spring.SpringCore.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressMain {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("nonparam.xml");
		Personnonparam address= factory.getBean(Personnonparam.class,"person");
		System.out.println(address);

	}

}
