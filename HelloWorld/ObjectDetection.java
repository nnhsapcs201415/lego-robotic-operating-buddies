import lejos.robotics.objectdetection.RangeFeature;
import lejos.nxt.LCD;
import lejos.nxt.I2CPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.robotics.objectdetection.FeatureDetector;


public class ObjectDetection
{
    private static int MAX_DISTANCE = 50; //centimeters
    private static int PERIOD = 500; // milliseconds
    //private static int I2CPort = SensorPort.S4;

    public static void main(String[] args)
    {
        UltrasonicSensor sensor = new UltrasonicSensor(SensorPort.S4);
        FeatureDetector detector = new RangeFeatureDetector( sensor, MAX_DISTANCE, PERIOD); 
        feature result = detector.scan();
        if( result != null)
        {
            System.out.println("Range: " + result.getRangeReading().getRange());
        }
    }
}