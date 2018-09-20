import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.Scanner;


public class StringSWT {
	//Static allows for the variable to be used in any method created within this class
	static String Word;//Allows for the string to be used outside global variables
	
	static Scanner sc = new Scanner(System.in);//Allows for the Scanner to be used outside global variables

public static void main (String [] args) {
	//Ask the user to type a word
	System.out.println("Please type a word: ");
	Word = sc.nextLine();
	
	//The above SWT example will create a TextBox and display it as “Hello World”.
	//This is the display screen for the SWT
	Display display = new Display (); 
	//Stores the display into the shell variable
	Shell shell = new Shell(display);
	//All application’s GUI are rendered in display.
	Text Character = new Text(shell, SWT.NONE);
	Character.setText(Word); //Stores the word
	Character.pack();
	
	shell.pack();//Tells the SWT application to auto resize the widget (shell windows) to its preferred size, 
	             //It uses only as much space based on resolution and platform rendering
	shell.open ();
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep (); //Display.readAndDispatch()keeps track of user events in applications 
		                                                   //like when closing windows
	}
	display.dispose ();
}
}
