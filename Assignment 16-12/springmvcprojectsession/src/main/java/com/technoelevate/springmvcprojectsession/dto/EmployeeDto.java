package com.technoelevate.springmvcprojectsession.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDto implements Serializable {
	@Id
	@Column(name = "emp_id")
	private int eid;
	@Column(name = "emp_name")
	private String ename;
	@Column(name = "emp_post")
	private String position;
	@Column(name = "emp_pass")
	private String password;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeDto [eid=" + eid + ", ename=" + ename + ", position=" + position + ", password=" + password
				+ "]";
	}

}
