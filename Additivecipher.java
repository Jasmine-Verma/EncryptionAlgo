import java.util.Scanner;
public class Additivecipher{
	public static void main(String[] args){

		 String b = "";
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the value of key K");
		int k = scan.nextInt();

		System.out.println("Enter Plain text");
		String plaintext = scan.next();

 
        for (int i=0; i<plaintext.length(); i++){
            if (Character.isUpperCase(plaintext.charAt(i))){
                
                char ch = (char)(((int)plaintext.charAt(i) +
                                  k - 65) % 26 + 65);
                b = b + ch;
            }
            else{
                char ch = (char)(((int)plaintext.charAt(i) +
                                  k - 97) % 26 + 97);
                b = b+ ch;
                
            }
        }
       
        

		System.out.println("Result :" +b);




	}

}