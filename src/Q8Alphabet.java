
public class Q8Alphabet {
	public static void main(String[] args) {
		String[] s = {"suraj","23.14","522"};	
				int count = 0 ;
				for(int i=0;i<s.length;i++)
				{
					String x = s[i];
					
					try{
						
					double no = Double.parseDouble(x);
					count++;
					}catch(Throwable t){
						System.out.println("-1");
					}
				}
				if(count==s.length)
				{
					System.out.println("1");
				}
				
	}

}
