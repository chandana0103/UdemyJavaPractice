package Array_String;

class Student {
    int rollno; 
    String name;
    int marks;
}

public class Demo {
    public static void main(String args[]){

        int n1[]={1,23,34,54};
        System.out.println(n1[3]);

        int n3[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                n3[i][j]=(int)(Math.random()*10);
                System.out.print(n3[i][j]+" ");
            }
            System.out.println();
        }

        
        // int nums[][]=new  int[3][];//jagged array

        // for(int i1=0;i1<nums.length;i1++){
        //     for(int j1=0;j1<nums[i1].length;j1++){
        //         n3[i1][j1]=(int)(Math.random()*10);
        //         System.out.print(nums[i1][j1]+" ");
        //     }
        //     System.out.println();
        // }

        String password[] = { "XY01", "XY02", "XY03", "XY04"};

        String result1 =" ";

            for(int i9= password.length-1; i9>=2; i9--) {

                result1 = result1 + password[i9];

            }

            System.out.println(result1); 


            Student s1=new Student();
            s1.rollno=1;
            s1.name="chandu";
            s1.marks=45;

            Student s2=new Student();
            s2.rollno=2;
            s2.name="chotu";
            s2.marks=78;

            Student s3=new Student();
            s3.rollno=3;
            s3.name="sonu";
            s3.marks=90;

            Student obj[]=new Student[3];   //creating array which can hold student ref.not creating onject.

            obj[0]=s1;
            obj[1]=s2;
            obj[2]=s3;

            // for(int i3=0;i3<obj.length;i3++){

            //     System.out.println(obj[i3].name+" : "+obj[i3].marks);
            // }

            for(Student st:obj){        //enhanced for loop
                System.out.println(st.name+" : "+st.marks);
     
            }

            
    }
}
