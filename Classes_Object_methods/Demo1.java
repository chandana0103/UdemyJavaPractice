package Classes_Object_methods;

class A{

    public void play(){
        System.out.println("playing");
    }
    public String get(int cost){
        if(cost>=10)
            return "pen";
        else
            return "no";
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int add(int n1,int n2){      //method overloading
        return n1+n2;
    }
}
public class Demo1 {
    public static void main(String args[]){

        A obj=new A();
        obj.play();
        System.out.println(obj.get(10));

        System.out.println(obj.add(10,29,32));      //method overloading
        System.out.println(obj.add(4398,343));

        
    }
}
