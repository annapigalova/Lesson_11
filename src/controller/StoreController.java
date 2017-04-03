package controller;

import java.util.Scanner;

import model.Store;
import model.StoreListModel;
import view.View;
import view.ViewConsole;

public class StoreController {
	private StoreListModel storeListModel;
	//private Store store;
	 
	public StoreController(StoreListModel model){
		this.storeListModel = model;
		
	}


	public void doWork() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file name: ");
		String filename = sc.nextLine();

		boolean res = storeListModel.readFromJson(filename);
		if (res){
			System.out.println("Enter category for search: ");
			String category = sc.nextLine();
			storeListModel.searchByCategory(category);
		}

	
	}

	public void addStoreElement(Store store) {
		storeListModel.addElement(store);

	}

	public void saveFile() {
		
	
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file name: ");
		String filename = sc.nextLine();

		storeListModel.saveToFile(filename);

		
	}

}
