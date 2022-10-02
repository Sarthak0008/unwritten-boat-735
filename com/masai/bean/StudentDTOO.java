package com.masai.bean;

public class StudentDTOO {
	
	private int roll;
	private String username;
	private String name;
	private String address;
	private String mobile;
	
	private int courseid;
	private String cname;
	private int fees;
	private String duration;
	
	private int batchno;
	private int seats;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
	public int getBatchno() {
		return batchno;
	}
	public void setBatchno(int batchno) {
		this.batchno = batchno;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "StudentsDTOO [roll=" + roll + ", username=" + username + ", name=" + name + ", address=" + address
				+ ", mobile=" + mobile + ", courseid=" + courseid + ", cname=" + cname + ", fees=" + fees
				+ ", duration=" + duration + ", batchno=" + batchno + ", seats=" + seats + "]";
	}
	public StudentDTOO(int roll, String username, String name, String address, String mobile, int courseid,
			String cname, int fees, String duration, int batchno, int seats) {
		super();
		this.roll = roll;
		this.username = username;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.courseid = courseid;
		this.cname = cname;
		this.fees = fees;
		this.duration = duration;
		this.batchno = batchno;
		this.seats = seats;
	}
	
	public StudentDTOO() {
		// TODO Auto-generated constructor stub
	}

}
