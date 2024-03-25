package LambdaExpressions;

/*
A lambda expression is a short block of code which takes in parameters and returns a value. 
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

*/

interface A
{
//	void show();
	void show(int i);
//	void show(int i,int j);
	

}


public class Demo {
    public static void main(String[] args) {
    	
 //   	A obj=() -> System.out.println("in Show");  
 //   	obj.show();
    	
//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);
    	
//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);
    	
//    	A obj=(int i,int j) ->System.out.println("in show "+i);     //with 2 parameters
//    	obj.show(5,8);
    	
    	A obj=i -> System.out.println("in show "+i);
    	obj.show(5);
    }
}
