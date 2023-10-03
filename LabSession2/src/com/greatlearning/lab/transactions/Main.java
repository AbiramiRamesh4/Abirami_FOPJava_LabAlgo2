package com.greatlearning.lab.transactions;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Transaction transaction = new Transaction();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Trxn array:");
		int size =scan.nextInt();
		int[] transactions = new int[size];
		System.out.println("Enter the values of the Trxn:");
		for(int i=0; i<size; i++) {
			transactions[i]=scan.nextInt();
			
		}
		
		System.out.println("Enter the number of the targets need to be checked:");
		int TargetSize = scan.nextInt();
		for (int i=0; i<TargetSize; i++) {
			System.out.println("Enter the target value:");
			int target = scan.nextInt();
			int result = transaction.targetCheck(transactions, target);
			if(result >= 0) {
				System.out.println("Output: The target can be acheived after "+ (int)(result+1) +" Transactions");
			}
			else {
				System.out.println("The target cannot be acheived with given Transactions !!!");
			}
			
		}	
		scan.close();
		
	}

}

