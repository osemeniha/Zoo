package zoo;

abstract class Animal {
	private String name;
	private boolean predator;

	public Animal(String name, boolean predator) {
		this.name = name;
		this.predator = predator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getPredator() {
		return predator;
	}

	public void setPredator(boolean predator) {
		this.predator = predator;

	}

	public abstract void description();
}