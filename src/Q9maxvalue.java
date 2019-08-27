
public class Q9maxvalue {

	public static void main(String[] args) {
		int a[]={12,14,2,26,35};
				int min = 0,max = 0 ;
				for(int i=0;i<a.length;i++)
				{
					int no = a[i];
					if(no>max)
					{
						max = no;
					}
					else 
					{
						min = no;
					}
				}System.out.print(max+"-"+min+"=");
				System.out.print((max-min));
				
				
	}
}
