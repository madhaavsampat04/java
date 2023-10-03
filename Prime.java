import java.util.*;

class Prime
{
 
public static void main(String[] args){

   int a;
   int i,c=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no. you want to check");
   a=sc.nextInt();

   for(i=2;i<a;i++)
   {
   if(a%i==0)
   {
    c=1;
    break;
   }
   }

   if(c==1){
    System.out.println("Given no. is not Prime");
   }
   else{
    System.out.println("Given no. is Prime");
   }
}

}