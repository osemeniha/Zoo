package zoo;

class Fish extends Animal {
	private boolean depth;

	public Fish(String name, boolean predator, boolean depth) {
		super(name, predator);
		this.depth = depth;
	}

	public boolean getDepth() {
		return depth;
	}

	public void setDepth(boolean depth) {
		this.depth = depth;
	}

	public void description() {
		System.out.println("Класс: рыба");
		System.out.println("Название животного: " + this.getName());
		System.out.println("Хищник: " + this.getPredator());
		System.out.println("Глубоководная: " + this.getDepth());
	}

}