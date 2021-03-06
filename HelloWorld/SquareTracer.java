
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 *  uses a DifferentialPilot to trace out a square, using 
 *      the travel and void rotate(double degrees) methods.
 */

public class SquareTracer
{
    DifferentialPilot pilot ;
    
    public void  drawSquare(float length)
    {
        for(int i = 0; i<4 ; i++)
        {
            pilot.travel(length);
            pilot.rotate(90);                 
        }
    }
    
    public static void main(String[] args)
    {
        SquareTracer sq = new SquareTracer();
        sq.pilot = new DifferentialPilot(7.5, 22.5, Motor.A, Motor.C);
        sq.drawSquare(40);
    }
}