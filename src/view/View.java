package view;

import model.Product;
import model.Store;

public interface View {
	
	void successRead();
	void successSave();
	void successAdd();
	void successDelete();
	void errorRead();
	void errorSave();
	void errorAdd();
	void errorDelete();
	void printSearchResulLine(Store store, Product product);
	
	

}
