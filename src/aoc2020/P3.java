package aoc2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File ("/home/aaron/Escritorio/P3.txt");
		Scanner sc = new Scanner(file);
		char[][] map = new char[323][31];
		String[] aux = new String[323];
		
		int x, y, j, i = 0;
		int res = 0;
		
		while(sc.hasNext()) {
			aux[i] = sc.nextLine();
			i++;
		}
		
		for(i = 0; i < aux.length; i++) {
			for(j = 0; j < aux[i].length(); j++) {
				map[i][j] = aux[i].charAt(j);
			}
		}
				
		i = 0;
		x = 0;

		/*
		 * Problem 3.1
		 */
		
		while(i < 323 - 1) {
			x += 3;
			if(x >= 31) x = x - 31;
			i++;
			if(map[i][x] == '#') res++;
		}
		
		System.out.println(res);
		
		/*
		 * Problem 3.2
		 */
		
		int res2 = 0, res3 = 0, res4 = 0, res5 = 0;
		x = 0; i = 0;
		
		//R1, D1
		while(i < 323 - 1) {
			x++;
			if(x >= 31) x = x - 31;
			i++;
			if(map[i][x] == '#') res2++;
		}
		x = 0; i = 0;
		
		//R5, D1
		while(i < 323 - 1) {
			x += 5;
			if(x >= 31) x = x - 31;
			i++;
			if(map[i][x] == '#') res3++;
		}
		x = 0; i = 0;
		
		//R7, D1
		while(i < 323 - 1) {
			x += 7;
			if(x >= 31) x = x - 31;
			i++;
			if(map[i][x] == '#') res4++;
		}
		x = 0; i = 0;
		
		//R1, D2
		while(i < 323 - 1) {
			x++;
			if(x >= 31) x = x - 31;
			i += 2;
			if(map[i][x] == '#') res5++;
		}

		System.out.println((long) res * res2 * res3 * res4 *res5);
		
	}
}
