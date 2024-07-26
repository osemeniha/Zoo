package zoo;

public class Test {
	public static void main(String args[]) {
		Zoo zoo = new Zoo("ZOOPARK");
		System.out.println("Название зоопарка: " + zoo.getName());
		Aviary aviary1 = new Aviary(1, 50, 3, 1);
		System.out.println("");
		Fish pike = new Fish("Треска", true, true);
		pike.description();
		System.out.println("");
		Bird crow = new Bird("Ворона", true, 43);
		crow.description();
		System.out.println("");
		Beast zebra = new Beast("Зебра", false, "Африка");
		zebra.description();
		for (int i = 0; i < zoo.getAnimal().size(); i++) {
			Animal animal = (Animal) zoo.getAnimal().get(i);
		}
	}
}