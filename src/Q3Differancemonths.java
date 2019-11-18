
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q3Differancemonths {

	public static void main(String[] args) {

		// months between two date

		Scanner se = new Scanner(System.in);
		System.out.println("enter 1 date format=yyyy-mm-dd=");
		String n = se.next();
		System.out.println("enter 2 date format=yyyy-mm-dd=");
		String j = se.next();
		// String n = "2012-12-01"; String j = "2012-01-03";
		// validate+dynamic

		LocalDate d = LocalDate.of(2013, 10, 01);
		LocalDate x = LocalDate.of(2012, 01, 01);

		System.out.println(ChronoUnit.MONTHS.between(x, d));
	}

}
