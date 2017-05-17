import lejos.robotics.objectdetection.FeatureListener;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.objectdetection.Feature;
import lejos.robotics.objectdetection.FeatureDetector;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.Sound;

/**
 * Write a description of class ObjectDetection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectDetect implements FeatureListener
{

	
	
	public void featureDetected(Feature feature, FeatureDetector detector) {
		int range = (int)feature.getRangeReading().getRange();
		Sound.playTone(1200 - (range * 10), 100);
		System.out.println("Range:" + range);
	}
}
