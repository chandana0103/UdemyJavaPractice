package OOPs;

//class-class->extends
//class-interface->implements
//interface-interface->extends

interface A{
    int age=32;     //final and static
    String name="chandu";

    void show();
    void add();
}
interface X{
    void read();
}
class B implements A,X{     //mutilple inheritence will work here

    public void show() {
        System.out.println("in show ");
    }

    public void add() {
        System.out.println("in add ");

    }
    public void read(){
        System.out.println("in reading ");

    }

}
public class InterfaceDemo {
    
    public static void main(String args[]){
        A obj;
        obj=new B();

        obj.show();
        obj.add();
        
        X obj1=new B();
        obj1.read();

        System.out.println(A.name);


    }
}
