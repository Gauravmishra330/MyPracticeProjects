package LyfBeanInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LyfBeanInterface implements InitializingBean,DisposableBean{
private int id;
private String name;

@Override
	public void destroy() throws Exception {
	System.out.println("inside destory set");
		
	}
@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside after set");
		
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
