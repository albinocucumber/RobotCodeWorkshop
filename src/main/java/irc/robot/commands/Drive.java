package irc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import irc.robot.OI;
import irc.robot.subsystems.Drivetrain;

// This class links the OI Class (the controls) and the Drivetrain Class (the subsystem).
public class Drive extends Command {
    private OI oi;
    private Drivetrain drivetrain;

    // Getting instances of OI and Drivetrain
    public Drive(){
        oi = OI.getInstance();
        drivetrain = Drivetrain.getInstance();
        requires(drivetrain);
    }

    // Execute is run every 20ms when the robot is active
    public void execute(){
        // To link OI with Drivetrain, we call the setSpeed function from the Drivetrain Class, using values from the OI class's Joysticks
        drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());
    }

    // We never want this command to stop, so we return false
    @Override
    protected boolean isFinished() {
        return false;
    }
}