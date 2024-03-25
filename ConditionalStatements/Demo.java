public class Demo{

    public static void main(String args[]){
    
    int n1=323,n2=42;
//if else
    if(n1>n2)
        System.out.println("n1>n2");
    else
          System.out.println("no");    
    
    int  result= n1%2==0 ? 10 : 20 ;   //ternary operator
    System.out.println(result);

//switch condition
    int n=2;
    switch(n){

        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("wednesday");
            break;
        case 4:
            System.out.println("thursday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("saturday");
            break;
        case 7:
            System.out.println("sunday");

            break;
        default: System.out.println("enter a valid number");
    }


    //loops--for loop,while loop.do while

        int i=1;

        while(i<=4){
        System.out.println("hi"+i);
            int j=1;
            while(j<=3){
                System.out.println("hello"+j);
                j++;
            }
        i++;
        }
        System.out.println("bye"+i);

        int i2 = 100,j = 300;
        while(++i2 < --j);
        System.out.println("i2= "+i2);

        for(int i1=1;i1<=3;i1++){
            System.out.println("day "+i1);
            
            for(int j1=1;j1<=9;j1++){
            System.out.println(" "+(j1+5)+" : "+j1);
            }
        }

        String password[] = { "XY01", "XY02", "XY03", "XY04"};

        String result1 =" ";

            for(int i9= password.length-1; i9>=2; i9--) {

                result1 = result1 + password[i9];

            }

            System.out.println(result1); 

    
    }
}