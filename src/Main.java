
import java.util.List;

import model.Store;
import model.StoreList;

public class Main {

	public static void main(String[] args) {
		
		StoreList st = new StoreList();
		List<Store> storeList = st.readFromJson("WarehouseFile.json");
		
		for (int i = 0; i < storeList.size(); i++)
			System.out.println(storeList.get(i));
		
		
	}
}
