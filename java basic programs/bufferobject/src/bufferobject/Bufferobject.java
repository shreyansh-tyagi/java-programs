/*    
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferobject;

/**        //documenting comment
 *
 * @author admin
 */

public class Bufferobject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)   {
        // TODO code application logic here
         
        add obj1 = new add();
        obj1.calculate();
    }
}
   
class add
{
    public void calculate() 
    {
    int a,b,c;a=1;b=5;
         c=a+b;
         System.out.println("the sum is"+c);
    }
}


