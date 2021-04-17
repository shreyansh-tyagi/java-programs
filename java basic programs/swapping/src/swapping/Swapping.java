4/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping;

/**
 *
 * @author admin
 */
import java.io.*;
class Swapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader read =  new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b,t,e;
        System.out.println("enter the value of a and b");
        a=Integer.parseInt(in.readLine()); 
        b=Integer.parseInt(in.readLine());
        t=a;
        a=b;
        b=t;
        e=a+b;
        System.out.println("the swap number is "+a);
        System.out.println("the swap number is "+b);
           System.out.println("the addition number is "+e);
    }
    
}
