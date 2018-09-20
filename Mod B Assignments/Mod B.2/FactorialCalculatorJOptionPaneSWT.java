

// A dialog box that displays a message to the user and allows for inputs within the same window
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class FactorialCalculatorSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Allows for the integer to be used within the JOptionPane dialog box string based input
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		
    	//This will help find the factorial of the inputted number
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        //Converts the integer to a String so that it can be outputted as a text type
    	String NumtoString = Long.toString(fact); 
    	
    	//Prints the factorial/answer in another dialog box
    	JOptionPane.showMessageDialog(null, "The factorial is " + fact);
    	
	}
}