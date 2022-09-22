package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter Number");
		int totalNumber = in.nextInt();
		int[] numberArray;
		numberArray = new int[totalNumber];
		int count = 1;
		for (int i = 0; i < totalNumber; i++) {
			numberArray[i] = count;
			count++;
			//System.out.println(numberArray[i]);
		}
		for (int p = 0; p < numberArray.length; p++) {
			if (numberArray[p] == 2 || numberArray[p] == 3 || numberArray[p] == 5 || numberArray[p] == 7 || numberArray[p] == 11) {
			System.out.println(numberArray[p] + " is a prime number!");
			}
			if (numberArray[p] == 1 || numberArray[p] % 2 == 0 || numberArray[p] % 3 == 0 || numberArray[p] % 5 == 0 || numberArray[p] % 7 == 0 || numberArray[p] % 11 == 0) {
				numberArray[p] = 0; 
			}
			else 
			{
			System.out.println(numberArray[p] + " is a prime number!");
			}
		
}
	}
}
