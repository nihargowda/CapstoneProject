package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String cuisine;
	
	private int price;
	
	private String image;
	
	private String description;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String name,String image, String cuisine, int price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.price = price;
		this.image=image;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", price=" + price + ", image="
				+ image + ", description=" + description + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
