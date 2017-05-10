
import lejos.nxt.Button;
import lejos.nxt.LCD;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class MotorProgram5
{
    public static void main(String[] args)
    {
        LCD.drawString( "Program 5", 0, 0 );
        Button.waitForAnyPress();
        LCD.clear();
        
        Motor.A.setSpeed( 720 );
        Motor.B.setSpeed( 720 );
        Motor.C.setSpeed( 720 );
        
        Motor.A.rotate( 720, true ); 
        Motor.B.rotate( 720, true );
        Motor.C.rotate( 720, true );
        
        for( int i = 0; i < 8; i++ )
        {
            Delay.msDelay(200);
            LCD.drawInt(Motor.A.getTachoCount(), 0, i );
            LCD.drawInt(Motor.B.getTachoCount(), 6, i );
            LCD.drawInt(Motor.C.getTachoCount(), 12, i );
        }
        
        while( Motor.A.isMoving() || Motor.B.isMoving() || Motor.C.isMoving() )
        {
            Button.waitForAnyPress();
        }

        }      
    }
