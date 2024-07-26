package zoo;

class Bird extends Animal {
	private int speed;

	public Bird(String name, boolean predator, int speed) {
		super(name, predator);
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void description() {
		System.out.println("Класс: птица");
		System.out.println("Название животного: " + this.getName());
		System.out.println("Хищник: " + this.getPredator());
		System.out.println("Скорость полёта: " + this.getSpeed());
	}
}