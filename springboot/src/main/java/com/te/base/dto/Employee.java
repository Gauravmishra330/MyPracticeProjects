package com.te.base.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Component
public class Employee {
	@Id
	private int empid;
	private String name;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dob;
	private String address;

}
