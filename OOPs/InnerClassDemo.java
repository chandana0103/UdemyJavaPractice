package OOPs;

class A{
    int a;

    public  void add(){
        System.out.println("add "); 
    }
    class B extends A{
        public  void show(){
            System.out.println("add "); 
    }
}
}
public class InnerClassDemo {
    
    public static void main(String args[]){

         A obj= new A(); //object creation
         obj.add();      //calling method

         A.B obj1=obj.new B();
         obj1.show();

         A obj2=new A()      //object of anaymous inner class
         {
            public  void add(){
                System.out.println(" in ananmous add "); 
        }
         };
         obj2.add();

    }
}
