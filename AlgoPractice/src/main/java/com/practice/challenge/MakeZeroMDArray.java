package com.practice.challenge;

public class MakeZeroMDArray {
	
	public static void main(String[] args) {
		int[][] mdArray = {{1,1,1}, {1,1,1}, {1,1,0}};
		System.out.println("Given Array : ");
		printArray(mdArray);
		makeZeroRowsAndColumns(mdArray);
	}
	
	static void makeZeroRowsAndColumns(int[][] array) {
		for(int row=0; row<array.length; row++) {
			for(int column=0; column<array[row].length; column++) {
				if(array[row][column] == 0) {
					System.out.println("Zero found in loc : row "+ (row+1) +" column : "+ (column+1));
					makeRowZero(array, row);
					makeColumnZero(array, column);
				}
			}
		}
		System.out.println("After performed : ");
		printArray(array);
	}

	private static void printArray(int[][] array) {

		for(int row = 0; row<array.length; row++) {
			for(int column = 0; column<array[row].length; column++) {
				System.out.print(array[row][column]+ "  ");
			}
			System.out.println();
		}
		
	}

	private static void makeRowZero(int[][] array, int row) {
		System.out.println("Make Row zero");
		for(int column = 0; column<array[row].length; column++) {
			array[row][column] = 0;
		}
	}

	private static void makeColumnZero(int[][] array, int column) {
		System.out.println("Make Coulmn zero");
		for(int row = 0; row<array.length; row++) {
			array[row][column] = 0;
		}
	}
}
