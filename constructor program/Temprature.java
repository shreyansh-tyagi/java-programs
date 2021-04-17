import java.util.Scanner;
public class Temprature 
{
	double min,max,f1,f2;
	void getdata(double m,double n)
	{
		max=m;
		min=n;
	}
	void compute()
	{
		f1=9*max/5+32;
		f2=9*min/5+32;
	}
	void display()
	{
		System.out.println("The maximum temperature in Farenheit"+f1);
		System.out.println("The minimum temperature in Farenheit"+f2);
	}
	public static void main(String args[])
	{
	Temprature ob=new Temprature();
	Scanner sc=new Scanner(System.in);
	double m,n;
	System.out.println("Enter maximum and minimum temperature in Celcius");
	m=sc.nextDouble();
	n=sc.nextDouble();
	ob.getdata(m, n);
	ob.compute();
	ob.display();
	}
}