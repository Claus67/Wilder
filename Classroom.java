

public class Classroom {
	
	public static void main(String[] args) {	
		Wilder a = new Wilder ("Andreas",true); 		  
	    Wilder b = new Wilder ("Berthold",false);
	    Wilder c = new Wilder ("Christian", true);	
	    Wilder d = new Wilder ("Dagobert", false);
	    Wilder e = new Wilder ("Erich", true);
	    
	    a.getFirstname();
	    a.isPresent();
	    System.out.println(a.whoAmI());
	    System.out.println(b.whoAmI());
	    System.out.println(c.whoAmI()); 
	    System.out.println(d.whoAmI());
	    System.out.println(e.whoAmI());
	}

	
	
}