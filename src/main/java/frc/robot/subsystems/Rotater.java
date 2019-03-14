package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.utility.Motor;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Rotater extends Subsystem{
    public Motor rotater;
    
    public CANEncoder encoder;

    public Rotater(){
        rotater = new Motor(Constants.MotorMap.Rotater.ROTATER, MotorType.kBrushed, Constants.MotorMap.Rotater.ROATER_REVERSERD, Constants.MotorMap.Rotater.ROTATER_AMPCAP);
        rotater.setParameter(CANSparkMaxLowLevel.ConfigParameter.kSensorType, 2);
        encoder = rotater.getEncoder();
        encoder.setPosition(0);
    }

    public void checkEncoder(){
        System.out.println(encoder.getPosition());
    }

    public void RunMotor(double speed){
        rotater.set(speed);
    }

    public void initDefaultCommand()
    {

    }
}
