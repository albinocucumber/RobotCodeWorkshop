package lib;

import com.revrobotics.CANSparkMax;

public class VictorSP extends CANSparkMax {
    public VictorSP(int id) {
        super(id, MotorType.kBrushless);
    }

    public void setSpeed(double speed) {
        super.set(speed);
    }
}
