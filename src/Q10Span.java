import java.util.Scanner;

public class Q10Span {
	public static void main(String[] args) {
		/*
		 * Given an array find the largest 'span'(span is the number of elements between
		 * two same digits) find their sum. a[]={1,4,2,1,4,1,5} Largest span=5
		 */
		
		int[] a = new int[7];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}

		//int a[] = { 1, 4, 2, 1, 4, 1, 5 };
		int max = 0, l = 0;
		for (int i = 0; i < a.length; i++)// first loop for "a"
		{
			int no1 = a[i];// value stoared no1
			for (int j = 0; j < a.length; j++)// second loop for "a"
			{
				int no2 = a[j];// value stoared no2

				if (no1 == no2)// compairing two value
				{
					int x = i;
					int y = j;
					l = y - x;// subtract big-low
				}
			}
			if (l > max)// condition value is less than max
			{
				max = l;// storing value in max
			}
		}
		System.out.println(max);// final output

	}

}
