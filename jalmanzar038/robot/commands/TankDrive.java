package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

/**
 * An example command that uses an example subsystem.
 */
public class TankDrive extends CommandBase {

    private DriveTrain driveMotors;
    private DoubleSupplier leftSupplier;
    private DoubleSupplier rightSupplier;

    public TankDrive(DriveTrain driveMotors, DoubleSupplier leftSupplier, DoubleSupplier rightSupplier) {
        
        this.driveMotors = driveMotors;
        this.leftSupplier = leftSupplier;
        this.rightSupplier = rightSupplier;

        addRequirements(driveMotors);
    }

    @Override 
    public void execute() {
        driveMotors.driveTank(leftSupplier.getAsDouble(), rightSupplier.getAsDouble());
    }

    @Override
    public void end(boolean interrupted) {
        driveMotors.driveTank(0,0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}