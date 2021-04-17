/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author admin
 */
public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        // TODO code application logic here
        sum obj1 = new sum();
        subtract obj2 = new subtract();
        modulas obj3 = new modulas();
        multiply obj4 = new multiply();
        divide obj5 = new divide();
        obj1.calculate();
        obj2.calculate();
        obj3.calculate();
        obj4.calculate();
        obj5.calculate();
    }
    
}
class sum 
{
    public void calculate()
    {
     int a=1,b=2,c=0;
     c=a+b;
     System.out.println("sum is="+c);
    }
}
class subtract 
{
    public void calculate()
    {
     int a=1,b=2,c=0;
     c=a-b;
     System.out.println("subtraction is="+c);
    }
}
class modulas  
{
    public void calculate()
    {
     int a=1,b=2,c=0;
     c=a%b;
     System.out.println("modulas is="+c);
    }
}
class multiply 
{
    public void calculate()
    {
     long a=100,b=200,c=0;
     c=a*b;
     System.out.println("multiplication is="+c);
    }
}
class divide 
{
    public void calculate()
    {
     double a=14647,b=264747,c=0;
     c=a/b;
     System.out.println("division is"+c);
    }
}