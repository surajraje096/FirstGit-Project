import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Q15CurrentDateinNextyear {
	public static void main(String[] args) throws ParseException {

		// Retrieve the max from array which is in a odd-index

		// --------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("enter date in dd/MM/yyyy");
		String n1 = sc.next();

		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = (c.get(Calendar.MONTH)) + 1;
		int year = c.get(Calendar.YEAR) + 1;

		String n = day + "/" + month + "/" + year;

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// date format
		Date d = sdf.parse(n1);// converting in Date format
		System.out.println(sdf.format(d));

		sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(d));// final output
	}

}
