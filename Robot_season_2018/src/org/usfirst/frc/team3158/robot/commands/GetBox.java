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
    	requires(Robot.collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    //Robot.Collector.GetBox will run until the limit switch returns true
     
    protected void execute() {
    //	Robot.Collector.GetBox();
    	Robot.collector.GetBox();
    }

    protected boolean isFinished() {
        return Robot.collector.LimitBoolean();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
