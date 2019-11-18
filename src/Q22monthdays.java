import java.time.YearMonth;

public class Q22monthdays {

	public static void main(String[] args) {
		
		// no of days in a month in specific year
		
		YearMonth n = YearMonth.of(2012,02);
		System.out.println(n.lengthOfMonth());
		
	}
}
