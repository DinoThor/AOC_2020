package aoc2020;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P1 {

	public static void main(String[] args) throws FileNotFoundException {
		int[] input = new int[200];
		int i, j, k;
		File file = new File("/home/aaron/eclipse/Proyects/AOC/src/aoc2020/P1.txt");
		Scanner sc = new Scanner(file);

		boolean found = false;
		
		i = 0;
		while(sc.hasNext()) {
			input[i] = sc.nextInt();
			i++;
		}
		sc.close();
		
		/*
		 * Problem 1.1
		 */
		
		for(j = 0; !found && j < 200; j++) {
			for(k = 0; !found && k < 200; k++) {
				if(input[j] + input[k] == 2020) {
					System.out.print(input[j] * input[k]);
					found = true;
				}
			}
		}
		System.out.print("\n\n");
		
		/*
		 * Problem 1.2
		 */
		
		found = false;
		
		for(i = 0; !found && i < 200; i++) {
			for(j = 0; !found && j < 200; j++) {
				for(k = 0; !found && k < 200; k++) {
					if(input[i] + input[j] + input[k] == 2020) {
						System.out.print(input[i] * input[j] * input[k] + "\n");
						found = true;
					}
				}
			}
		}
	}
}
