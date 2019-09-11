import java.util.*;

// Comparator Class
// Compare(obj, obj)
// compares names first, then number of legs
public class AnimalCompare implements Comparator<Animal> {

	//static final Comparator<Animal> nameThenLegs = new Comparator<Animal>() {
		
		
		public int compare(Animal a1, Animal a2) {
			
			int nameEquals = a1.name.compareTo(a2.name);
			
			if(nameEquals < 0) { // first name is "less" than String argument
				return -1;
			} else if(nameEquals > 0) { // first name is "greater" than String argument
				return 1;
			} else { // names are the same
				
				if(a1.legs < a2.legs) {
					return -1;
				} else if(a1.legs > a2.legs) {
					return 1;
				} else { // number of legs are equal (& name)
					return 0; 
				}
			}
		}
	//};
	
	
}
