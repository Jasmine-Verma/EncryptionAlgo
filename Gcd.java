import java.util.Scanner;
public class Gcd{
	 public static void main(String args[]){
	 	Scanner in = new Scanner(System.in);
	 	System.out.println("Input the number for which we have to find out the GCD: ");
	 	System.out.println("Number a = ");

	 	int a = in.nextInt();
	 	System.out.println("Number b = ");

	 	int b = in.nextInt();

	 	int r1 = a;
	 	int r2 = b;
	 	int s1 = 1;
	 	int s2 = 0;
	 	int t1 = 0;
	 	int t2 = 1;
	 	int r , s , t;
	 	while(r2>0){

	 		int q = r1/r2;

	 		r = r1 - q*r2;
	 		r1 = r2;
	 		r2 = r;

	 		s = s1 - q*s2;
	 		s1 = s2;
	 		s2 = s;

	 		t = t1 - q*t2;
	 		t1 = t2;
	 		t2 = t;
	 		}

	 	System.out.println("The GCD is = "+r1+" and the value of s and t is "+s1+ " and "+t1);

	 	int c= s1*a + s2*b;

	 	//verify
	 	System.out.println("LHS="+r1);
	 	System.out.println("RHS="+c);

	 	if (r1 == c) {
	 		System.out.println("LHS = RHS, hence Verified");
	 		
	 	}
	 	else{
	 		System.out.println("LHS != RHS");
	 	}


	 }
}