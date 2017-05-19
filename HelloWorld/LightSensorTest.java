
import lejos.nxt.*;
import lejos.robotics.objectdetection.*;


public class LightSensorTest implements SensorPortListener {
    
    public LightSensorTest()
    {
        SensorPort.S3.addSensorPortListener(this);
        
    }
    public static void main(String[] args)
    {
        LightSensorTest test = new LightSensorTest();
        Button.waitForAnyPress();    
    }
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue)
    {
        if( aOldValue != aNewValue)
        {
            System.out.println( aNewValue );
           }
       }

}
