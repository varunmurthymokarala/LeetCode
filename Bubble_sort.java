package com.practice.sortingalgorithms;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {108, 54, -27, 24, -3, -9, 7};
		
		for(int unsortedindex = array.length-1; unsortedindex > 0; unsortedindex--) {
			for(int i=0; i<unsortedindex; i++) {
				
				if(array[i] > array[i+1]) {
					swap(array, i, i+1);
				}
			}
		}
		for(int i=0; i<array.length-1; i++ ) {
			System.out.println(array[i]);
		}
	}

	public static void swap(int array[], int i, int j) {

		if (i == j) {
			return;
		} else {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}
	}

}