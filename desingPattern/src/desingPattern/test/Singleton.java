package desingPattern.test;

public class Singleton {
    private static Singleton obj;

    private Singleton() {
    }
    
    public static Singleton getInstance() {
        System.out.print("hi hello");
        System.out.print("hi hi hello");
        
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
    
   

}
