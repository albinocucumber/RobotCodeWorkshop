package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
  VictorSP armVictor;

  Arm() {
    armVictor = new VictorSP(5);
  }

  void armSpeed(double devin){
    armVictor.setSpeed(devin);
  }

  void up(){
    armSpeed(1);
  }

  void down(){
    armSpeed(-1);
  }

  @Override
  protected void initDefaultCommand() {

  }
}