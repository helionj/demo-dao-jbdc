package model.entities;

import java.io.Serializable;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	public Department(String name) {
		
		this.name = name;
	}
	
	public Department() {}

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
