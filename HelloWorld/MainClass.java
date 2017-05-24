import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class MainClass implements FeatureListener, SensorPortListener
{
    private int state;
    private double range;
    private int light;
    public static int MAX_DETECT = 100;

    public MainClass(int botState)
    {
        SensorPort.S3.addSensorPortListener(this);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
        fd.addListener(this);
        this.state = botState;
    }

    public static void main(String[]args) throws Exception
    {
        MainClass mc = new MainClass(0);
        mc.run();
    }

    public void featureDetected(Feature feature, FeatureDetector detector) {
        this.range = (feature.getRangeReading().getRange());
    }
    
    public void stateChanged(SensorPort aSource, int aOldValue, int aNewValue)
    {
        if( aOldValue != aNewValue )
        {
            this.light = aNewValue;
           }
       }


    public void run()
    {
        while( true )
        {
            System.out.println("State: " + this.state);
            if( state == 0 ) // in box
            {                
                boolean cond = false;
                while (cond == false)
                {
                    
                    Motor.A.forward();
                    Motor.C.backward();
                    System.out.println(this.range);
                    if (this.range > 20 && this.range < 100)
                    {
                        cond = true;
                    }
                }
                Motor.A.forward();
                Motor.C.forward();
                
                state = 1;
            }
            if( state == 1 ) // look for can
            {
                boolean cond = false;
                while (cond == false)
                {
                    Motor.A.forward();
                    Motor.C.backward();
                    if (this.light > 720)
                    {
                        state = 3;
                    }
                    if (this.range > 30 && this.range < 100)
                    {
                        Motor.C.forward();
                        Motor.A.forward();
                        if (this.range < 20)
                        {
                            cond = true;
                            state = 2;
                        }
                    }
                }
            }
            if( state == 2 ) // push can 
            {
                while (this.range < 20)
                {
                    Motor.C.forward();
                    Motor.A.forward();
                    if (light > 720)
                    {
                        state = 3;
                    }
                }
            }
            if( state == 3 ) // back up from line
            {
                Motor.C.backward();
                Motor.A.backward();
                state = 1;
            }            
        }
    }
}
