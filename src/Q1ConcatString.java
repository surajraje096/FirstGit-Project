import java.util.Scanner;

public class Q1ConcatString {
	public static void main(String[] args) {

		/*
		 * compare two strings, if the characters in string 1 are present in string 2,
		 * then it should be put as such in output, else '+' should be put in
		 * output...ignore case difference.
		 * 
		 * input 1:"New York" input 2:"NWYR"
		 * 
		 * output:N+w+Y+r+
		 */


		Scanner se = new Scanner(System.in);
		System.out.println("enter first String=");
		String s = se.next();
		System.out.println("enter second String=");
		String n = se.next();

		// String s = "New York";
		// String n = "NWYR";
		String j = s.toUpperCase();// all string convert in upper case
		String ans = "";
		for (int i = 0; i < j.length(); i++) {
			int count = 0;
			char c = j.charAt(i);

			for (int k = 0; k < n.length(); k++) {
				char c1 = n.charAt(k);

				if (c == c1) {// compairing two string
					ans = ans + s.charAt(i);
				} else {
					count++;
				}
			}
			if (count == n.length()) {// adding matching String +string
				ans = ans + "+";
			}
		}
		System.out.println(ans);// final outpute

	}

}
