
public class Q10Span {
	public static void main(String[] args) {
		int a[]={1,4,2,1,4,1,5};
		int max = 0,l=0 ;
				for(int i=0;i<a.length;i++)
				{
					int no1 = a[i];
					for(int j=0;j<a.length;j++)
					{
						int no2 = a[j];
						
						if(no1==no2)
						{
							int x = i;
							int y = j;
							l =y-x;
						}
					} 
					if(l>max)
					{
						max = l;
					}
				}System.out.println(max);
					
	}
	
}
