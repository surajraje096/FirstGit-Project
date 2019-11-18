import java.util.Scanner;

public class Q20String {
	public static void main(String[] args) {
		/*
		 * for the given string display the middle 2 value, case satisfies only if
		 * string is of even length ip - java op - av
		 */

		Scanner se = new Scanner(System.in);
		System.out.println("enter string=");
		String s = se.next();
		int n = s.length() / 2;
		System.out.println(s.substring(n - 1, n + 1));//final output
	}

}
