package Spring.SpringCore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScopetest {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Scope.xml");
	SingletonScope single=(SingletonScope)context.getBean("singleton");
	SingletonScope single1=(SingletonScope)context.getBean("singleton");
System.out.println(single);
System.out.println(single1);

ProtoScope pro=(ProtoScope) context.getBean("proto");
ProtoScope pro1=(ProtoScope) context.getBean("proto");
System.out.println(pro);
System.out.println(pro1);
	}
	

}
