package org.usfirst.frc.team3158.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	/*MotorCollectorLeft corresponds to the port of the motor to the left of the collector
	 * MotorCollectorRigth corresponds to the port of the motor to the rigth of the collector
	 * CollectorLimitSwitch corresponds to the port of the limit switch 
	 */
	
	public static final int TypeOfCollectorMotor = 0; //0: for CANTalon and 1: for Talon
	public static int MotorCollectorLeft=1; //Motor port
	public static int MotorCollectorRigth=2; //Motor port
	public static int CollectorLimitSwitch=3; //Motor port
}
