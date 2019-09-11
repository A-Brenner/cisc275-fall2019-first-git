
public class Animal implements Comparable<Animal>{
	// Animal attributes
	String name;
	int legs;


	//getter
	public int getLegs(){
		return legs;
	}

		
	// sort by number of legs, then by name
	@Override
	public int compareTo(Animal otherAnimal) {
		if(this.legs < otherAnimal.legs) {
			return -1;
		} else if (this.legs > otherAnimal.legs) {
			return 1;
		} else { // number of legs are equal
			
			int nameCompare = this.name.compareTo(otherAnimal.name);
			if(nameCompare < 1) {
				return -1;
			} else if(nameCompare > 1) {
				return 1;
			} else { // names are also the same
				return 0;
			}
		}
	} // compareTo
		
		
}
