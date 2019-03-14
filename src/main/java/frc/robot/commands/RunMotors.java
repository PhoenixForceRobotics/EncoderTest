package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Rotater;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotors extends Command
{
    private Rotater rotater;

    public RunMotors(){
        requires(Robot.rotater);
        this.rotater = Robot.rotater;
    }

    public void initialize() {

    }


    public void execute() {
        if(Robot.oi.driverController.aButton.get()){
            rotater.RunMotor(.25);
        } else if(Robot.oi.driverController.bButton.get()){
            rotater.RunMotor(.5);
        } else if(Robot.oi.driverController.xButton.get()){
            rotater.RunMotor(.75);
        } else if(Robot.oi.driverController.yButton.get()){
            rotater.RunMotor(1);
        } else {
            rotater.RunMotor(0);
        }
        
    }


    public boolean isFinished()
    {
        return false;
    }

    @Override
    public void interrupted() {
        end();
    }
    
    public void end() {
        rotater.RunMotor(0);
    }
}