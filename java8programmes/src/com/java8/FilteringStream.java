package com.java8;


import java.util.*;
import java.util.stream.Collectors;
class product 
{
	
	int id;
	String name;
	float price;
	
	public void Product(int id,String name,float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}

}

public class FilteringStream {
	public static void main(String[] args) {
		
		List<product> productList=new ArrayList<product>();
		
		//Adding Products
		
		productList.add(new product());
		productList.add(new Product(2,"Dell Laptop",3000f));
		productList.add(new Product(3,"Lenovo Laptop",4000f));
		productList.add(new Product(4,"Sony Laptop",5000f));
		productList.add(new Product(5,"Apple Laptop",6000f));
		
		List<Float> productPriceList2=productList.stream()
				.filter(p ->p.price>3000)
				.map(p->p.price)
				.collect(Collectors.toList());
		
		System.out.println(productPriceList2);
	}
}

