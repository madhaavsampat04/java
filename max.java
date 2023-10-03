import java.util.*;

public class max {

    public static void main(String[] args){
    int a[]=new int[5];
    int c=0,d=1,e=0,f=0,g=9999;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter five no.s");
    for(int i=0;i<5;i++){
        a[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
        c=c+a[i];
        d=d*a[i];
        if(a[i]%15==0)
        {
            e=e+1;
        }
        if(a[i]>f)
        {
            f=a[i];
        }
        if(a[i]<g)
        {
            g=a[i];
        }
    }
    System.out.println("Sum is "+c);
    System.out.println("Multiplication is "+d);
    System.out.println("Total no. of numbers which are divisible by 5 are "+e);
    System.out.println("Minimum of all no.s is "+g);
    System.out.println("Maximum of all no.s is "+f);



    }
    

}


