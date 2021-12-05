package com.techelevate.bidirectionalmapping.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int school_id;
	private String school_name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "school_id")
	private List<Teachers> teachers;

	public int getSchool_id() {
		return school_id;
	}

	public void setSchool_id(int school_id) {
		this.school_id = school_id;
	}

	

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	

	public List<Teachers> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teachers> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "School [school_id=" + school_id + ", school_name=" + school_name + ", teachers=" + teachers + "]";
	}

}
