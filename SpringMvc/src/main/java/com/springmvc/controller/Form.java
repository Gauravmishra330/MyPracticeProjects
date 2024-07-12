package com.springmvc.controller;

import java.io.Serializable;

public class Form implements Serializable {
private String eid;
private String ename;
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
@Override
public String toString() {
	return "Form [eid=" + eid + ", ename=" + ename + "]";
}

}
