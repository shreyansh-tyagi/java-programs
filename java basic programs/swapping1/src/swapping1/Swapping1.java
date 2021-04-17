/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping1;

/**
 *
 * @author admin
 */
import java.io.*;
public class Swapping1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,b,c;
        System.out.println("enter the value of a");
        a=Integer.parseInt(in.readLine());
        System.out.println("enter the value of b");
        b=Integer.parseInt(in.readLine());
        c=a;
        a=b;
        b=c;
        c=a+b;
        System.out.println("the swapping is"+a+b);
          System.out.println("the swapping is"+c);        
    }
    
}
