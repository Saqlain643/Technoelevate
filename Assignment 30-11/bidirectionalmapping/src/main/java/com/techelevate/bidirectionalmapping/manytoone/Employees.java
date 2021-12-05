package com.techelevate.bidirectionalmapping.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employees {
	@Id
	private int e_id;
	private String e_name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "c_id")
	private Company company;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employees [e_id=" + e_id + ", e_name=" + e_name + ", company=" + company + "]";
	}

}
