package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	 Robot damon = new Robot();
damon.penDown();
	 for (int i = 0; i < 4; i++) {
		 damon.move(200);
		damon.turn(90);
	}
	 
		
	}
}
