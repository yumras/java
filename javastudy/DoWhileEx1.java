package javastudy;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	
	char a = 'a';
	
	do {
		System.out.print(a);
		a = (char) (a + 1);
	} while (a <= 'z'); 		
		
		
		
		
	}

}
