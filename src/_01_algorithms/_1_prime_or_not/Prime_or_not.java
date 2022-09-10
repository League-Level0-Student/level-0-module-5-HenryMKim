package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
	public static void main(String[] args) {
		
	
		boolean isPrime = true;
	String nu = JOptionPane.showInputDialog(null, "Give me a number.");
	int num = Integer.parseInt(nu);
	for(int i = 0; i<num; i++){
		if(i>1 && num%i==0) {
			isPrime= false;
			break;
		}
	}
	if(isPrime == true) {
		
	JOptionPane.showMessageDialog(null, "Your number is prime!");
	}
	if(isPrime == false) {
		
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
		}
	}
}
