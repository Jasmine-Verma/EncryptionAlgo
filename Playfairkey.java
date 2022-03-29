import java.util.Scanner;
import java.util.*;
public class Playfairkey{
	public static void main(String args[]){
	 	Scanner inp = new Scanner(System.in);
	 	System.out.println("Input the key: ");
	 	String in = inp.nextLine();
	 	String add = "abcdefghijklmnopqrst";

	 	String a = in.concat(add);
	 	
        char ch[] = a.toCharArray();

        for (int i=0; i<ch.length; i++){
        	if(ch[i] == 'i'){
        		ch[i] = 'j';
        	}
        	else if(ch[i] == 'I'){
        		ch[i] = 'j';
        	}
        	else
        		continue;        	          
        }        
        int index = 0;
        for (int i=0; i<ch.length; i++){       
        int j;
        	for ( j = 0; j <ch.length; j++)    
            {   
                if (ch[i] == ch[j]){   
                
                    break;   
                }               
                
            }  if(j==i){
            	ch[index] = ch[i];
            	index++;
            } 
        } 	

	 	char key[][] = new char[5][5];
	 	int c = 0;
	 	for (int i=0; i<5; i++){
	 		for (int j = 0; j < 5; j++){
	 			if(c == ch.length){
	 				break;
	 			}
	 			key[i][j] = ch[c];
	 			c++;
	 			
	 		}
	 	}

	 	System.out.println("The given key :");

    	for(int i=0; i<5; i++){
    		for(int j=0; j<5; j++){
    			System.out.print(key[i][j]+" | ");
    			
    		}System.out.println("\n");
    	} 	
	 	
	 }
}