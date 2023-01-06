package jaggedArray;

public class Joy {
	public static void main(String[] args) {
		int[] arr = {1,235,345,345};
		int[] arr2 = {435,42562,426,2456,24656,256};
		int[][] arr3 = {arr,arr2};
		for(int[] temp : arr3)
		{
			for(int k : temp)
				System.out.print(k +" ");
			System.out.println();
		}
	}
}
