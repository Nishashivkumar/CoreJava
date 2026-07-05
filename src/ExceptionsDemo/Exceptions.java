package ExceptionsDemo;

import java.security.PublicKey;

public class Exceptions {
	
	//one try can be followed by mutiple catch blocks
	//catch should be an immediate block after try

	public static void main(String[] args) {
		
		int b=7;
		int c=0;

		try
		{
		//  purchased failed
		    int k=b/c;//
		//int arr[]=new int[5];

		     
		        //System.out.println(arr[7]);
		       
		}

		catch(ArithmeticException et)
		{
		System.out.println("catched the Arithmetic/exception");
		}

		catch(IndexOutOfBoundsException ets)
		{
		System.out.println("catched the IndexBound/exception");
		}
		catch(Exception e)
		{
		//  retry again
		System.out.println("catched the error/exception");
		}
		
//		This will be used in automation scripts to finally close the browser irrespective of test fail/pass
		finally
		{
		System.out.println("delete cookies");//This block is executed irrespective of exception thrown or not
		}

		
//		Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
		
		Exceptions ex = new Exceptions();
		ex.checkAge(19);

	}
	
	public void checkAge(int i) {
		if(i<18) {
			throw new ArithmeticException("Access Denied, your age must be 18 years old ");
		}
		else {
			System.out.println("Access granted");
		}
	}

}
