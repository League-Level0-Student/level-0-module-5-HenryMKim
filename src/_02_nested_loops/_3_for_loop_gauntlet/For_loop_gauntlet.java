package _02_nested_loops._3_for_loop_gauntlet;

public class For_loop_gauntlet {
	public static void main(String[] args) {
		for(int i=0; i <= 100; i++) {
			System.out.println(i);
		}
		for(int o=100; o > 0; o--) {
			System.out.println(o);
		}
		int p = 0;
		for(int k = 0; k < 50; k++) {
		
		System.out.println(p);
		p = p + 2;
		}
		int l = 1;
		for(int y = 0; y < 50; y++) {
		
		System.out.println(l);
		l = l + 2;
		}
		for(int h=0; h <= 500; h++) {
			if(h%2 == 1) {
							System.out.println(h + " Is odd.");
			}
			else{
				System.out.println(h + " Is equal.");
				}
		}
		int g = 0;
		for(int t = 0; t < 112; t++) {
		
		System.out.println(g);	
		g = g + 7;
	
	}
		
		int year = 2022;
		for(int age = 12; age > 0; age--) {
			System.out.println("In year " + year + " I was " + age + " years old.");

			year = year - 1;
	}
	for(int b = 0; b < 3; b++) {
			for(int d = 0; d < 3; d++) {
				System.out.println(b + " " + d);
			}
			
		}
		int amogus = 1;
		for(int q = 0; q < 3; q++) {
		for(int e = 0; e < 3; e++) {
			System.out.print(amogus + " ");
			amogus = amogus + 1;
		}
		System.out.println(" ");
		}
		
		int amogusgus = 1;
		for(int q = 0; q < 10; q++) {
		for(int e = 0; e < 10; e++) {
			System.out.print(amogusgus + " ");
			amogusgus = amogusgus + 1;
		}
		System.out.println(" ");
		}
		
		int amoamogusgus = 1;
		for(int q = 0; q < 6; q++) {
			for(int e = 0; e < amoamogusgus; e++) {
				System.out.print("* ");
				}
			amoamogusgus = amoamogusgus + 1;
			System.out.println(" ");
		}
	}
}
	

