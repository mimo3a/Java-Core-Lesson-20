package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Scanner;

public class MyScanner {
	
	int[] fibonachiArray;
	
	public int[] runnScanner() {
		System.out.println("¬вед≥ть к≥льк≥сть чисел ‘ибоначч≥");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fibonachi0 = 1;
		int fibonachi1 = 1;
		int fibonachi;
		fibonachiArray = new int [number];
		fibonachiArray[0] = fibonachi0;
		fibonachiArray[1] = fibonachi1;
		for (int i = 2; i < number; i ++) {
			fibonachi = fibonachi0 + fibonachi1;			 
			fibonachiArray[i] = fibonachi;
			fibonachi0 = fibonachi1;
			fibonachi1 = fibonachi;
		}
		
//		System.out.println(Arrays.toString( fibonachiArray));
		return fibonachiArray;
		
	}
	

}
