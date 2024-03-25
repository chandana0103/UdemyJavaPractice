public class Demo{
    public static void main(String args[]){

        int n1=5,n2=11;
        int a=23,b=2;

        int r1=n1+n2;       //arithematic operatior
        System.out.println(r1);

        System.out.println(n1<n2);//relation operator
        System.out.println(n1==n2);

        n2 += 23;   //Assignment operator
        System.out.println(n2);

        boolean res=n1>n2 && a<b;   //logical operator
        System.out.println(res);

        int a1 = 3;
        int b1= 6;
        int result = (~a1 & b1) | (a1& ~b1);

        System.out.println("result"+result);

        int x = 5;
        int y = 10;
        int z = (x++ > 5 && y-- < 10) ? x-- : y;

        System.out.println("z="+z);

        System.out.println(n1++);//post increment==fetch the value and then increments
        System.out.println(++n1);//pre increment==increment and then fetch the value
        System.out.println(n1--);
        System.out.println(--n1);
        int r2=++n1;
        System.out.println(r2);
    }
}