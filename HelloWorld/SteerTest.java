import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.ButtonCounter;

/**
 * Test the turn() method 
 * Left botton enters  100's digit, right - 10's digit. 
 */
public class SteerTest 
{
    public static void main( String[] args)
    {
        DifferentialPilot pilot = new DifferentialPilot(7.5, 22.5, Motor.A, Motor.C); 
        ButtonCounter bc = new ButtonCounter();
        while(true)
        {
            bc.count("Turn Rate x10");
            int turnRate = 100 * bc.getLeftCount() + 10 * bc.getRightCount();
            bc.count("Angle x 10");
            int angle = 100 * bc.getLeftCount() + 10 * bc.getRightCount();
            pilot.steer(turnRate,angle);                  
        }
    }
}
