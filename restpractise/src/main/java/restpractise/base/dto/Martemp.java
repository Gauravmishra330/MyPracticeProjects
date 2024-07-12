package restpractise.base.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Martemp {
	@Id
private int id;
private String name;
private String pwd;
}
