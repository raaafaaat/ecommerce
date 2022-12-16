package com.csf.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity   
	@Entity  
	//defining class name as Table name  
	@Table  
	public class Product  
	{  
		//Defining Product id as primary key  
		@Id  
		@Column  
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;  
		@Column  
		private String name;  
		@Column  
		private double price;  
		@Column
		private int qte;
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
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQte() {
			return qte;
		}
		public void setQte(int qte) {
			this.qte = qte;
		}
		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qte=" + qte + "]";
		}  
		
}
