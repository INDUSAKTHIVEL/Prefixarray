package Prefix_array;

import java.util.Scanner;

public class Prefix_sum {
	static int n,a,i;
	public static int [] Prefix_array(int arr[])
	{
		int n[]=new int[a];
		n[0]=arr[0];
		for(i=0;i<a;i++);
		{
			n[i]=n[i-1]+arr[i];
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		int [] arr = new int[a];
		for ( i=1;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		int prefix[]=Prefix_array(arr);
		for ( i=0;i<a;i++) {
			System.out.print(prefix[i]);
		}
	
	}
}
