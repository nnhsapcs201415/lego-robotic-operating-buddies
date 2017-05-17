import lejos.robotics.objectdetection.RangeFeature;
import lejos.nxt.I2CPort;
import lejos.robotics.objectdetection.Feature;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.FeatureListener;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.Sound;



public class ObjectDetection
{
    private static int MAX_DETECT = 80;
    //private static int MAX_DISTANCE = 50; //centimeters
    //private static int PERIOD = 500; // milliseconds
    public static void main(String[] args) throws Exception {
		
		ObjectDetect listener = new ObjectDetect();
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
		RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
		fd.addListener(listener);
		Button.ENTER.waitForPressAndRelease();
	}
	
//     public static void main(String[] args)
//     {
//         UltrasonicSensor sensor = new UltrasonicSensor(SensorPort.S4);
//         FeatureDetector detector = new RangeFeatureDetector( sensor, MAX_DISTANCE, PERIOD); 
//         Feature result = detector.scan();
//         if( result != null)
//         {
//             System.out.println("Range: " + result.getRangeReading().getRange());
//         }
//     }
}