class Affincipher
{ 
  static int a = 7; 
  static int b = 2; 

  static String Message(char[] msg) 
  { 
    String cipher = ""; 
    for (int i = 0; i < msg.length; i++) 
    { 
      if (msg[i] != ' ') 
      { 
        cipher = cipher 
            + (char) ((((a * (msg[i] - 'A')) + b) % 26) + 'A'); 
      }
      else 
      { 
        cipher += msg[i]; 
      } 
    } 
    return cipher; 
  } 
  static String Cipher(String cipher) 
  { 
    String msg = ""; 
    int a_inv = 0; 
    int flag = 0; 
    for (int i = 0; i < 26; i++) 
    { 
      flag = (a * i) % 26; 
      if (flag == 1) 
      { 
        a_inv = i; 
      } 
    } 
    for (int i = 0; i < cipher.length(); i++) 
    { 
      if (cipher.charAt(i) != ' ') 
      { 
        msg = msg + (char) (((a_inv * 
            ((cipher.charAt(i) + 'A' - b)) % 26)) + 'A'); 
      } 
      else 
      { 
        msg += cipher.charAt(i); 
      } 
    } 

    return msg; 
  } 
  public static void main(String[] args) 
  { 
    String msg = "HELLO"; 
    String cipherText = Message(msg.toCharArray()); 
    System.out.println("Encrypted Message is : " + cipherText);  
    System.out.println("Decrypted Message is: " + Cipher(cipherText)); 

  } 
}