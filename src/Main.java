
import java.util.ArrayList;
import java.util.List;

import controller.StoreController;
import model.Product;
import model.Store;
import model.StoreListModel;
import view.View;
import view.ViewConsole;

public class Main {

	public static void main(String[] args) {
		View view = new ViewConsole();
		StoreListModel model = new StoreListModel(view);
		StoreController st = new StoreController(model);
        
		st.doWork();
	}

}
