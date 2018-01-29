package org.usfirst.frc.team3158.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	/*
	 * Type of configuration: 
	 * 0 = CANTalon
	 * 1 = Talon
	 * 2 = Victor
	*/	
	
	///////////////Chassis Subsystem.
		


	public static int UDPint = 0;
	
	//PWM
	/*public static int chassis_frontRightMotor = 1;
	public static int chassis_frontLeftMotor = 4;
	public static int chassis_backRightMotor = 3;
	public static int chassis_backLeftMotor = 2;*/
	
	//CAN *Front = UP Motor, Back = Down Motor*
	
	/* Competencia */
	public static int chassis_typeOfConfiguration= 0; 
	
	public static int chassis_frontRightMotor = 2;
	public static int chassis_frontLeftMotor = 4;
	public static int chassis_backRightMotor = 1;
	public static int chassis_backLeftMotor = 10; 
	
		//If one of the motor is invert you can chose one of those options (you can change two motors at the moment):
	//set "1" to invert front left motor
	//set "2" to invert front right motor
	//set "3" to invert rear left motor
	//set "4" to invert rear right motor
	
	public static int chassis_invertMotor1 = 0;
	public static int chassis_invertMotor2 = 0;
	
	//Gyro
	
	public static final boolean isNavx = true;	//true for Navx, false for analog gyro
	
	public static int chassis_gyroscope = 0;
	public static double kForGyro =.5;
	public static int analogGyro = 0; 
	
	//Transmission
	public static boolean isTransmission = true;
	
	public static int transmissionUp = 6;
	public static int transmissionDown = 7;
	
	//Encoders
	
	public static int chassis_encoder1[] = {4,5};
	public static int chassis_encoder2[] = {0,1};

	public static boolean chassis_hasEncoders=false;
	
	///////////////Intake
	
	public static int intake_typeOfConfiguration = 0;
	
	public static int intake_collectorRoller1=5;
	public static int intake_collectorRoller2=6;
	
	/////////////// Shooter Subsystem.
		
	public static int shooter_typeOfConfiguration = 0;
	
	public static int shooter_motorLeft= 3;
	public static int shooter_motorRight= 9;
	public static int shooter_encoder=54;
	
	
	public static int shooter_encoderLeft[] = {7,8};
	public static int shooter_encoderRight[] = {0,1};
	
	public static boolean shooter_hasEncoders=false;
	public static double shooter_maxVoltage=1;
	public static double shooter_speedRight=600;
	public static double shooter_speedLeft=70;
	
	//Cross
	
	public static int shooter_crossTypeOfConfiguration=0;	
	public static int shooter_crossLeft =8;
	public static int shooter_crossRight=7;
		
	
	//////////////// Climber Subsystem
	
	public static int climber_typeOfConfiguration = 0;
	public static int climber_motorLeft=12;
	public static int climber_motorRight=11;
	
	/////////////// Arm
	public static int arm_clawForwardPison = 1;
	public static int arm_clawReversePison = 0;

	public static int arm_armReversePiston=5;
	public static int arm_armForwardPiston=4;
	
	public static int arm_gearForwardPiston=2;
	public static int arm_gearReversePiston=3;
	

	/* Gemelo
	
	public static int chassis_typeOfConfiguration= 0;
	
	public static int chassis_frontRightMotor = 2;
	public static int chassis_frontLeftMotor = 4;
	public static int chassis_backRightMotor = 1;
	public static int chassis_backLeftMotor = 3;
	
		//If one of the motor is invert you can chose one of those options (you can change two motors at the moment):
	//set "1" to invert front left motor
	//set "2" to invert front right motor
	//set "3" to invert rear left motor
	//set "4" to invert rear right motor
	
	public static int chassis_invertMotor1 = 0;
	public static int chassis_invertMotor2 = 0;
	
	//Gyro
	
	public static boolean isNavx = true;	//true for Navx, false for analog gyro
	
	public static int chassis_gyroscope = 0;
	public static double kForGyro =.5;
	public static int analogGyro = 0; 
	
	//Transmission
	public static boolean isTransmission = true;
	
	public static int transmissionUp = 0;
	public static int transmissionDown = 2;
	
	//Encoders
	
	public static int chassis_encoder1[] = {4,5};
	public static int chassis_encoder2[] = {0,1};
	public static boolean chassis_hasEncoders=false;
	
	///////////////Intake
	
	public static int intake_typeOfConfiguration = 1;
	
	public static int intake_collectorRoller1=3;
	public static int intake_collectorRoller2=9;
	
	/////////////// Shooter Subsystem.
		
	public static int shooter_typeOfConfiguration = 1;
	
	public static int shooter_motorLeft= 1;//1 valos real 
	public static int shooter_motorRight= 2;//2
	
	
	public static int shooter_encoderLeft[] = {0,1};
	public static int shooter_encoderRight[] = {8,9};
	
	public static boolean shooter_hasEncoders=false;
	public static double shooter_maxVoltage=.9;
	public static double shooter_speed=70;
	
	//Cross
	
	public static int shooter_crossTypeOfConfiguration=1;	
	public static int shooter_crossLeft =4;
	public static int shooter_crossRight=5;
		
	
	//////////////// Climber Subsystem
	
	public static int climber_typeOfConfiguration = 0;
	public static int climber_motorLeft=5;
	public static int climber_motorRight=0;
	
	/////////////// Arm
	public static int arm_clawForwardPison = 6;
	public static int arm_clawReversePison = 7;
	public static int arm_armReversePiston=4;
	public static int arm_armForwardPiston=5;
	public static double shooter_speedRight = 50;
	public static double shooter_speedLeft = 1200;
	
	*/
	
}