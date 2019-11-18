import java.util.Scanner;

public class Q17ArrayReverced {
	public static void main(String[] args) {

		/*
		 * input array={red,green,blue,ivory} sort the given array reverse the given
		 * array if user input is 1 it should give oth element of an reversed array.
		 * 
		 */

		String[] s = new String[4];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {

			s[i] = sc.nextLine();

		}

		// String s[] = { "red", "green", "blue", "ivory" };

		String s1[] = new String[s.length];//creating new array
		int index = 0;

		for (int i = s.length - 1; i >= 0; i--) {
			String temp = s[i];//Storing value in String temp
			s1[index] = temp;//value array stoar s1
			index++;//index incriment
		}
		int no = 1;
		System.out.println(s1[no - 1]);//final out

	}

}
