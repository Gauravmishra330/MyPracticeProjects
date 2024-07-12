package Spring.SpringCore.bean;

import java.io.Serializable;

public class StudentSpring implements Serializable {
	private int s_id;
	private String s_name;
	private String s_gender;

	public StudentSpring() {
	}



	



	public StudentSpring(int s_id, String s_name, String s_gender) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_gender = s_gender;
	}







	public int getS_id() {
		return s_id;
	}







	public void setS_id(int s_id) {
		this.s_id = s_id;
	}







	public String getS_name() {
		return s_name;
	}







	public void setS_name(String s_name) {
		this.s_name = s_name;
	}







	public String getS_gender() {
		return s_gender;
	}







	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
}
