package javaCamp3;

public class User {
	private String id;
	private String name;
	private String surName;
	
	
	public User() {
		
	}
	
	public User(String id, String name, String surName) {
		
		this.id = id;
		this.name = name;
		this.surName = surName;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
}