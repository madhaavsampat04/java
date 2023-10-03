import java.util.*;


class Nprime{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

int num=1,y=3,count,j;
System.out.println("Please Enter the number for range(0 - n): ");
int n=sc.nextInt();
if(n>=1){
    System.out.println("The first "+n+" prime numbers are: " );
    System.out.println(2);
}
for(count=2; count<=n;){
    for(j=2; j<=n; j++){
        if(y%j==0){
            num=0;
            break;
        }
    }
    if(num!=0){
        System.out.println(y);

        count++;
    }
    num=1;
    y++;
}
}
}