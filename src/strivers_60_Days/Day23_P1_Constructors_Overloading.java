package strivers_60_Days;

// Constructors Overloading
class Kodnest {
	int id;
	String name;
	String batch;
	
	// Constructor1
	public Kodnest(int id,String name,String batch) {
		this.id = id;
		this.name = name;
		this.batch = batch;
	}
	
	// Constructor2 
	public Kodnest(String name,String batch) {
		this.name = name;
		this.batch=batch;
	}
	
	//Method
	public void displayDetails() {
		System.out.println("Name: "+ name + "  ID: " + id + "  batch: " + batch);
	}
	
}



public class Day23_P1_Constructors_Overloading {

	public static void main(String[] args) {
		Kodnest s1 = new Kodnest(1,"Sunil","March23rd2026");
		s1.displayDetails();
		Kodnest s2 = new Kodnest("Sandesh","March23rd2026");
		s2.displayDetails();

	}

}
