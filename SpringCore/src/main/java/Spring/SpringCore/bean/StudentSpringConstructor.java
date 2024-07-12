package Spring.SpringCore.bean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentSpringConstructor {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
		StudentSpring stu=(StudentSpring) factory.getBean("student3");
		System.out.println(stu.getS_id());
		System.out.println(stu.getS_name());
		System.out.println(stu.getS_gender());
	}

}
