package com.Setter;

public class Student {
	
	
	private String name;
	private String city;
	private String mobileNo;
	
	
	
	
	

	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public String getCity() {
		return city;
	}






	public void setCity(String city) {
		this.city = city;
	}






	public String getMobileNo() {
		return mobileNo;
	}






	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}






	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", mobileNo=" + mobileNo + "]";
	}






	public void getMassage(String message) {
		System.out.println("Hello" +message +"," +city);
	}
	
	
	
	
	
	
	
	
	
}
