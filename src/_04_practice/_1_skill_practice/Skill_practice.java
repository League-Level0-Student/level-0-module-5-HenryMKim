package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class Skill_practice {
public static void main(String[] args) {
	String monke = JOptionPane.showInputDialog(null, "How many dimes do you have?");
	int monk = Integer.parseInt(monke);
	monk = monk * 10;
	JOptionPane.showMessageDialog(null, "You have " + monk + " cents.");
	String monkey =  JOptionPane.showInputDialog(null, "How many inches tall are you?");
	int mon = Integer.parseInt(monkey);
	if(mon <= 36) {
		JOptionPane.showMessageDialog(null, "Eat your wheaties!");
	}
	int oh = 0;
	while(oh <= 30) {
		System.out.println(oh);
		oh = oh + 3;
	}
}
}
