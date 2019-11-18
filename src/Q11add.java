import java.util.Scanner;

public class Q11add {

	public static void main(String[] args) {
		/*
		 * input={"1","2","3","4"} output=10 ie,if string elements are nos,add it.
		 * input={"a","b"} output=-1;
		 */

		String[] s = new String[4];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i<s.length;i++) {

			s[i] = sc.nextLine();

		}

		//String s[] = { "1", "2", "3", "4" };

		double ans = 0;
		String j = "";

		try {// using try catch in case of error
			for (int i = 0; i < s.length; i++) {// for loop for s.lenght

				String n = s[i];// storing value in string n
				double no = Double.parseDouble(n);// double becouse value in decimal
				ans = ans + no;
				j = String.valueOf(ans);// method converts different types of values into string
			}
		} catch (Throwable t) {
			j = "-1";
		} finally {
			System.out.println(j);// final output
		}

	}

}
