package historia;

import java.util.Random;

public abstract class RandomEvent {
	
	static Random rdn = new Random();
	
	public static String getSuccess(int dificuldade, String op1, String op2) {
		int x = rdn.nextInt(100);
		
		if (x >= dificuldade) {
			return op1;
		} else {
			return op2;
		}
	}
	
}
