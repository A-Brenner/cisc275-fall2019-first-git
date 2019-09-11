import java.util.*;

// Dog is an animal
public class Dog extends Animal {
	
	// Constructor
	Dog(String name, int numLegs){
		this.name = name;
		legs = numLegs;
	}
	
	// returns the name of dog along with the number of legs
	@Override
	public String toString() {
		return name + " " + legs;
	}
			
	
	public static void main(String[] args) {
		
		// create an array of Dogs, place three in it
		// Two Dogs must have same name, but different number of legs
		ArrayList<Dog> pack = new ArrayList<>();
		Dog dog1 = new Dog("Penguin", 4);
		Dog dog2 = new Dog("Fido", 4);
		Dog dog3 = new Dog("Johnny", 2);
		Dog dog4 = new Dog("Penguin", 3);
		pack.add(dog1);
		pack.add(dog2);
		pack.add(dog3);
		pack.add(dog4);
		System.out.println(pack);
		
		Collections.sort(pack, new AnimalCompare()); // sorted using comparator (external)
		System.out.println(pack); 
		
		
		Collections.sort(pack); // uses Comparable from Animal class
		System.out.println(pack);
		
		
		
		
		
	}
		
		
}
