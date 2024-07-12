package com.te.base.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@Entity
public class Employee {

private int age;
private String name;
private String job;
private int salary;
}
