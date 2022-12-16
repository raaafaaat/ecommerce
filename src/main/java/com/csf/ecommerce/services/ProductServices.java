package com.csf.ecommerce.services;

import java.util.ArrayList;  
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csf.ecommerce.model.Product;
import com.csf.ecommerce.repository.ProductRepository;
 
//defining the business logic  
@Service  
public class ProductServices  
{  
	@Autowired  
	ProductRepository pR ;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Product> getAllProduct()   
	{  
		List<Product> products = new ArrayList<Product>();  
		pR.findAll().forEach(p-> products.add(p));  
		return products;  	
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Product getProductById(int id)   
	{  
		return pR.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Product p)   
	{  
		pR.save(p);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		pR.deleteById(id);  
	}  
}  
