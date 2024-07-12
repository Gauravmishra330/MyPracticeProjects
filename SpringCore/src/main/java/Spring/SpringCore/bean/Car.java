package Spring.SpringCore.bean;

import java.io.Serializable;

public class Car implements Serializable{
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
@Override
	public String toString() {
		return "Car [carno=" + carno + ", carnam=" + carnam + ", engine=" + engine + "]";
	}
//autowiring ex
private int carno;
private String carnam;
private Engine engine;

public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public Car(int carno, String carnam) {
	
	this.carno = carno;
	this.carnam = carnam;
}

public int getCarno() {
	return carno;
}
public void setCarno(int carno) {
	this.carno = carno;
}
public String getCarnam() {
	return carnam;
}
public void setCarnam(String carnam) {
	this.carnam = carnam;
}

}
