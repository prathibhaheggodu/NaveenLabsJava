package finalfinallyfinalyse;

public class FinaliseConcept {
	
	public void finalize()   // automatically will be called to perform the clean up process
	                           // before garbage collector finalize method called to clean up 
	{ System.out.println("finalise method....................");

	}
	

	public static void main(String[] args) 
	{ 
		
		FinaliseConcept f1=new FinaliseConcept(); // f1 object created
		FinaliseConcept f2=new FinaliseConcept(); // f2 object created
		FinaliseConcept f3=new  FinaliseConcept();
		 
		f1=null;  //assigning object to null, blank object, without any reference inside memory
		f2=null; 
		f3=null;// assigning object to null
		 // two blank objects , no one is referring to  f1 and f2 inside the memory
		// Garbage collector will come inside memory,and destroy  all the null objects as no object reference gcto free some memory
		// can call garbage collector manually also
		
		System.gc();
		
		
		
		
	}
}
