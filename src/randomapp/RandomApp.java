package randomapp;

import java.util.Random;

public class RandomApp {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(50)+1;
		System.out.println("random value : " + num);
	}

}
