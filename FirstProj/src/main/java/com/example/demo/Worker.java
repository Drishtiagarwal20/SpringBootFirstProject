package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Worker {
	private int wid;
	private String name;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void random() {
		
		System.out.println("Random calling..");
	}
	

}
