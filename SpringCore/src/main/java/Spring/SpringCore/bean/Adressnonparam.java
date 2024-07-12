package Spring.SpringCore.bean;

public class Adressnonparam {
	private int hno;
private String city;

@Override
public String toString() {
	return "Adressnonparam [hno=" + hno + ", city=" + city + ", state=" + state + "]";
}
public Adressnonparam() {
	super();
	// TODO Auto-generated constructor stub
}
private String state;
public Adressnonparam(int hno, String city, String state) {
	super();
	this.hno = hno;
	this.city = city;
	this.state = state;
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
