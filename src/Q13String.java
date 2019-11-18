import java.util.Scanner;

public class Q13String {
	public static void main(String[] args) {
		/*
		 * count the number of times the second word in second string occurs in first
		 * string-case sensitive
		 * 
		 * input1=hai hello hai where hai Hai; input2=what hai output=3;
		 */
		System.out.println("enter here");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter here");
		String s1=sc.nextLine();





		//String s = "hai hello hai where hai Hai";
	//	String s1 = "what hai";
		String a1[] = s.split(" ");//split s
		String a2[] = s1.split(" ");//split s1
		String n = a2[1];
		int count = 0;

		for (int i = 0; i < a1.length; i++) {// for loop split a1
			String j = a1[i];//storing value in String j

			if (j.equals(n)) {//.equals compiring contain
				count++;
			}
		}
		System.out.println(count);//final output

	}

}
