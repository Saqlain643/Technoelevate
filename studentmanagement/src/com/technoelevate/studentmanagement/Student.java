package com.technoelevate.studentmanagement;

public class Student {
	private int id,age,marks;
	private long phoneNumber;
	private String name,gender;
	public Student(int id, int age, int marks, long phoneNumber, String name, String gender) {
		this.id = id;
		this.age = age;
		this.marks = marks;
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "id=" + id + " age=" + age + " marks=" + marks + " phoneNumber=" + phoneNumber + " name="
				+ name + " gender=" + gender+"\n";
	}
	
}
