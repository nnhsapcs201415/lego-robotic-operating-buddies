import lejos.robotics.objectdetection.FeatureListener;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.Feature;
<<<<<<< HEAD:HelloWorld/ObjectDetectionListener.java
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.Sound;

=======
import lejos.nxt.Sound;
import lejos.nxt.Button;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.nxt.SensorPort;
>>>>>>> origin/master:HelloWorld/ObjectDetect.java
/**
 * Write a description of class ObjectDetection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectDetect implements FeatureListener
{
	public static int MAX_DETECT = 80;
	
	public static void main(String[] args) throws Exception {
		
<<<<<<< HEAD:HelloWorld/ObjectDetectionListener.java
		ObjectDetectionListener listener = new ObjectDetectionListener();
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
=======
		ObjectDetect listener = new ObjectDetect();
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S2);
>>>>>>> origin/master:HelloWorld/ObjectDetect.java
		RangeFeatureDetector fd = new RangeFeatureDetector(us, MAX_DETECT, 500);
		fd.addListener(listener);
		Button.ENTER.waitForPressAndRelease();
	}
	
	public void featureDetected(Feature feature, FeatureDetector detector) {
		int range = (int)feature.getRangeReading().getRange();
		Sound.playTone(1200 - (range * 10), 100);
		System.out.println("Range:" + range);
	}
}
