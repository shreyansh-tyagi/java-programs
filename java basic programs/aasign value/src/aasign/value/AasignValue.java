/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aasign.value;

/**
 *
 * @author admin
 */
import java.io.*;
class AasignValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
int a,b,c,d,e,f,g,h,i;
System.out.println("enter the value of a");
a=Integer.parseInt(in.readLine());
System.out.println("enter the value of b");
b=Integer.parseInt(in.readLine());
System.out.println("enter the value of c");
c=Integer.parseInt(in.readLine());
System.out.println("enter the value of d");
d=Integer.parseInt(in.readLine());
e=a;
f=b;
g=c;       
h=d;
i=e+f+g+h;
System.out.println("the sum is= "+i);
    }
}
