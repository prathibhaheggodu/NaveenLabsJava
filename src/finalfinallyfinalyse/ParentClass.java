package finalfinallyfinalyse;

   /*  Demo for final class...prohibit from inheritance
    
    public final class ParentClass {
    

		public void start()
		{ System.out.println("Parent start method................");
		  // overriden in child class
      // to avoid  this inheritance we use final keyword in defining class
		
		// public final class  ParentClass.. so we get error in Child CLass saying remove final modifier
		
		}}

		*/
		
		
 //  Demo for final method...to avoid method overriding


public class ParentClass {
	
	public final void start() // shows error in method of child class
	
	{ System.out.println("Parent class....start method");}
	
}

