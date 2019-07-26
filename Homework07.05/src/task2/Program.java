package task2;

public class Program {

	public static void main(String[] args) {
		
		Pet cat = new Cat();
		Pet dog = new Dog();
		Pet cow = new Cow();
		makePetVoice(cat);
		makePetVoice(dog);
		makePetVoice(cow);

	
	}

	private static void makePetVoice(Pet pet){
		pet.voice();}

}
