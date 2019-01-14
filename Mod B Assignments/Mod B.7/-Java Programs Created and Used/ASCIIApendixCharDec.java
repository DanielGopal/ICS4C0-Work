import java.util.Scanner;

public class ASCIIApendixCharDec {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a password to code.");
		System.out.print("password: ");
		String character = sc.nextLine();
		
		//Convert the string to a character
		char password = character.charAt(0);
		
		int codeOut = 0; //Create a variable to be returned in the method
		
		int c = ChartoDec(password, codeOut); //Stores the method and its contents in a variable
		
		System.out.println("The coded string is: " + c ); //Prints the method's returned decimal
		
		//Repeats the same process above but is the opposite as we are decoding now
		System.out.println("Enter a coded password to decode");
        System.out.print("Code: ");
        int codeIn = sc.nextInt();	
        
        char textOut = 0;
        
        char t = DectoChar(codeIn, textOut);
        
        System.out.println("The Decoded string is: " + t ); //Prints the method's returned character
				
	}
	
	public static int ChartoDec(char password, int codeOut) { //Method to convert a character to decimal
		
		if (password == ' ')
		{
			codeOut = ' ';
		}
	    else if (password == 'A')
		{
			codeOut = 65;
		}
		else if (password == 'B')
		{
			codeOut = 66;
		}
		else if (password == 'C')
		{
			codeOut = 67;
		}
		else if (password == 'D')
		{
			codeOut = 68;
		}
		else if (password == 'a')
		{
			codeOut = 97;
		}
		else if (password == 'b')
		{
			codeOut = 98;
		}
		else if (password == 'c')
		{
			codeOut = 99;
		}
		else if (password == 'd')
		{
			codeOut = 100;
		}
		else if (password == '1')
		{
			codeOut = 49;
		}
		else if (password == '?')
		{
			codeOut = 63;
		}
		else if (password == '$')
		{
			codeOut = 36;
		}
		else if (password == '%')
		{
			codeOut = 37;
		}
		else if (password == '&')
		{
			codeOut = 38;
		}
		return codeOut;
	}
	
	public static char DectoChar(int codeIn, char textOut) { //Method to convert a decimal to a character
		if (codeIn == 32)
		{
			textOut = ' ';
		}
		else if (codeIn == 65)
		{
			textOut = 'A';
		}
		else if (codeIn == 66)
		{
			textOut =  'B';
		}
		else if (codeIn == 67)
		{
			textOut = 'C';
		}
		else if (codeIn == 68)
		{
			textOut = 'D';
		}
		else if (codeIn == 97)
		{
			textOut = 'a';
		}
		else if (codeIn == 98)
		{
			textOut = 'b';
		}
		else if (codeIn == 99)
		{
			textOut = 'c';
		}
		else if (codeIn == 100)
		{
			textOut = 'd';
		}
		else if (codeIn == 49)
		{
			textOut = '1';
		}
		else if (codeIn == 63)
		{
			textOut = '?';
		}
		else if (codeIn == 36)
		{
			textOut = '$';
		}
		else if (codeIn == 37)
		{
			textOut = '%';
		}
		else if (codeIn == 38)
		{
			textOut = '&';
		}
		return textOut;
	

	}
}
	



