package org.usfirst.frc.team3158.robot.commands;

import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GetBox extends Command {

    public GetBox() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.Collector.GetBox();
    }

    //Robot.Collector.GetBox will run until the limit switch returns true
     
    protected void execute() {
    //	Robot.Collector.GetBox();
    }

    protected boolean isFinished() {
        return (Robot.Collector.LimitBoolean());
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
