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

public class StoreList {

	private List<Store> storeList;

	public boolean readFromJson(String filename) {

		try {

			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			BufferedReader br = new BufferedReader(new FileReader(filename));
			Type type = new TypeToken<List<Store>>() {
			}.getType();
			addAllElements(gson.fromJson(br, type));

			return true;

		} catch (IOException e) {
			e.printStackTrace();

		}
		return false;

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

	public boolean saveToFile(String filename) {

		try (Writer writer = new FileWriter(filename)) {
			Gson gson = new GsonBuilder().create();
			gson.toJson(storeList, writer);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}