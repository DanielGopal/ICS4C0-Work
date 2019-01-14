// A simple program that represents all the 26 upper case letters of the alphabet. 
//For example, if a user enters 'A' that would be outputted back as 1 cause A is the first letter of the alphabet.
import java.util.Scanner;

public class AlphabetsLettersToNumbers {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a password to code.");
		System.out.print("password: ");
		String character = sc.nextLine();
		
		//Converts the string to a character
		char password = character.charAt(0);
		
		int codeOut = 0; //Create a variable to be returned in the method
		
		int c = LettertoNum(password, codeOut); //Stores the method and its contents in a variable
		
		System.out.println("The coded string is: " + c ); //Prints the method's returned decimal
		
		//Repeats the same process above but is the opposite as we are decoding now
		System.out.println("Enter a coded password to decode");
                System.out.print("Code: ");
                int codeIn = sc.nextInt();	
         
                char textOut = 0;
         
                char t = NumtoLetter(codeIn, textOut);
        
                System.out.println("The Decoded string is: " + t ); //Prints the method's returned character
	  			
	}
	
	public static int LettertoNum(char password, int codeOut) { //Method to convert the letter to its number in the alphabet
		if (password == 'A')
		{
			codeOut = 1; 
		}
		else if (password == 'B')
		{
			codeOut = 2;
		}
		else if (password == 'C')
		{
			codeOut = 3;
		}
		else if (password == 'D')
		{
			codeOut = 4;
		}
		else if (password == 'E')
		{
			codeOut = 5;
		}
		else if (password == 'F')
		{
			codeOut = 6;
		}
		else if (password == 'G')
		{
			codeOut = 7;
		}
		else if (password == 'H')
		{
			codeOut = 8;
		}
		else if (password == 'I')
		{
			codeOut = 9;
		}
		else if (password == 'J')
		{
			codeOut = 10;
		}
		else if (password == 'K')
		{
			codeOut = 11;
		}
		else if (password == 'L')
		{
			codeOut = 12;
		}
		else if (password == 'M')
		{
			codeOut = 13;
		}
		else if (password == 'N')
		{
			codeOut = 14;
		}
		else if (password == 'O')
		{
			codeOut = 15;
		}
		else if (password == 'P')
		{
			codeOut = 16;
		}
		else if (password == 'Q')
		{
			codeOut = 17;
		}
		else if (password == 'R')
		{
			codeOut = 18;
		}
		else if (password == 'S')
		{
			codeOut = 19;
		}
		else if (password == 'T')
		{
			codeOut = 20;
		}
		else if (password == 'U')
		{
			codeOut = 21;
		}
		else if (password == 'V')
		{
			codeOut = 22;
		}
		else if (password == 'W')
		{
			codeOut = 23;
		}
		else if (password == 'X')
		{
			codeOut = 24;
		}
		else if (password == 'Y')
		{
			codeOut = 25;
		}
		else if (password == 'Z')
		{
			codeOut = 26;
		}
		return codeOut;
	}
	
	public static char NumtoLetter(int codeIn, char textOut) { //Method to convert the number to its letter in the alphabet
		if (codeIn == 1)
		{
			textOut = 'A';
		}
		else if (codeIn == 2)
		{
			textOut =  'B';
		}
		else if (codeIn == 3)
		{
			textOut = 'C';
		}
		else if (codeIn == 4)
		{
			textOut = 'D';
		}
		else if (codeIn == 5)
		{
			textOut = 'E';
		}
		else if (codeIn == 6)
		{
			textOut = 'F';
		}
		else if (codeIn == 7)
		{
			textOut = 'G';
		}
		else if (codeIn == 8)
		{
			textOut = 'H';
		}
		else if (codeIn == 9)
		{
			textOut = 'I';
		}
		else if (codeIn == 10)
		{
			textOut = 'J';
		}
		else if (codeIn == 11)
		{
			textOut = 'K';
		}
		else if (codeIn == 12)
		{
			textOut = 'L';
		}
		else if (codeIn == 13)
		{
			textOut = 'M';
		}
		else if (codeIn == 14)
		{
			textOut = 'N';
		}
		else if (codeIn == 15)
		{
			textOut = 'O';
		}
		else if (codeIn == 16)
		{
			textOut = 'P';
		}
		else if (codeIn == 17)
		{
			textOut = 'Q';
		}
		else if (codeIn == 18)
		{
			textOut = 'R';
		}
		else if (codeIn == 19)
		{
			textOut = 'S';
		}
		else if (codeIn == 20)
		{
			textOut = 'T';
		}
		else if (codeIn == 21)
		{
			textOut = 'U';
		}
		else if (codeIn == 22)
		{
			textOut = 'V';
		}
		else if (codeIn == 23)
		{
			textOut = 'W';
		}
		else if (codeIn == 24)
		{
			textOut = 'X';
		}
		else if (codeIn == 25)
		{
			textOut = 'Y';
		}
		else if (codeIn == 26)
		{
			textOut = 'Z';
		}
		return textOut;
	

	       }
         }
	



