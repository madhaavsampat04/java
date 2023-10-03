class Demo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(int x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
    void area(int x, int y)
    {
        System.out.println("the area of the triangle is "+0.5*x*y+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
	   Demo ob = new Demo();
	   ob.area(5f);
	   ob.area(11f,12f);
	   ob.area(3);
       ob.area(12,12);
        }
}