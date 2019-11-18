import java.util.Scanner;

public class Q21evenindex {
	public static void main(String[] args) {

		/*
		 * Given an array int a[]. Add the sum at even indexes.do the same with odd
		 * indexes. if both the sum is equal return 1 or return -1.
		 */
		int[] no = new int[4];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < no.length; i++) {

			no[i] = sc.nextInt();

		}

//		int no[]={1,2,3,4};	

		int even = 0;
		int odd = 0;
		for (int i = 0; i < no.length; i++) {
			int j = no[i];
			if (j % 2 == 0) {
				even = even + j;
			} else {
				odd = odd + j;
			}
		}
		if (even == odd) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	}

}
