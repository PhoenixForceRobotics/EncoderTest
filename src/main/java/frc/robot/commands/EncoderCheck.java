package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Rotater;

import edu.wpi.first.wpilibj.command.Command;

public class EncoderCheck extends Command
{
    private Rotater rotater;

    public EncoderCheck(){
        requires(Robot.rotater);
        this.rotater = Robot.rotater;
    }

    public void initialize() {

    }


    public void execute() {
        rotater.checkEncoder();
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

    }
}