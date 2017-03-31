package view;

public class ViewConsole implements View {

	@Override
	public void successRead() {

		System.out.println("Reading file is successfull");
	}

	@Override
	public void successSave() {
		System.out.println("File is saved successefully");

	}

	@Override
	public void successAdd() {
		System.out.println("Add");

	}

	@Override
	public void successDelete() {
		System.out.println("Delete");

	}

	@Override
	public void errorRead() {

		System.out.println("Reading failed");

	}

	@Override
	public void errorSave() {
		 
		System.out.println("Saving failed");
	}

	@Override
	public void errorAdd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void errorDelete() {
		// TODO Auto-generated method stub

	}

}
