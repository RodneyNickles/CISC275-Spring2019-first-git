
public class Dog implements Animal{
 Integer legs =0;
 String name = "";
 
 	public Dog(String name, int legs) {
 		setLegs(legs);
 		setName(name);
 	}

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 	
 	
}
