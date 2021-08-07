package org.hibernate.entity;

import javax.persistence.*;

@Entity(name ="alien")  //we should always give entity a  name same as table name by this name this class will be refrenced
@Table(name="alien")
public class alien {
	
	@Id
	@Column(name="id")
	int id;
	@Column(name="name")
	String name;
	
	
	public alien() {
	}
	public alien(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "alien [id=" + id + ", name=" + name + "]";
	}
	
	
}
