/**
 * 
 */
package com.oreilly.springdata.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author acogoluegnes
 *
 */
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6648416741847674063L;

	public Product(String id) {
		super();
		this.id = id;
	}
	
	public Product() {
	}

	private String id;	
	private String name;	
	private String description;	
	private String price;

	private String date;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	@NotNull
//	@Min(0)
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return id + "," + name + "," + description + "," + price; 		
	}
	
}
