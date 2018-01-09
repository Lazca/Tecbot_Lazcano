package org.usfirst.frc.team3158.robot.subsystems;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3158.robot.RobotMap;

public class Collector extends Subsystem{

	//The two motors and limit switch required for this subsystem are declared
	SpeedController CollectorLeft;
	SpeedController CollectorRigth;
	DigitalInput limitSwitch;
	
	/*the two motors and limit switch are set to their port when this constructor is called 
	*in Robot.java
	*/
	
	public Collector() {
		switch(RobotMap.TypeOfCollectorMotor)
		{
		case 0:{
		CollectorLeft=new CANTalon(RobotMap.MotorCollectorLeft);
		CollectorLeft=new CANTalon(RobotMap.MotorCollectorRigth);
		break;}
		case 1:{
			CollectorLeft=new Talon(RobotMap.MotorCollectorLeft);
			CollectorLeft=new Talon(RobotMap.MotorCollectorRigth);
			break;}
		}
		limitSwitch= new DigitalInput(RobotMap.CollectorLimitSwitch);
	}
	
	/*When GetBox is called the state of the limit switch determines the next step, if the 
	 * limit switch returns true both motors are set to (0), if the limit switch returns false 
	 * both motors are set to (-.7)
	 */
	public void GetBox() {
		boolean limit=limitSwitch.get();
		if (limit) {
			CollectorLeft.set(0);
			CollectorLeft.set(0);
		}else {
			CollectorLeft.set(-.7);
			CollectorLeft.set(-.7);			
		}
	}
	
	//when ShootBox is called both motors are set to (.7)
	
	public void ShootBox() {
		CollectorLeft.set(.7);
		CollectorLeft.set(.7);
	}
	
	//when Stop is called both motors are set to (0)
	
	public void Stop() {
		CollectorLeft.set(0);
		CollectorLeft.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
	
	public boolean LimitBoolean () {
		return limitSwitch.get();
	}


}
