import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class HelloWorldSWT {

public static void main (String [] args) {
	//The above SWT example will create a TextBox and display it as “Hello World”.
	//This is the display screen for the SWT
	Display display = new Display (); 
	//Stores the display into the shell variable
	Shell shell = new Shell(display);
	//All application’s GUI are rendered in display.
	Text Character = new Text(shell, SWT.NONE);
	Character.setText("Hello World"); //Sets the text 'HelloWorld' 
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
