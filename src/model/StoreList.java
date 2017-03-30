package model;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class StoreList {

	private ArrayList<Store> storeList = new ArrayList<>();

	public ArrayList<Store> readFromJson(String filename) {

		
		try {
			Gson gson = new Gson();
			JsonParser jsonParser = new JsonParser();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			JsonElement jsonElement = jsonParser.parse(br);
			
			Type type = new TypeToken<List<Store>>() {}.getType();
			storeList = gson.fromJson(jsonElement, type);
		//	System.out.println("Q");
			return storeList;
		} catch (IOException e) {
			e.printStackTrace();

		}
		return storeList;

	}
	
	public void addElement(Store st){
		storeList.add(st);
	}
	

	

}