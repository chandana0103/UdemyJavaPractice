package Classes_Object_methods;
class A{
    int a;

    // public A(){
    //     System.out.println("object");
    // }
    public  void add(){
        System.out.println("add ");
      //  return 0;
    }
}
public class Demo {
    public static void main(String args[]){

         A obj= new A(); //object creation
         obj.add();      //calling method

        //new A();        //anonyms object
        //new A().add();

        int n1=3;
        int n2=5;
        System.out.println(n1+n2);
    }
}
