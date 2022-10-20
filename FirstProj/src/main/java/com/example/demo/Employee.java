package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") : In this case, the objects will be called only in the case of getbeans()
// singleton scope means that the object will be called by default 
public class Employee {
	private int id;
	private String ename;
	private String tech;
	@Autowired
	private Worker w1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public void getdata(){
		w1.setName("Raju");
		System.out.println("Employee name is: "+getEname());
		System.out.println("Worker name is: "+w1.getName());
	}
	
	

}
