package zoo;

class Beast extends Animal {
	private String habitat;
	
	public Beast(String name, boolean predator, String habitat) {
		super(name, predator);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void description() {
		System.out.println("Класс: зверь");
		System.out.println("Название животного: " + this.getName());
		System.out.println("Хищник: " + this.getPredator());
		System.out.println("Среда обитания: " + this.getHabitat());
	}
}