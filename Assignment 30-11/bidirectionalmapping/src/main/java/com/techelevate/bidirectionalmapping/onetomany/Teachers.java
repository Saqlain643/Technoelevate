package com.techelevate.bidirectionalmapping.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacher_id;
	private String teacher_name;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private School school;

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Teachers [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", school=" + school + "]";
	}

}
