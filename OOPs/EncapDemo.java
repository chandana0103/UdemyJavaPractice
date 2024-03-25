package OOPs;

class Person{
   
    private int age;
    private String name;

    //getters and setters
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age =a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
}
public class EncapDemo {
    public static void main(String args[]){

        Person p=new Person();
        // p.age=32;
        // p.name="chandu";

        // System.out.println(p.name);
        p.setAge(23);
        p.setName("chandu");

        System.out.println(p.getAge()+" "+p.getName());
    }
}
