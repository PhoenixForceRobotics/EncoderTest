package frc.robot;

public class Constants
{
    public static class MotorMap
    {
        public enum Mode
        {
            DISABLED, AUTO, TELEOP, TEST
        }
        public static class Rotater{
            //Set the motor port to the port that the encoder is plugged into
            public static int ROTATER = 4;
            public static boolean ROATER_REVERSERD = false;
            public static int ROTATER_AMPCAP = 30;
        }
    }
}