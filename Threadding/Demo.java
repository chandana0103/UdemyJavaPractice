package Threadding;
/*
 * Threads:-
 * Multiple threads run at same time in a code.
 * This is known as Multithreading.
 * A thread is a smallest unit to work with. (individual task)
 * They can run parallely.
 * Multiple threads can share resources.
 */

    
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj2.setPriority(Thread.MAX_PRIORITY);
    	System.out.println(obj1.getPriority());
    	
    	obj1.start();
    	try {
			Thread.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
    	obj2.start();
    }
    
}
