import java.util.Scanner;

public class Q9maxvalue {

	public static void main(String[] args) {
		/*int[] a={12,14,2,26,35}
		find the difference b/w max and min values in array
		output:35-2=33.
		*/
		int[] a = new int[5];
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();

		}
	//	int a[]={12,14,2,26,35};
				int min = 0,max = 0 ;
				for(int i=0;i<a.length;i++)
				{
					int no = a[i];
					if(no>max)//max value are 0 so alws true
					{
						max = no;//max value hear
					}
					else 
					{
						min = no;//condition in case fail then min value
					}
				}System.out.print(max+"-"+min+"=");//get value max-min
				System.out.print((max-min));//final output
				
				
	}
}
