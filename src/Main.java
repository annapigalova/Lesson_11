
import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.Store;
import model.StoreList;

public class Main {

	public static void main(String[] args) {

		List<Store> storeList = new ArrayList<>();

		StoreList st = new StoreList();

		st.readFromJson("WarehouseFile.json");

		storeList = st.getStoreList();

		for (int i = 0; i < storeList.size(); i++) {

			System.out.println(storeList.get(i));

			for (int j = 0; j < storeList.get(i).getProductList().size(); j++) {
				System.out.println(storeList.get(i).getProductList().get(j));
			}
		}

		Product pr = new Product();

		pr.setCategory("Book");
		pr.setManufacturerCode("AAA200");
		pr.setName("War and peace");
		pr.setDescription("QWE");
		
		for (int i = 0; i < storeList.size(); i++) {
			if (storeList.get(i).getStoreNumber() == 2){
				storeList.get(i).addProduct(pr);
			}
		}
		st.saveToFile("WarehouseFile.json");
		
	}
	

}
