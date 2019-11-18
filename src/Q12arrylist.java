import java.util.Scanner;

public class Q12arrylist {

	public static void main(String[] args) {
		/*
		 * arraylist1={ 1,2,3,4,5} arraylist2={ 6,7,8,9,10} size of both list should be
		 * same output={6,2,8,4,10}
		 */
		int[] a = new int[4];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
		int[] b = new int[4];
		System.out.println("enter here");
		for (int i = 0; i < b.length; i++) {

			b[i] = sc.nextInt();

		}

		// int a[]={1,2,3,4,5};
		//int b[] = { 6, 7, 8, 9, 10 };

		int c[] = new int[a.length + b.length];// Murge new Array in one Array
		int index = 0;

		for (int i = 0; i < a.length; i++)// for loop new s.lenght
		{
			if (i % 2 == 0)// conditin i devided 2
			{
				c[index] = b[i];// get odd value only
				index++;
			} else {
				c[index] = a[i];// get even value only
				index++;
			}
		}
		for (int i = 0; i < index; i++)// geting odd and even value
		{
			System.out.print(c[i] + " ");// concat or murge + final output
		}

	}

}
