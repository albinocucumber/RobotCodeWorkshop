package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import irc.robot.commands.Drive;

//This class is a Subsystem that drives the robot.

public class Drivetrain extends Subsystem {

    // This is a singleton. Learn more about singletons here: https://www.geeksforgeeks.org/singleton-class-java/
    private static Drivetrain instance;
    public static Drivetrain getInstance(){
        if(instance == null)
            instance = new Drivetrain();
        return instance;
    }

    // Initializing all the motor controllers
    private VictorSP leftMasterVictor, rightMasterVictor;
    private Drivetrain(){
        leftMasterVictor = new VictorSP(1);
        rightMasterVictor = new VictorSP(3);
    }

    // Simple command to set speed of the motor controllers. It takes two inputs because we are using two Joysticks ("Tank Drive")
    public void setSpeed (double left, double right){
        leftMasterVictor.setSpeed(left);
        rightMasterVictor.setSpeed(right);
    }

    // Setting Drive.java as this subsystem's Command and initializing it
    @Override
    protected void initDefaultCommand() {

        setDefaultCommand(new Drive());

    }

}