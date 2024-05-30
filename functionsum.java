import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 no's : ");
		int n1 = in.nextInt();
		int n2= in.nextInt();
		int n3=in.nextInt();
		sum(n1,n2,n3);
	}	
		public static void  sum(int n1,int n2,int n3)
		{
			int s =n1+n2+n3;
			System.out.println("Sum : "+s);
		}
	public static void  mul(int n1,int n2,int n3)
		{
			int m =n1*n2*n3;
			System.out.println("Sum : "+m);
		}

}
