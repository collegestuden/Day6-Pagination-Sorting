package com.example.demo.GroceryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="groceryitems")
public class GroceryEntity {
	@Id

	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="brand")
	private String brand;
	@Column(name="rack")
	private String rack;
	@Column(name="section")
	private String section;
	
	
	public GroceryEntity(int sid, String sname,String brand,String rack,String section) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.brand = brand;
		this.rack = rack;
		this.section = section;
	}
	public GroceryEntity() {
		
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
		
	}
	public String getrackk() {
		return rack;
	}
	public void setrackk(String rack) {
		this.rack = rack;
		
	}
	public String getsection() {
		return section;
	}
	public void setsection(String section) {
		this.section = section;
	
	}
	public String toString() {
		return "ID="+sid+"NAME="+sname+"BRAND="+brand+"RACK="+rack+"SECTION="+section;
	}
}