package Day2Assignment;

import java.util.Scanner;

public class que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter values:");
	    int lower=sc.nextInt();
	    int upper=sc.nextInt();
		
		 
		int f=0;
		int s=1;
		int t;
		 for(int i=1;i<=30;i++) {
			// System.out.println("number");
			 if(f>=lower && f<upper)
			 System.out.print(f+" ");
			  t=f+s;
			 f=s;
			 s=t;
			  
		 }
					

	}
	

}
