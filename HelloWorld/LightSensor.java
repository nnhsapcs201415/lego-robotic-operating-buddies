
import lejos.nxt.*;
import lejos.robotics.objectdetection.*;


public class LightSensor implements SensorPortListener {

    public static void main(String[] args) throws Exception
    {
        
	}
	public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue)
	{
	    SensorPort.S1.addSensorPortListener(this);
	    if( aOldValue != aNewValue)
	    {
	        System.out.print( aNewValue );
	    	Button.ENTER.waitForPressAndRelease();    
	       }
	   }

}
