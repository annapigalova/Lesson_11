package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Store {

	private int storeNumber;
	private ArrayList<Product> productList = new ArrayList<>();

	public int getStoreNumber() {
		return storeNumber;
	}

	public void setStoreNumber(int storeNumber) {
		this.storeNumber = storeNumber;
	}
	

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void addProduct(Product p) {
		productList.add(p);

	}

	private static Comparator<Product> sortByCategoryComp = new Comparator<Product>() {
		public int compare(Product p1, Product p2) {

			int categorySort = p1.getCategory().compareTo(p2.getCategory());
			return categorySort;
		}

	};

	public void sortByCategory(ArrayList<Product> productList) {
		Collections.sort(productList, sortByCategoryComp);
	}

	private static Comparator<Product> sortByMnfCodeComp = new Comparator<Product>() {
		public int compare(Product p1, Product p2) {

			int mnfCodeSort = p1.getManufacturerCode().compareTo(p2.getManufacturerCode());
			return mnfCodeSort;
		}

	};

	public void sortByMnfCode(ArrayList<Product> productList) {
		Collections.sort(productList, sortByMnfCodeComp);
	}

	public ArrayList<Product> searchByCategory(String category) {

		ArrayList<Product> searchCategoryList = new ArrayList<>();
		for (Product product : productList) {
			if (product.getCategory().equals(category)) {
				searchCategoryList.add(product);
			}
		}

		return productList;

	}

	public ArrayList<Product> searchByDate(Date date)

	{
		ArrayList<Product> searchDateList = new ArrayList<>();

		for (Product product : productList) {
			if (product.getCreationDate().equals(date)) {
				searchDateList.add(product);
			}
		}

		return searchDateList;

	}

	public ArrayList<Product> searchByMnfCode(String code) {
		ArrayList<Product> searchMnfCodeList = new ArrayList<>();

		for (Product product : productList) {
			if (product.getManufacturerCode().equals(code)) {
				searchMnfCodeList.add(product);
			}
		}

		return searchMnfCodeList;
	}

	public ArrayList<Product> searchByDescription(String desc) {
		ArrayList<Product> searchByDescList = new ArrayList<>();

		for (Product product : productList) {
			if (product.getDescription().toLowerCase().contains(desc.toLowerCase())) {
				searchByDescList.add(product);
			}
		}

		return searchByDescList;

	}

	public ArrayList<Product> searchByCategoryMnfCode(String category, String code) {

		ArrayList<Product> searchResult = new ArrayList<>();

		for (Product product : productList) {
			if (product.getCategory().equals(category) && product.getManufacturerCode().equals(code)) {
				searchResult.add(product);
			}
		}

		return searchResult;
	}

	@Override
	public String toString() {
		
		return "Store Number: " + getStoreNumber();
	}

}
