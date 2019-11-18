import java.util.Scanner;

public class Q2Substring {
	public static void main(String[] args) {

		/*
		 * input: Searchstring s1="GeniusRajkumarDev"; String s2="Raj"; String s3="Dev";
		 * output: Return 1 if s2 comes before s3 in searchstring else return 2
		 * 
		 */
		Scanner se = new Scanner(System.in);
		System.out.println("enter String=");
		String s = se.next();

		// String s = "GeniusRajkumarDev";
		String s2 = "Raj";
		String s3 = "Dev";
//-------------------------------------------------------------------------
		int no = 0, no1 = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.startsWith(s2, i)) {
				no = i;
			} else if (s.startsWith(s3, i)) {
				no1 = i;
			}
		}
		System.out.println("Raj:" + no);
		System.out.println("Dev:" + no1);
		if (no < no1) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

	}
}
