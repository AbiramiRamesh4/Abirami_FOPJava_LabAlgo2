package com.greatlearning.lab.currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the size of currency denominations:");
		int size =scan.nextInt();
		int[] denominations = new int[size];
		
		System.out.println("Enter the currency denominations value:");
		for(int i=0; i<size; i++) {
			denominations[i]=scan.nextInt();
			}
		System.out.println("Enter the amount you want to pay:");
		int PayValue =scan.nextInt();

		MergeSort sort = new MergeSort();
		sort.Sort(denominations,0,denominations.length-1);
		System.out.println("");
		
		Currency cur =new Currency();
		cur.CurrencyCount(denominations,PayValue);
		
		scan.close();

		
	}

}
