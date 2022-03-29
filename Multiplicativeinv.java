import java.util.Scanner;
 class Multiplicativeinv {
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);


System.out.print("enter value of a = "); 
int a = sc.nextInt(); 
System.out.print("enter value of b = ");
 int b = sc.nextInt();


int r1 = a; 
int r2 = b; 
int s1 = 1; 
int s2 = 0; 
int t1 = 0; 
int t2 = 1; 
int r, s, t, q;

 

while (r2 > 0) {

    q = r1 / r2; 
    r = r1 - q * r2; 
    r1 = r2;
    r2 = r;

 

    s = s1 - q * s2; 
    s1 = s2;
    s2 = s;

 

    t = t1 - q * t2;
    t1 = t2;
    t2 = t;

 

}

System.out.println("GCD is = " + r1 + " value of s and t is " + s1 + " and " + t1);

System.out.println("verifying: " + r1 + "=" + ((a * s1) + (b * t1))); 
if (r1 == 1) 
{
if (t1 < 0) 
{ 
t1 = a + t1;
 
}
System.out.println("multiplication inverse : " + t1);

} 
else {
System.out.println("multiplication inverse does not exist ");
}

 }
}