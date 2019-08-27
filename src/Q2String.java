
public class Q2String {
public static void main(String[] args) {
	String s = "GeniusRajkumarDev";
	String s2 = "Raj";
	String s3 = "Dev";
	int no = 0 , no1 = 0 ;
	for(int i=0;i<s.length();i++)
	{
		
		if(s.startsWith(s2, i))
		{
			no = i;
		}
		else if(s.startsWith(s3,i))
		{
			no1 = i ;
		}
	}
	System.out.println("Raj:"+no);
	System.out.println("Dev:"+no1);
	if(no<no1)
	{
		System.out.println("1");
	}
	else
	{
		System.out.println("2");
	}
	
}
}
