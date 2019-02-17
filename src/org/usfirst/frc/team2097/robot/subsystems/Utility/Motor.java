package org.usfirst.frc.team2097.robot.subsystems.Utility;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Motor extends TalonSRX {
    public Motor(int port, boolean reversed) {
        super(port);
        setInverted(reversed);
    }
}
