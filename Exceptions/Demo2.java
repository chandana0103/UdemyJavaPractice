package Exceptions;
/*
 * Error and Exception extends Throwable class.
Throwable class is extended by Object class.

Error is divided into :-
1. Thread Death
2. Virtual Machine error ( Out of memory)
3. IO Error

Exception is divided into:-
1. Runtime Exception  (Unchecked Exception)
	- Arithmetic 
	- ArrayIndexOutOfBound
	- Null POinter
- It is your choose to handle or not

2. SQL Exception   (Checked Exception)
- It is necessary to handle

3. IO Exception  (Checked Exception)
- It is necessary to handle
 */

class MYException extends Exception
{
	public MYException(String string)
	{
		super(string);
	}
}
public class Demo2 {
    public static void main(String[] args) {
    	
//    	int i=2;
//   	int i=0;
    	int i=20;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new MYException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
