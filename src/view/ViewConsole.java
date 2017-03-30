package view;



public class ViewConsole implements View {

	@Override
	public void successRead() {

		System.out.println("Read");
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

}
