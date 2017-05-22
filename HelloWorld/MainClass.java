import lejos.nxt.*;
import lejos.robotics.objectdetection.*;

public class MainClass
{
    private int state;

    public static void main (String[] args)
    {
        System.out.println("Robot Challenge");
        Button.waitForAnyPress();
    }

    public boolean run()
    {

        while( true )
        {
            if( state == 0 ) // in box
            {
                {
                    boolean cond = false;

                    ObjectDetect listener = new ObjectDetect();
                    UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
                    RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
                    fd.addListener(listener);

                    while (cond == false)
                    {
                        Motor.A.forward();
                        Motor.C.backward();
                        double range = feature.getRangeReading().getRange();
                        if (range > 30)
                        {
                            
                            

                        }
                    }

                }
                else if( state == 1 ) // look for can
                {
                }
                else if( state == 2 ) // push can 
                {}
                else if( state == 3 ) // backup from line 
                {}            
            }
        }
    }
