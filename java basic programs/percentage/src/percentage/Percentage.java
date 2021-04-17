/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentage;
// To find and display the percentage of boys and girls

/**
 *
 * @author admin
 */
import java.io.*;
class Percentage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         int n,b,g;
        double percentboy,percentgirl;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the total number of student");
        n=Integer.parseInt(in.readLine());
        System.out.println("Enter the number of girl" );
         g=Integer.parseInt(in.readLine());
         b=n-g;
         System.out.println("the number of boys are="+b);
         percentboy=(double)b/n*100;
         percentgirl=(double)g/n*100;
         System.out.println("the percentage of boys are="+percentboy);
         System.out.println("the percentage of girls are="+percentgirl); 
    }
    
}
