import java.util.Scanner;

public class Q7Squiring {
	public static void main(String[] args) {
		/*
		 * Given array of intergers,print the sum of elements sqaring/cubing as per the
		 * power of their indices. //answer= sum=sum+a[i]^i; eg:input:{2,3,5} Output:29
		 */
		int[] a = new int[3];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		//int a[] = { 2, 3, 5 };
		double x = 0;
		for (int i = 0; i < a.length; i++) {
			x = x + (Math.pow((double) a[i], (double) i));//math.pow buildin function
		}
		System.out.println((int) x);//final outpute

	}

}
