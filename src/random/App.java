package random;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(50)+1;
		System.out.println("random value : " + num);
	}
}