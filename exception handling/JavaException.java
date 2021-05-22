class JavaException {
    public static void main(String args[]) {
     int d = 0;
     int n = 20;
     try {
      int f = n / d;
      System.out.println("This line will not be Executed");
     } catch (ArithmeticException f) {
      System.out.println("In the catch Block due to Exception = " + f);
     }
     System.out.println("End Of Main");
    }
   }