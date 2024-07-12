package Spring.SpringCore.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("Employeecons.xml");
		Employee employee= factory.getBean(Employee.class,"employee");
		System.out.println(employee);

	}

}
