package Array_String;

public class Sdemo {
    
    public static void  main (String args[]){

        String name=new String("chandu");

        System.out.println("hello "+name);

        String s1="Chandana";
        String s2="Chandana";

        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("chotu");

        System.out.println(sb.capacity());
        System.out.println(sb.append("hi"));
        System.out.println(sb.indexOf("o"));
        System.out.println(sb.equals(s2));


    }
}
