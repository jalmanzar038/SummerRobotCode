package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.*;

public class DriveTrain extends SubsystemBase { 

    private WPI_TalonSRX leftMotor = new WPI_TalonSRX(DriveConstants.leftDriveCAN);
    private WPI_TalonSRX rightMotor = new WPI_TalonSRX(DriveConstants.rightDriveCAN);
    private DifferentialDrive motorControl;

    public DriveTrain() {
        super();
        this.motorControl = new DifferentialDrive(leftMotor, rightMotor);
    }

    public void driveTank(double left, double right) {
        motorControl.tankDrive(-left, -right);
    }

    public void driveArcade(double speed, double rotation) {
        motorControl.arcadeDrive(speed, rotation);
    }

}