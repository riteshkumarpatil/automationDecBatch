package january;

public class firstmonth {
	
	
	//    static method
	
	public static void year() {
	
		System.out.println("starting month");
	}
	
	public static void year3() {
		
		System.out.println("february is second month");
	}
	
	//    nonstatic method
	
	public void year1() {
		
		 System.out.println("ending month");
	}
	
	public void year2() {
		
		System.out.println("march is third month");
	}
	
	
	
	
	
	

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	// static method calling in main method
		
		
		firstmonth.year();
		year3();
		
		
   //nonstatic method calling in main method
		
		firstmonth jan = new firstmonth();
		jan.year1();
		jan.year2();
		
	
	
	// variable declairation
	
	String name;
	int rollno;
	char grade;
	float percentage;
	
	// Variable initialization
	
	name = "ABC";
	rollno = 25;
	grade = 'B';
	percentage = 90.15f;
	
	// Variable usage
	
	System.out.println("name");
	System.out.println("rollno");
	System.out.println("grade");
	System.out.println("percentage");
	
	
	}
	

}
 
