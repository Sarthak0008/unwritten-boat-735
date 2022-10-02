package com.masai.bean;

public class Course {
	private int courseid;
	private String cname;
	private int fees;
	private String duration;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Course(int courseid, String cname, int fees, String duration) {
		super();
		this.courseid = courseid;
		this.cname = cname;
		this.fees = fees;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", cname=" + cname + ", fees=" + fees + ", duration=" + duration + "]";
	}
	public Course() {
		// TODO Auto-generated constructor stub
	}

}
