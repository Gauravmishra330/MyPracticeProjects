package Spring.SpringCore.bean;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StidentSpringMain {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
		StudentSpring student= (StudentSpring)factory.getBean("student");
		System.out.println(student.getS_id());
		System.out.println(student.getS_name());
		System.out.println(student.getS_gender());
		
		StudentSpring student1= (StudentSpring)factory.getBean("student1");
		System.out.println(student1.getS_id());
		System.out.println(student1.getS_name());
		System.out.println(student1.getS_gender());
	}

}
