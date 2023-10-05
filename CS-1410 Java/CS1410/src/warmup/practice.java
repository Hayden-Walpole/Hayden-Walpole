package warmup;

import java.util.Arrays;

public class practice {
	public static int[][] rotateLeft(int[][] arr){
		int dim = arr.length;
		int[][] rotatedArray=new int[Dim][Dim];
		for (int r=0; r<dim-1;r++) {
			for (int c=0; c<dim-1;c++) {
				rotatedArray[r][c] = arr[c][dim-(r+1)];
			}
		}
		return rotatedArray;
	}
	
		
	
}
