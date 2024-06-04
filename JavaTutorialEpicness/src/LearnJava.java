import java.util.ArrayList;

public class LearnJava {

	public static void main(String[] args) {
		
		String name = "Ozeias";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		addExclamationPoint("Ozeias");
		String interrogation = addInterrogationPoint("Pq é tão dificil aprender algo");
		System.out.println(interrogation);
		Animal animal = new Animal();
		String dog = animal.iamDog();
		System.out.println(dog);
		ArrayList<Integer> a = new ArrayList<Integer>();
		animal.doStuff();
	}
	
	public static void addExclamationPoint(String s) {
		
		System.out.println(s + "!");
	}
	
	public static String addInterrogationPoint(String s) {
		return s + "?";
	}

}
