package week3.day1;

public class Calculator {
	
	
	public void add(int a,int b)
	{
		
		int sum=a+b;
		System.out.println("1 method will 2 int arguments"+sum);
	}
	public void add(int a,int b,int c)
	{
		
		int sum=a+b+c;
		System.out.println("1 method will 3 int arguments "+sum);
	}
	
	public void sub(int a,int b)
	{
		
		int diff=a-b;
		System.out.println("1 method with 2 int arg "+diff);
	}
	public void sub(double a,double b)
	{
		
		double diff=a-b;
		System.out.println("1 method with 2 double arg "+diff);
	}
	
	public void mul(int a,int b)
	{
		
		int multi=a*b;
		System.out.println("1 method with 2 int arg "+multi);
	}
	public void mul(int a,double b)
	{
		
		double diff=a*b;
		System.out.println("1 method with 1 int 1 double arg "+diff);
	}
	
	public static void main(String[] args) {
		 
		Calculator cal=new Calculator();
		cal.add(10, 15);
		cal.add(4, 5, 10);
		cal.sub(20.00, 8.00);
		cal.sub(10, 5);
		cal.mul(5, 10.0);
		cal.mul(3,5);
	}
	

}
