package com.technoelevate.javabasics.assignment2;

public class Technoelevate {
	private int empID;
	private String name;
	private String comingTime;
	private String goingTime;
	private String[] topics=new String[5];
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComingTime() {
		return comingTime;
	}
	public void setComingTime(String comingTime) {
		this.comingTime = comingTime;
	}
	public String getGoingTime() {
		return goingTime;
	}
	public void setGoingTime(String goingTime) {
		this.goingTime = goingTime;
	}
	public String[] getTopics() {
		return topics;
	}
	public void setTopics(String[] topics) {
			this.topics = topics;
	}
}
