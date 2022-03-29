import java.util.*;
class squareandmul{
	public static void main(String[] args) {
		int y,,a,n;
		y=1;

		Scanner scan = new Scanner(System.in);
		System.out.println("value of a = ");
		a = scan.nextInt();
		System.out.println("value of n= ");
		n= scan.nextInt();
		System.out.println("value of i= ");
		i= scan.nextInt();

		int [] x = new int[i];
		System.out.println("value of x in binary form is =");
		x= scan.nextInt();

		for(int i=0;i<=n-1;i++)
		{
			if (x[i]==1) 
			{
				y= (a*y)% n;
				
			}
			a= (a*a)% n;
		}
		
	}
}