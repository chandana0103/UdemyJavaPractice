package OOPs;

class A{        //superclass 

    int age;
    String name;
//constructors
    public A(){ //  defaulty its called
        age=23;
        name="chandu";
        System.out.println("in A");
    }
    public A(int n){    //paramaterized constructor
       // super();      // calls the constructor of super class 
        System.out.println("in A int n");
       
    }
}
    class B extends A{
        public B(){
            super(4);       //it will call parameterized construcotr of A
            System.out.println("in B");
        }
        public B(int n){
            //super(n);     //to call paramterized constructor
            
            this();         //this will excute constructor of same class
            System.out.println("in B int n");
           
        }
    }
    //getters and setters
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
public class This_super {
    
    public static void main(String args[]){

       // A obj=new A();
        // obj.getName();
       // System.out.println(obj);

       // B obj1 =new B();
        //with one object want to call 2 constructors so this keyword is used.

    }

}