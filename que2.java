import java.util.*;

class que2{

    public static void main(String[] args)
    {
        float a,b;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Click 1 to perform addition");
        System.out.println("Click 2 to perform subtraction");
        System.out.println("Click 3 to perform multiplication");
        System.out.println("Click 4 to perform division");
        n=sc.nextInt();
        if(n==1)
        {
            float c=a+b;
            System.out.println(c);
        }
        else if(n==2)
        {
            float c=a-b;
            System.out.println(c);
            
        }
        else if(n==3)
        {
            float c=a*b;
            System.out.println(c);
            
        }
        else if(n==4)
        {
            float c=a/b;
            System.out.println(c);
            
        }
        else{
           System.out.println("Invalid Input");
            
        }
        }
        

    }
