import lejos.robotics.objectdetection.RangeFeature;
import lejos.nxt.LCD;
import lejos.nxt.Motor;

public class ObjectDetection
{
    private static int MAX_DISTANCE = 50; //centimeters
    private static int PERIOD = 500; // milliseconds

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