package controller;

import java.util.Scanner;

import model.Store;
import model.StoreList;
import view.View;
import view.ViewConsole;

public class StoreController {
	private StoreList storeList;
	private Store store;
	private View view;

	public void setStoreNum(int num) {
		store.setStoreNumber(num);
	}

	public int getStoreNum() {
		return store.getStoreNumber();
	}

	public void readFromJson() {

		View viewCons = new ViewConsole();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file name: ");
		String filename = sc.nextLine();

		storeList.readFromJson(filename);

		if (storeList.readFromJson(filename)) {
			viewCons.successRead();
		} else {
			viewCons.errorRead();
		}

	}

	public void addStoreElement(Store store) {
		storeList.addElement(store);

	}

	public void saveFile() {
		
		View viewCons = new ViewConsole();

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a file name: ");
		String filename = sc.nextLine();

		storeList.saveToFile(filename);

		if (storeList.saveToFile(filename)) {
			viewCons.successSave();
		} else {
			viewCons.errorSave();
		}

	}

}
