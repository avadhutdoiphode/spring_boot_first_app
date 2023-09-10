package com.springboot.first.app;

public class Student 
{
  private String firstname;
  private String Lastname;
  
  
  
  public Student(String firstname, String lastname) 
  {
	
	this.firstname = firstname;
	this.Lastname = lastname;
  }
  public String getFirstname()
  {
	  return firstname;
  }
  public void setFirstname(String firstname) 
  {
	this.firstname = firstname;
  }
  public String getLastname() 
  {
	return Lastname;
  }
 public void setLastname(String lastname) 
 {
	Lastname = lastname;
 }
  
}
