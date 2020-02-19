package Games;

import java.util.Random;

public class Cube {

	public static void main(String[] args) {
		//1 0 1
		//  1   
		//1 0 1
		Random random = new Random();
		
		System.out.println(random.nextInt(6) + 1);
		
//		int[][] array = {
//				{random.nextInt(2), random.nextInt(2), random.nextInt(2)},
//				{random.nextInt(2), random.nextInt(2), random.nextInt(2)}
//				};
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}