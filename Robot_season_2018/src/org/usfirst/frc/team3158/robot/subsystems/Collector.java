package org.usfirst.frc.team3158.robot.subsystems;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3158.robot.RobotMap;

public class Collector extends PIDSubsystem{

	//The two motors, two double solenoids and limit switch required for this subsystem are declared
	SpeedController collectorLeft;
	SpeedController collectorRigth;
	DigitalInput limitSwitch;
	DoubleSolenoid leftPiston;
	DoubleSolenoid rigthPiston;
	boolean extend;
	AnalogChannel collectorPot;
	/*the two motors and limit switch are set to their port when this constructor is called 
	*in Robot.java
	*/
	
	public Collector() {
		super("collector", 0, 0, 0);
		switch(RobotMap.TypeOfCollectorMotor)
		
		{
		case 0:{
			
			collectorLeft=new Talon(RobotMap.MotorCollectorLeft);
			collectorRigth=new Talon(RobotMap.MotorCollectorRigth);
			leftPiston=new DoubleSolenoid(RobotMap.PistonCollectorLeft_1,RobotMap.PistonCollectorLeft_2);
			rigthPiston=new DoubleSolenoid(	RobotMap.PistonCollectorRigth_1,RobotMap.PistonCollectorRigth_2);
			extend=false;
			collectorPot=1;
		break;}
		case 1:{
			collectorLeft=new Talon(RobotMap.MotorCollectorLeft);
			collectorRigth=new Talon(RobotMap.MotorCollectorRigth);
			leftPiston=new DoubleSolenoid(RobotMap.PistonCollectorLeft_1,RobotMap.PistonCollectorLeft_2);
			rigthPiston=new DoubleSolenoid(	RobotMap.PistonCollectorRigth_1,RobotMap.PistonCollectorRigth_2);
			extend=false;
			break;}
		}
		limitSwitch= new DigitalInput(RobotMap.CollectorLimitSwitch);
	}
	
	/*When GetBox is called the state of the limit switch determines the next step, if the 
	 * limit switch returns true both motors are set to (0), if the limit switch returns false 
	 * both motors are set to (-.7)
	 */
	public void GetBox() {
		if (limitSwitch.get()) {
			collectorLeft.set(0);
			collectorRigth.set(0);
		}else {
			collectorLeft.set(-.7);
			collectorRigth.set(-.7);			
		}
	}
	
	//when ShootBox is called both motors are set to (.7)
	
	public void ShootBox() {
		collectorLeft.set(.7);
		collectorRigth.set(.7);
	}
	
	//when Stop is called both motors are set to (0)
	
	public void Stop() {
		collectorLeft.set(0);
		collectorRigth.set(0);
	}
	
	public void ExtendCollector() {
		leftPiston.set(Value.kForward);
		rigthPiston.set(Value.kForward);
		extend=true;
	}
	
	public void RetractCollector() {
		leftPiston.set(Value.kReverse);
		rigthPiston.set(Value.kReverse);
		extend=false;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public boolean LimitBoolean () {
		return limitSwitch.get();
	}
	
	public boolean Extended() {
		return extend;
	}
}
