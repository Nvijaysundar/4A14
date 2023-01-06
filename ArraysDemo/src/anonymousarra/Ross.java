package anonymousarra;

import java.util.Arrays;

public class Ross {
	public static void main(String[] args) {
		
		greatest(new int[] {435,23,546,424,565});
	}

	private static void greatest(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
