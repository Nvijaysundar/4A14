package onedimensional;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		int sume=0,sumo=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
				sume += arr[i];
			if(i%2==1)
				sumo += arr[i];
		}
		System.out.println("Sume: "+sume);
		System.out.println("Sumo: "+sumo);
		greatest(arr);
		lowest(arr);
		maxfreq(arr);
	}

	private static void maxfreq(int[] arr) {
		Arrays.sort(arr);
		int cnt=0,max=0,ele=0;
		for(int i : arr) {
			cnt =0;
			for(int j : arr) {
				if(i  == j)
					cnt++;
			}
			if(max<cnt)
			{
				max = cnt;
				ele = i;
			}
		}
		System.out.println("Ele: "+ ele+" freq: "+max);		
	}

	private static void lowest(int[] arr) {
		int low =arr[0];
		for(int temp : arr)
			if(low>temp)
				low = temp;
		System.out.println("Low: "+low);
		Arrays.sort(arr);
		System.out.println("Low: "+arr[0]);
	}

	private static void greatest(int[] arr) {
		int max =arr[0];
		for(int temp : arr)
			if(max<temp)
				max = temp;
		System.out.println("MAx: "+max);
		Arrays.sort(arr);
		System.out.println("Max: "+arr[arr.length-1]);
	}
}








