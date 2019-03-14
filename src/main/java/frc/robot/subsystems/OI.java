package frc.robot.subsystems;

import frc.controllers.BobXboxController;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{

    public BobXboxController driverController;
    public BobXboxController operatorController;

    public OI() {
        driverController = new BobXboxController(0, 1, 1);

        driverController.aButton.whileHeld(new RunMotors());
        driverController.bButton.whileHeld(new RunMotors());
        driverController.xButton.whileHeld(new RunMotors());
        driverController.yButton.whileHeld(new RunMotors());
    }
}