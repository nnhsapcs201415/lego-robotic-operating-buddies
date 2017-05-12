import lejos.nxt.FeatureListener;
import lejos.robotics.objectdetection.*;


/**
 * Write a description of class ObjectDetection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectDetectionListener implements FeatureListener
{


	public static int MAX_DETECT = 80;
	
	public static void main(String[] args) throws Exception {
		
		ObjectDetect listener = new ObjectDetect();
		UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
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