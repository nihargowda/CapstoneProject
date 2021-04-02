package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private int productid;
	
	private String username;
	
	private String productname;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Orders(int id, int productid, String username, String productname) {
		super();
		this.id = id;
		this.productid = productid;
		this.username = username;
		this.productname = productname;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	@Override
	public String toString() {
		return "Orders [id=" + id + ", productid=" + productid + ", username=" + username + ", productname="
				+ productname + "]";
	}
	
	
	

}
