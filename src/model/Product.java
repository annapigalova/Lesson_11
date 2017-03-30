package model;

import java.util.Date;

public class Product {

	private String category;
	private String manufacturerCode;
	private Date creationDate;
	private String description;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getManufacturerCode() {
		return manufacturerCode;
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category: "+ getCategory() + System.lineSeparator() + "Date: " + getCreationDate() + System.lineSeparator();
	}
	
	
	
	
	

}
