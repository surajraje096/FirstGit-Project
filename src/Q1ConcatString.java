
public class Q1ConcatString {
	public static void main(String[] args) {
		String s = "New York";
		String n = "NWYR";
  String j = s.toUpperCase();
		String ans = "";
		for(int i=0;i<j.length();i++)
		{
			int count = 0 ;
			char c = j.charAt(i);
			
			for(int k=0;k<n.length();k++)
			{
				char c1 = n.charAt(k);
				
				if(c==c1)
				{
					ans = ans + s.charAt(i);
				}
				else
				{
					count++;
				}
			}
			if(count==n.length())
			{
				ans = ans + "+";
			}
		}System.out.println(ans);
		
		
		
		
		
	}

}
