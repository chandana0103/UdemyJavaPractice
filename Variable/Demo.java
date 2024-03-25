public class Demo{
    public static void main(String args[]){
        int n=153;       //int=4bytes
        String s="chandu";
        byte b=22;     //byte=1byte
        short sh=544;   //short=2bytes
        long l=5473l;
        float f=34.54f;
        double d=34.54;

        boolean boo=true;
        char c='s';     //char =2bytes
        char c2='8';

        System.out.println(n+" "+s+" "+b);
        System.out.println(l+" "+sh+" "+f);
        System.out.println(d+" "+c+" "+c2+boo);
        //System.out.println(l+" "+sh+" "+f);


        int n1=0120;
        System.out.println(n1);

        byte x=127;
        int y=x;        //conversion
        System.out.println(y);

        int a1=257;
        byte b1=(byte)a1;   //casting
        System.out.println(b1);

    }
}