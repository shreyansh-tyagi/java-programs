import java.util.Scanner;
class Number
{
    private double d;
    boolean isZero(double d)
    {
        this.d=d;
        if(d==0)
        {
            return true;
        }
         else
         return false;  
    }
    boolean isPositive(double d)
    {
        this.d=d;
        if(d>0)
        {
            return true;
        }
        else
         return false;   
    }
    boolean isNegative(double d)
    {
        this.d=d;
        if(d<0)
        {
            return true;
        }
        else
         return false;   
    }
    boolean isOdd(double d)
    {
        this.d=d;
        if(d%2!=0)
        {
            return true;
        }
        else
         return false;   
    }
    boolean iseven(double d)
    {
        this.d=d;
        if(d%2==0)
        {
            return true;
        }
        else
         return false;   
    }
    boolean isprime(double d)
    {
        this.d=d;
        int c=0;
        for(int i=2;i<=d;i++)   
        {
            c++;
        }
        if(c==2)
        {
            return true;
        }
        else
         return false;   
    }
    boolean isarmstrong(double d)
    { 
       
        this.d=d;
       int temp=(int)this.d,p=0,a=0;
        while(d>0)
        {
             a=(int) (d%10);
             
             p=p+(a*a*a);
             // System.out.println(p);
             d=d/10;
        }
        if(p==temp)
        {
           
           return true; 
        }
        else
        {
            
         return false; 
        }
    }
}
public class check {
  public static void main(String as[])  
  {
       Scanner sc = new Scanner(System.in);
      double n= sc.nextDouble();
        Number a=new Number();
        System.out.println("isarmstrong "+a.isarmstrong(n));
        System.out.println("iseven "+a.iseven(n));
        System.out.println("isZero "+a.isZero(n));
        System.out.println("isPositive "+a.isPositive(n));
         System.out.println("isNegative "+a.isNegative(n));
         System.out.println("isprime "+a.isprime(n));
         System.out.println("isOdd "+a.isOdd(n));
  } 
}