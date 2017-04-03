package model;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import view.View;
import view.ViewConsole;

public class StoreListModel {

	private List<Store> storeList;
	private View view;

	public StoreListModel(View view) {
		this.view = view;
	}

	public boolean readFromJson(String filename) {

		try {

			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			Type type = new TypeToken<List<Store>>() {
			}.getType();
			addAllElements(gson.fromJson(br, type));
			view.successRead();
			return true;

		} catch (IOException e) {
			view.errorRead();
			return false;

		}

	}

	public void addElement(Store st) {
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

	public List<Store> getStoreList() {
		return storeList;
	}

	public void saveToFile(String filename) {

		try (Writer writer = new FileWriter(filename)) {
			Gson gson = new GsonBuilder().create();
			gson.toJson(storeList, writer);
			view.successSave();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			view.errorSave();
		} catch (IOException e) {
			e.printStackTrace();
			view.errorSave();
		}

	}
	
	public void searchByCategory(String category){
		for(Store st : storeList){
			List<Product> listOfProduct = st.searchByCategory(category);
			for(Product pr : listOfProduct){
				view.printSearchResulLine(st, pr);
				
			}
		}
	
	}

}