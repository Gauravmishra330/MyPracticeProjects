package Spring.SpringCore.bean;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable{
private List<String> names;
private Set<Integer> ids;
private Map<Integer, String> dept;

public Employee(List<String> names, Set<Integer> ids, Map<Integer, String> dept) {
	
	this.names = names;
	this.ids = ids;
	this.dept = dept;
}
public Employee() {
}
@Override
public String toString() {
	return "Employee [names=" + names + ", ids=" + ids + ", dept=" + dept + "]";
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Set<Integer> getIds() {
	return ids;
}
public void setIds(Set<Integer> ids) {
	this.ids = ids;
}
public Map<Integer, String> getDept() {
	return dept;
}
public void setDept(Map<Integer, String> dept) {
	this.dept = dept;
}

	

}
