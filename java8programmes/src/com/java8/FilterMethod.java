package com.java8;

import java.util.*;
class Product {
	
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	}

public class FilterMethod {
	
	public static void main(String[] args) {
		
		List<Product> productsList=new ArrayList<Product>();
		
		//Adding Products
		
		productsList.addAll((Collection<? extends Product>) new product());
		
		productsList.stream()
		.filter(product->product.price==3000)
		.forEach(product-> System.out.println(product.name));
		
	}

}
