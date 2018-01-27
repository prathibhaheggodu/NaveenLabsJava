package finalfinallyfinalyse;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
        division();
	}

	public static void test1()

	// static used to avoid creation of object and call method directly

	{
		try {

			System.out.println("inside try block test1 method");

			throw new RuntimeException("test1");

		}

		catch (Exception e)

		{
			System.out.println("inside catch block");

		}

		finally // keyword used along with try catch block

		// whatever written in finally block will get executed after try catch
		{
			System.out.println("inside finally mathod");

		}  System.out.println("........................");// end of finally

	} // end of test1()

	// 2. example of finally
	
	
	public static void test2()
	
	{try {
		System.out.println("inside try block test2");
		
	}
	
	finally
	{
		System.out.println("finally block inside test2 method");
		
	}System.out.println(".......................");
	
     }// end of test2


  //3. example for not catching  the exception

public static void division()

{ int i=10;
try { 
	System.out.println(" inside the try block of division method");
	int k=i/0;  // arithmetic exception
}

catch (NullPointerException e)
{ System.out.println("inside catch block of division");
System.out.println("divide by zero error");
}

finally
{ System.out.println("execute this code even after any exception");
} 
 }// end of division method

}// end of class
