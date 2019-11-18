import java.util.Scanner;

public class Q8Alphabet {
	public static void main(String[] args) {
		/*
		 * Given array of string check whether all the elements contains only digits not
		 * any alaphabets. if condn satisfied print 1 else -1.
		 * Input:{"123","23.14","522"} output:1
		 */
		String[] s = new String[3];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {

			s[i] = sc.next();

		}

		// String[] s = { "123", "23.14", "522" };
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			String x = s[i];

			try {

				double no = Double.parseDouble(x);// convert value in bouble
				count++;
			} catch (Throwable t) {
				System.out.println("-1");// condition fail
			}
		}
		if (count == s.length) {// compairing count and String lenght
			System.out.println("1");
		}

	}

}
