
public class Q4String {
	public static void main(String[] args) {
	
			
			String s = "xyzwabcd";
			String ans1 = s.substring(2,4);
			
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String x = sb.toString();
			String ans2 = x.substring(2,4);
			sb = new StringBuffer(ans1);
			sb.reverse();
			String ans3 = sb.toString();
			System.out.println(ans2.concat(ans3));
			
			
			
			/*String s = "xyzwabcd";
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			String rev=sb.toString();
		System.out.println(rev.substring(2,6));
			*/
		}
	}


