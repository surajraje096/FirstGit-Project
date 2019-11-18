import java.util.Scanner;

public class Q14consecutive {

	public static void main(String[] args) {
		/*
		 * find the no.of charcters,that has repeated 3 consecutive times
		 * input1:"aaabbccc" ouput1=2;
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("enter String");
		String s = se.next();

		// String s = "aaabbccc";
		int count = 0;//count variable to incriment value stored
		for (int i = 0; i < s.length() - 2; i++)// for loop geting 3 value
		{
			if ((s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i) == s.charAt(i + 2)))// compairing value 0+1+2
			{
				count++;
			}
		}
		System.out.println(count);// final output

	}
}
