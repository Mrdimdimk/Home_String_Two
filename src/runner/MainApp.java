package runner;

import java.util.Scanner;

public class MainApp {

		public static void main(String[] args) {
	       
	        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";  //Stroka with alphabet (Russian)
	        //String alphabet =("abcdefghijklmnopqrstuvwxyz");  // Stroka with alphabet (English)
	        

	        String str1 = "";    // Create empty String str1 
	        System.out.println("Введите текст");
	        Scanner sc1 = new Scanner(System.in);  // Create new Scanner  for reading  text  witch you print  on keyboard
	        str1 = sc1.nextLine();  // = str1 
	        
	                
	                char[] charArray = str1.toCharArray();  // Convert Array of Strings  to Array of Chars
	        
	             
	        for(int i = 0; i < str1.length(); i++){  // loop for printing  Text  str1  with " " after every symbol
	            System.out.print(charArray[i] + "  ");//
	        }
	        System.out.println("");///
	        
	                
	        for (char x : charArray){  // loop for printing number of position  alphabet
	                        
	            if(x == ' '){  // ignor  symbol " " in  text
	                System.out.print("");
	            } else {
	            int i = alphabet.lastIndexOf(x);  
	            i++;
	            System.out.print(i + "  ");
	   } 
	   }
	  } 

	

	}


