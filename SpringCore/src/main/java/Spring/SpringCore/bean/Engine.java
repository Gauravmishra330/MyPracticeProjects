package Spring.SpringCore.bean;

import java.io.Serializable;

public class Engine implements Serializable{
public Engine() {
		
	}
@Override
public String toString() {
	return "Engine [engno=" + engno + ", engnam=" + engnam + "]";
}
private int engno;
private String engnam;
public Engine(int engno, String engnam) {
	super();
	this.engno = engno;
	this.engnam = engnam;
}
public int getEngno() {
	return engno;
}
public void setEngno(int engno) {
	this.engno = engno;
}
public String getEngnam() {
	return engnam;
}
public void setEngnam(String engnam) {
	this.engnam = engnam;
}

}
