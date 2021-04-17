/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2;

/**
 *
 * @author admin
 */
public class Object2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        maths obj1 = new maths();
        obj1.display();
    }
    
}
class maths
{
    public void display()
    {
        int a,b,c,d,e;
        a=0;b=0;c=0;d=0;e=0;
        a=(1*8)+1;
        b=(12*8)+2;
        c=(123*8)+3;
        d=(1234*8)+4;
        e=(12345*8)+5;
        System.out.println("1*8+1="+a);
        System.out.println("12*8+2="+b);
        System.out.println("123*8+3="+c);
        System.out.println("1234*8+4="+d);
        System.out.println("12345*8+5="+e);
    }
    
}