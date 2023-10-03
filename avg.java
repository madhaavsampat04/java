import java.util.*;

class avg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        float c=0;
        for(int i=0;i<6;i++)
        {
        System.out.println("Enter mark of subject "+(i+1));
        arr[i]=sc.nextInt();
        c=c+arr[i];
        }
        System.out.println("Avg is "+c/6);

    }
}