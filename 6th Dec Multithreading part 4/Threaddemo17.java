class Display   {
  
    public synchronized void displayNumbers ()  {
    
        for (int i = 1; i <= 10; i++)
      
        {
	
            System.out.print (i);
	
            try
	       {
	  
            Thread.sleep (2000);
	
            } 
            catch (InterruptedException e)
	        {
  
            } 
        } 
    } 
    public synchronized void displayCharacters ()
    {
    
        for (int i = 65; i <= 75; i++)
      
        {
	
 
            System.out.print ((char) i);
	
            try
	        {
	  
                Thread.sleep (2000);
	
            } 
            catch (InterruptedException e)
	        {

            } 
        } 
    } 
} 

class MyThread1 extends Thread

{
  
    Display d;
  
    MyThread1 (Display d)
    {
    
        this.d = d;
  
    } 
    @Override 
    public void run ()
    {
    
    d.displayNumbers ();

    } 
}

class MyThread2 extends Thread

{
  
Display d;
  
MyThread2 (Display d)
  {
    
this.d = d;
  
} 
@Override 
 public void run ()
  {
    
d.displayCharacters ();

} 
} 
public class Threaddemo17

{
  
public static void main (String ... args)
  {
    
Display d1 = new Display ();
    
MyThread1 t1 = new MyThread1 (d1);
    
MyThread2 t2 = new MyThread2 (d1);
    
t1.start ();
    
t2.start ();

} 
}


//output - without synchronized key word
//A1B2C3D4E5F6G7H8I9J10K


//with synchronised key word
//12345678910ABCDEFGHIJK

