package zoo;

class Aviary {
	private int number;
	private int size;
	private int max;

	private int now;

	public Aviary(int number, int size, int max, int now) {
		this.number = number;
		this.size = size;
		this.max = max;
		this.now = now;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getNow() {
		return now;
	}

	public void setNow(int now) {
		this.now = now;
	}
}