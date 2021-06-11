package com.practice.sortingalgorithms;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22 };
		for (int fui = 1; fui < array.length; fui++) {
			int newelement = array[fui];
			int i;
			for (i = fui; i > 0 && array[i - 1] > newelement; i--) {
				array[i] = array[i - 1];
			}
			array[i] = newelement;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
