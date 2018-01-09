package org.usfirst.frc.team3158.robot;



import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team3158.robot.commands.*;

public class OI {

	public Joystick joystick1;
	
	Button a; 
	Button b;
	Button x;
	Button y; 
	Button R3;
	Button L3;
	Button Lb;
	Button Rb;
	Button Lt;
	Button Rt;
	Button Select;
	Button Start;
	 
	
	public OI(){
		joystick1 = new Joystick(0);
		
		/*
		  * Xbox:
		  a = 1
		  x = 3
		  b = 2
		  y = 4
		  Lb = 5
		  Rb = 6
		  L3 = 9
	  	  R3 = 10
	  	  Select = 7
	  	  Start = 8
		 	 */
		
		a = new JoystickButton(joystick1, 1);
		b = new JoystickButton(joystick1, 2);
		x = new JoystickButton(joystick1, 3);
		y = new JoystickButton(joystick1, 4);
		Lb = new JoystickButton(joystick1, 5);
		Rb = new JoystickButton(joystick1, 6);
		Select = new JoystickButton(joystick1, 7);
		Start = new JoystickButton(joystick1, 8);
		L3 = new JoystickButton(joystick1, 9);
		R3 = new JoystickButton(joystick1, 10);
		
		
		/*-b calls the command ShootBox, when b is released the command StopShooter is called
		 * 
		 * -a calls the command GetBox, when a is released the command StopShooter is called
		 */
		b.whenPressed(new ShootBox());
		b.whenReleased(new StopShooter());
		a.whenPressed(new GetBox());
		a.whenReleased(new StopShooter());
		
	}
	
	public Joystick getjoystick1Joystick(){
		return joystick1;
	}
	
	
	
}

