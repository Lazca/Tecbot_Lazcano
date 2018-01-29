package org.usfirst.frc.team3158.robot.commands;

import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ExtendCollector extends Command {

    public ExtendCollector() {
    	requires(Robot.collector);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if (Robot.collector.Extended()) {
    		Robot.collector.RetractCollector();
    	}else {
    		Robot.collector.ExtendCollector();
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}