import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 implements Comparator<Animal>{
	
	public MyCompare3(String name, int legs) {
	}

	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
		//Collections.sort(dogs);
		
		System.out.println(dogs);
	}

	public int compareTo(Animal arg0, Animal arg1) {
        return arg0.getName().compareTo(arg1.getName());
	}

	@Override
	public int compare(Animal arg0, Animal arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}
