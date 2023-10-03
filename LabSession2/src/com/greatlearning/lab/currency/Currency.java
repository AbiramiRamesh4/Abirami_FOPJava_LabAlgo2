package com.greatlearning.lab.currency;

public class Currency {
	public void CurrencyCount(int[] denominations, int PayValue) {
		int [] countDenominations =new int[denominations.length];
		for (int i=0; i< denominations.length; i++) {
			if(PayValue >= denominations[i]) {
			int countCur= PayValue / denominations[i];
			PayValue = PayValue - (denominations[i]* countCur);
			countDenominations[i] = countCur;
			if(PayValue==0) {break;}
			}
		}
	
	if(PayValue == 0) {
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0; i<denominations.length; i++) {
			if(countDenominations[i]!=0) {
				System.out.println(denominations[i]+":"+ countDenominations[i]);
			}
		}
		
		
		}else {
			System.out.println("Exact pay value cannot be paid with the highest possible denominations");
		}

}
}
