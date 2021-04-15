class mcalc {
    int ans;
    void addition(int a,int b)
    {
        ans=a+b;
        System.out.println("SUM OF NUMBERS ="+ans);
    }
    void subtraction(int a,int b)
    {
        ans=a-b;
        System.out.println("DIFFRENCE OF NUMBERS ="+ans);
    }
    }
    class calc extends mcalc
    {
    void multiplication(int a,int b)
    {
        ans=a*b;
        System.out.println("MULTIPLICATION OF NUMBERS ="+ans);
    }
    public static void main(String[] args)
    {
        int x=100,y=20;
        calc ob=new calc();
        ob.addition(x, y);
        ob.subtraction( x, y);
        ob.multiplication(x, y);
        //the class of which obejct is created that class should be run in the terminal
        
        
    }
    }