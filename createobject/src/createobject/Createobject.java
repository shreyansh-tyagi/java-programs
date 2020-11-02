/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createobject;

/**
 *
 * @author admin
 */
public class Createobject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mango fruit1 = new mango();
        banana fruit2 = new banana();
        grapes  fruit3 = new grapes();
        fruit1.display();
        fruit2.display();
        fruit3.display();
    }
}
    class mango
    {
        public void display()
        {
            System.out.println("mango is a king");
            System.out.println("mango is good in taste");
        }
    }
    class banana
    {
        public void display()
        {
           System.out.println("banana is a queen");
            System.out.println("mango is nice in taste"); 
        }
    }
    class grapes 
    {
        public void display()
        {
            System.out.println("grapes is a prince");
            System.out.println("mango is fair in taste");
        }
    }

