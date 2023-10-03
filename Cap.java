import java.util.*;

class Cap
{
    public static void main(String m[])
    {
        Scanner in=new Scanner(System.in);
        String s=new String();
        System.out.println("Enter a line:");
        s=in.nextLine();
        char c;
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c>=65 && c<=90)
            {
                cnt++;

            }
        }
        System.out.println("total  number of words start with capital letters are :"+cnt);
    }
}