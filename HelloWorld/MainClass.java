import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class MainClass
{
    private int state;
    public static void main (String[] args)
    {
        System.out.println("Hello World");
        Button.waitForAnyPress();
    }
    
    public boolean run()
    {
       
        while( true )
        {
            if( state == 0 ) // in box
            {}
            if( state == 1 ) // look for can
            {}
            if( state == 2 ) // push can 
            {}
            if( state == 3 ) // back up from line
            {
                Motor.C.backward();
            }            
        }
    }
}
