package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	static Robot flapdoodly = new Robot();
public static void main(String[] args) {
	
	flapdoodly.setSpeed(100);
	flapdoodly.penDown();
	String h = JOptionPane.showInputDialog(null, "What shape do you want the robot to draw? A square, triangle , or a circle.");
if(h.equals("square") ) {
	drawSquare();
}
if(h.equals("triangle") ) {
	drawTriangle();
}
if(h.equals("circle") ) {
	drawSquare();
}
}
public static void drawSquare() {
	for(int i = 0; i < 4; i++) {
		flapdoodly.move(300);
		flapdoodly.turn(90);
		}
}
public static void drawTriangle() {
	for(int i = 0; i < 3; i++) {
		flapdoodly.move(300);
		flapdoodly.turn(120);
		}
}
	public static void drawCircle() {
		for(int i = 0; i < 360; i++) {
			flapdoodly.move(2);
			flapdoodly.turn(1);
			}
	}

}