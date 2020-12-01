package aoc2020;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P1 {

	public static void main(String[] args) throws FileNotFoundException {
		int[] input = new int[200];
		int i, j, k;
		File file = new File("/home/aaron/eclipse/Proyects/AOC/src/aoc2020/P1.txt");
		//Scanner sc = new Scanner(new File("\\AOC\\src\\aoc2020\\P1.txt"));
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
				int aux = input[j] + input[k];
				if(aux == 2020) {
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
					
					int aux1 = input[i];
					int aux2 = input[j];
					int aux3 = input[k];
					if(aux1 + aux2 + aux3 == 2020) {
						System.out.print(aux1*aux2*aux3 + "\n");
						found = true;
					}
				}
			}
		}
	}
}
