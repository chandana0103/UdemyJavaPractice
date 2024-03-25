package OOPs;
abstract class Car{

    public abstract void drive();   //abstract method
    public abstract void fly();

    public void playMusic(){

        System.out.println("play music");

    }
}          
abstract class WagonR extends Car{

    public void fly(){            //implementation of abstarct class
        System.out.println("11flying");
    }
    public void drive(){

        System.out.println("drving");
    }
}               
class UpdateWagonR extends WagonR{
    public void fly(){            //implementation of abstarct class
        System.out.println("flying");
    }
}      
public class AbstractionDemo {
    
    public static void main(String args[]){

         Car obj=new UpdateWagonR();     //you cant create obj of abstarct class
            obj.drive();
            obj.playMusic();
            obj.fly();
    }

}
