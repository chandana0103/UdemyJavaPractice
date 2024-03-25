package OOPs;

class A{
    public int add(int n1,int n2){
        return  n1+n2;
    }

    public int sub(int n1,int n2){
        return  n1-n2;
    }
}
class B extends A{
    public int mul(int n1,int n2){
        return  n1*n2;
    }

    public int div(int n1,int n2){
        return  n1/n2;
    }
    //method overriding
    public int add(int n1,int n2){
        return  n1+n2;
    }

    public int sub(int n1,int n2){
        return  n1-n2;
    }
}
public class InheritanceDemo {
    
    public static void main(String args[]){
    B obj=new B();

    int r1=obj.add(32,4);
    int r2=obj.sub(32,4);
    int r3=obj.mul(32,4);
    int r4=obj.div(32,4);

    System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
}
