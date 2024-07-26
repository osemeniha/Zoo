package zoo;

import java.util.ArrayList;

class Zoo {
	private String name;

	public Zoo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private ArrayList animals = new ArrayList();

	public ArrayList getAnimal() {
		return animals;
	}

}