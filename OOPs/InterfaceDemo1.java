package OOPs;

@FunctionalInterface
interface Demo{
    void show();
}
class B implements Demo{
    public void show(){
        System.out.println("showing");
    }
}
public class InterfaceDemo1 {
    public static void main(String a[]){
        Demo obj=new B();
        obj.show();
    }
}
