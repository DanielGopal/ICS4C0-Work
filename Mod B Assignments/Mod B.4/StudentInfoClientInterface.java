import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class StudentInfoClientInterface {
	
//Stores the row titles as strings	
private static String[] titles = {"Last Name:", "First Name:", "Grade:", "Student ID:", "         ", "         " }; 

	public static void main(String[] args) {
		 
		// TODO Auto-generated method stub
		  Display display = new Display();
	        Shell shell = new Shell(display);
	        shell.setLayout(new GridLayout(1, false));
	        shell.setText("StudentInfoClient");
	      	        	        	        	        	        
	        //Creates the Table Structure
	        Table table = new Table(shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
	       	    table.setLinesVisible(true);
	            table.setHeaderVisible(true);
	            
	            //Composite class is a container which is capable of containing other widgets like shell.
                //It draws a border around itself and allows you to set a header for the grouped widgets.
 	            Composite composite = new Composite(shell, SWT.NONE);
		        composite.setLayout(new RowLayout(SWT.HORIZONTAL));
	 
		        //Initialize data for created methods
		       	Columns(table);//Method for table columns
		        TableBoxes(table);//Method for generating table boxes/cells
		        EditButton(composite);//Method for the Edit Button
		        ExitButton(composite);//Method for the Exit Button
	      
	        shell.setSize(500, 500);
            shell.open();
            while (!shell.isDisposed()) 
            {
                if (!display.readAndDispatch())
                    display.sleep();
            }
            display.dispose();
	}
	
	public static void Columns(Table table) {
		 //Counts the number of row titles and outputs a table in relation to the number of rows
        for (int i = 0; i < titles.length; i++) 
        { 
          TableColumn column = new TableColumn(table, SWT.NONE);
          column.setText(titles[i]);
        }
    
        for (int i = 0; i < titles.length; i++) 
        {
          table.getColumn(i).pack();//Generates the cell for each column
        }
		
	}
	
	public static void TableBoxes(Table table) {
		 Button ADD = null; 
		 Button DELETE = null;
		 
		 //Loop that generates blank boxes and the Add/Delete Button into the table
		 for (int i=0; i<8; i++) { // Creates 8 columns within 5 rows
             TableItem item = new TableItem (table, SWT.NONE);
             item.setText (0," "  ); //Blank string/box
             item.setText (1," "  );
             item.setText (2," "  );
             item.setText (3," "  );
             item.setText (4," "  );
             item.setText (5," "  );
             
             //Add Button
             ADD = new Button(table, SWT.TOGGLE);
             ADD.setText("Add");
             ADD.setEnabled(true);
             
             //Allows for other widgets like buttons to be used with the Table item (cell) functions
             TableEditor editor = new TableEditor(table);
             editor.grabHorizontal = editor.grabVertical = true;
             editor.setEditor(ADD, item, 4);
           
             //Delete Button
             DELETE = new Button(table, SWT.TOGGLE);
             DELETE.setText("Delete");
     
             editor = new TableEditor(table);
             editor.grabHorizontal = editor.grabVertical = true;
             editor.setEditor(DELETE, item, 5);
             }
		 
		 //Methods for the Add and Delete Button
		 AddButton(ADD);
		 DeleteButton(DELETE);
		 
		}
	public static void AddButton(Button ADD){
		
	}
	
	public static void DeleteButton(Button DELETE){
		
	}
	
	public static void EditButton(Composite composite) {
		//Edit Button (used to modify records)
        Button EDIT = new Button(composite, SWT.TOGGLE);
        EDIT.setText("Edit");     
	   }
	
	public static void ExitButton(Composite composite) {
		 //Exit Button
        Button EXIT = new Button(composite, SWT.TOGGLE);
        EXIT.setText("Exit");
        
        SelectionListener selectionListener = new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                Button source = (Button) e.getSource();
 
                if (source.getSelection()) //checks if button is selected
                {
                    System.exit(0); //Ends/Closes the Java program
                } 
                
                }
             };
 
        EXIT.addSelectionListener(selectionListener); //Enables the listener when the button is selected
        
    	}
     }
