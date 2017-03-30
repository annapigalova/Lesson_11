
import java.util.ArrayList;
import model.Store;
import model.StoreList;

public class Main {

	public static void main(String[] args) {
		
		StoreList st = new StoreList();
		ArrayList<Store> storeList = st.readFromJson("WarehouseFile.json");
		
		for (int i = 0; i < storeList.size(); i++)
			System.out.println(storeList.get(i));
		
		
	}
}
