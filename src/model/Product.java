package model;

import java.util.Date;

public class Product {

	private String category;
	private String manufacturerCode;
	private String name;
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
		return "Category: " + getCategory() + System.lineSeparator() + "Name: " + getName() + System.lineSeparator()
				+ "Manufacturer Code: " + getManufacturerCode() + System.lineSeparator() + "Date: " + getCreationDate()
				+ System.lineSeparator() + "Description: " + getDescription() + System.lineSeparator();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
