package _00_welcome;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class Welcome {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.setSpeed(2800000);
		r2d2.move(400);
		JOptionPane.showMessageDialog(null, "DEEZ NUTS!!!!");
	}
}
