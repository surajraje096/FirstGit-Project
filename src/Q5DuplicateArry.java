import java.util.Iterator;
import java.util.LinkedHashSet;

public class Q5DuplicateArry {
public static void main(String[] args) {
	int no[]={2,3,5,4,1,6,7,7,9};
	
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			
			for(int i=0;i<no.length;i++)
			{
				int x = no[i];
				hs.add(x);
			}
			
			int ans= 0,index = 0 ;
			Iterator<Integer> it = hs.iterator();
			int j[] = new int[no.length];
			while(it.hasNext())
			{
				j[index] = it.next();
				index++;
			}
			
			for(int i=0;i<index;i++)
			{
				if(j[i]%2==0)
				{
					ans = ans + j[i];
				}
			}
			
			if(ans==0)
			{
				System.out.println("-1");
			}
			else
			{
				System.out.println(ans);
			}
}
	
	
}
