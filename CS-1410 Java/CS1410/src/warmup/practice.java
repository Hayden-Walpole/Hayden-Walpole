package warmup;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vals= {1,2,3,4};
		multiplyArray(vals,7);
		System.out.print(Arrays.toString(vals));
	}
	public static void multiplyArray(int[] array, int number) {
		for(int i = 0; i< array.length; i++)
			array[i]= array[i]*number;
	}
}