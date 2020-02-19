package tests;

import java.util.Random;

public class Counter {
	public static void main(String[] args) {
//		int n = 0;
//		while (n < 10) {
//			System.out.println("punkt");
//			n++;
//		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("punkt");
//		}

		int xSize = 3;
		int ySize = 3;
		int zSize = 3;
		
		int bound = 100;
		Random random = new Random();
		
		int[][][] map = new int[xSize][ySize][zSize];
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				for (int z = 0; z < map[x][y].length; z++) {
					int number = random.nextInt(bound);
					map[x][y][z] = number;
					System.out.print(number + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}