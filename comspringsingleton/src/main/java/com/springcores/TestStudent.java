package com.springcores;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestStudent
{
  @Value("Altaf Malik Mumbai")
  private String studentName;
  @Value("Altaf Malik Mumbai")
  private String city;
  
  @Value("#{temp}")
  private List<String> address;
  
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "TestStudent [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
}
  

}
