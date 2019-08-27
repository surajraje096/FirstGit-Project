
public class Q6diffrent {
	public static void main(String[] args) {
		String s1 = "abc2012345";
		String s2 = "abc2112660";
		
		String s3 = s1.substring(5,s1.length());
		String s4 = s2.substring(5,s2.length());
		
		int no1 = Integer.parseInt(s3);
		int no2 = Integer.parseInt(s4);
		int ans = 0 ,n =4;
		
		if(no1>no2)
		{
			ans = no1-no2;
		}else 
		{
			ans = no2-no1;
		}
		
		int nj = ans * n;
		System.out.println(nj);
		
	}

}
