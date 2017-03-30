package model;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StoreList {

	private List<Store> storeList;
//do method boolean(read or not) and consequently add getter for storeList
	
	public List<Store> readFromJson(String filename) {
		
		try {
			Gson gson = new Gson();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			Type type = new TypeToken<List<Store>>(){}.getType();
			
			addAllElements(gson.fromJson(br, type));
		} catch (IOException e) {
			e.printStackTrace();

		}
		return storeList;

	}
	
	public void addElement(Store st){
		if (storeList == null) {
			storeList = new ArrayList<>();
		}
		storeList.add(st);
	}
	
	public void addAllElements(List<Store> list) {
		if (storeList == null) {
			storeList = new ArrayList<>();
		}
		
		storeList.addAll(list);
	}
	
	
	

}