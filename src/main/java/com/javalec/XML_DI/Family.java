package com.javalec.XML_DI;

public class Family {

	String fatherName;
	String motherName;
	String sisterName;
	String brotherName;
	
	public Family(String fatherName, String motherName) {
		//specified constructor
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	//need getters for fatherName and motherName
	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	//need setter and getter for sisterName and brotherName
	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public String getBrotherName() {
		return brotherName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	
	
}
