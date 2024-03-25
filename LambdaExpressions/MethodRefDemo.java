package LambdaExpressions;


//you canpass the method name inside a specified method this method is responsible for the work for,you have to mention class nam eand objec name to use

interface Sayable{  
    void say();  
}  

public class MethodRefDemo {
    
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String args[]){
       
         
            // Referring static method  
            Sayable sayable = MethodRefDemo::saySomething;  
            // Calling interface method  
            sayable.say();  
        }  

}
