/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package days;

/**
 *
 * @author admin
 */
import java.io.*;
class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b,c,d,y;
        System.out.println("enter the number of days");
        a=Integer.parseInt(in.readLine());
        y=a/365; //year nikla
        b=a%365; //modulas store hoga yha pe 
        c=b/30;  //us modulas value ko divide krke hume month pta lg jayega    
        d=b%30;  //phli vali modulas ka dubara modulas nikalke  days ka pta lg jayega 
        System.out.println("the number of year="+y);
        System.out.println("the number of month="+c);
        System.out.println("the number of days="+d);
    }
    
}
