package Spring.SpringCore.bean;

import java.io.Serializable;

public class Personnonparam implements Serializable{
private int id;
private String name;
private Adressnonparam address;

@Override
public String toString() {
	return "Personnonparam [id=" + id + ", name=" + name + ", address=" + address + "]";
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
public Adressnonparam getAddress() {
	return address;
}
public void setAddress(Adressnonparam address) {
	this.address = address;
}

}
