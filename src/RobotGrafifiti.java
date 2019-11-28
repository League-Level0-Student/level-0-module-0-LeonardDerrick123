import org.jointheleague.graphical.robot.Robot;

public class RobotGrafifiti {
public static void main(String[] args) {
	Robot dEEZnutS = new Robot();
	dEEZnutS.penDown();
	dEEZnutS.setSpeed(2800000);
	dEEZnutS.setAngle(180);
	dEEZnutS.move(200);
	dEEZnutS.turn(-90);
	dEEZnutS.move(100);
	dEEZnutS.hide();

}
}
