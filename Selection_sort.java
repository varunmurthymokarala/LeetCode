package com.practice.sortingalgorithms;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 1, -99, 6, -87, 50, -43, 99 };

		for (int LUI = intArray.length - 1; LUI > 0; LUI--) {
			int Largest = 0;
			for (int i = 1; i <= LUI; i++) {
				if (intArray[i] > intArray[Largest]) {
					Largest = i;

				}
			}
			swap(intArray, Largest, LUI);
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		} else {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;

		}
	}

}
