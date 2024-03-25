package Classes_Object_methods;

class Mobile{

    String brand;
    int price;
    static String name;     //static varaiable

    public void show(){

        System.out.println(brand+" "+name+" " +price);
    }
    
    public static void show1(Mobile obj){   //static method

        System.out.println("static method: "+obj.brand+" "+name+" " +obj.price);
    }

    static {
        name="phone";
        System.out.println("in static bloc");
    }

}
public class StaticDemo {
    
    public static void main(String args[]) throws ClassNotFoundException{

        Mobile obj1=new Mobile();
        obj1.brand="apple";
        obj1.price=87333;
        Mobile.name="smartphone";
        
        Mobile obj2=new Mobile();
        obj2.brand="samsung";
        obj2.price=87333;
        Mobile.name="smartphone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj2);

        Class.forName("Mobile");
    }
}
