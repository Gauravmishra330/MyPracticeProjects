package Spring.SpringCore.bean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngine {

	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("carengine.xml");
	Car car= (Car) factory.getBean("car");
	System.out.println(car);
		System.out.println(car.getCarno());
		System.out.println(car.getCarnam());

	}

}
