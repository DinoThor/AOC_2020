package AOC;

import java.util.Scanner;
import java.lang.String;
import java.io.FileNotFoundException;
import java.io.File;

public class P2 {

	public static void main(String[] args) throws FileNotFoundException {
		String[] timesAux = new String[1000];
		String[] letterAux = new String[1000];
		String[] pwd = new String[1000];
		
		int i = 0, j;
		int res = 0;
		int aux;
		
		File file = new File("C:\\Users\\Aaron\\Desktop\\P2.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			timesAux[i] = sc.next();
			letterAux[i] = sc.next();
			pwd[i] = sc.next();
			i++;
		}
		sc.close();
		
		int[][] times = new int[1000][2];
		
		for(i = 0; i < 1000; i++) {
			String[] temp = timesAux[i].split("-");
			times[i][0] = Integer.parseInt(temp[0]);
			times[i][1] = Integer.parseInt(temp[1]);
		}

		char[] letter = new char[1000];
		
		for(i = 0; i < 1000; i++) {
			letter[i] = letterAux[i].charAt(0);
		}
		/*
		 * Problem 2.1
		 */
		for(i = 0; i < 1000; i++) {
			aux = 0;
			for(j = 0; j < pwd[i].length(); j++) {
				if(pwd[i].charAt(j) == letter[i]) {
					aux++;
				}
			}
			if(aux >= times[i][0] && aux <= times[i][1]) { res++; }
		}
		
		System.out.print(res + "\n");
		
		res = 0;
		/*
		 * Problem 2.2
		 */
		for(i = 0; i < 1000; i++) {
			aux = 0;
			if(pwd[i].length() >= times[i][1]) {
				if(pwd[i].charAt(times[i][0] - 1) == letter[i]) aux++;
				if(pwd[i].charAt(times[i][1] - 1) == letter[i]) aux++;
			}
			if(aux == 1) res++;
		}
		System.out.print(res);
	}
}
