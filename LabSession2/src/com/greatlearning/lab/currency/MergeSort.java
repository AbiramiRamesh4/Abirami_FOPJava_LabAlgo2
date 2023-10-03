package com.greatlearning.lab.currency;

public class MergeSort
{
	public void Sort(int[] arr,int left, int right)
	{
		if(left< right) 
		{
		int mid= (left+right)/2;
		Sort(arr,left,mid);
		Sort(arr, mid+1, right);
		merge(arr,left, mid, right);
		}
	}
private void merge(int [] arr, int left, int mid, int right) {
	int a =mid-left+1;
	int b =right-mid;
	int[] leftArray = new int[a];
	int[] rightArray = new int[b];
	
	for(int i=0;i<a; i++) {leftArray[i]= arr[left+i];}
	for(int j=0;j<b; j++) {rightArray[j]= arr[mid+1+j];}
	
	int i=0, j=0;
	int k=left;
	
	while(i<a && j<b) {
		if(leftArray[i] > rightArray[j]) {
		arr[k]= leftArray[i];
		i++;
		}
		else {
			arr[k]= rightArray[j];
			j++;
		}
		k++;
	}
	while(i<a) {
		arr[k]=leftArray[i];
		i++;
		k++;
		
	}
	while(j<b) {
		arr[k]=rightArray[j];
		j++;
		k++;
		
	}
}
}
