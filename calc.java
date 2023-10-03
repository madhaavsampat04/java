import java.util.*;
import java.lang.*;


class Calc{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your choice\n 1 for addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division \n 5 for Power \n 6 for Square Root");
        int s=sc.nextInt();

        switch(s)
        {
            case 1:
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            int e=Math.addExact(a,b);
            System.out.println("Sum is "+e);
            break;

            case 2:
            System.out.println("Enter first number");
            int c=sc.nextInt();
            System.out.println("Enter second number");  
            int d=sc.nextInt();
            int f=Math.subtractExact(c,d);
            System.out.println("Difference is "+f);
            break;

            case 3:
            System.out.println("Enter first number");
            int g=sc.nextInt();
            System.out.println("Enter second number");
            int h=sc.nextInt();
            int i=Math.multiplyExact(g,h);
            System.out.println("Multiplication is "+i);
            break;

            case 4:
            System.out.println("Enter first number");
            int j=sc.nextInt();
            System.out.println("Enter second number");
            int k=sc.nextInt();
            int l=Math.divideExact(j,k);
            System.out.println("Division is "+l);
            break;

            case 5:
            System.out.println("Enter number");
            double m=sc.nextInt();
            System.out.println("Enter power");
            double n=sc.nextInt();
            double o=Math.pow(m,n);
            System.out.println("Power is "+o);
            break;

            case 6:
            System.out.println("Enter number");
            double p=sc.nextInt();
            double q=Math.pow(p, 0.5);
            System.out.println("Square Root is "+q);
            break;



        }

    }

    }
