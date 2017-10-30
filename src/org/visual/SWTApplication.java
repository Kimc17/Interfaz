package org.visual;

import org.controlador.GetInfo;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SWTApplication {
	public static void main(String[] args) {
        Display display = new Display();

        Shell shell = new Shell(display);

        // the layout manager handle the layout
        // of the widgets in the container
        shell.setLayout(new FillLayout());

     // Shell can be used as container
        Label label = new Label(shell, SWT.BORDER);
        label.setText("This is a label:");
        label.setToolTipText("This is the tooltip of this label");

        Text text = new Text(shell, SWT.NONE);
        text.setText("This is the text in the text widget");
        text.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
        text.setForeground(display.getSystemColor(SWT.COLOR_WHITE));

        Button button =  new Button(shell, SWT.PUSH);
        // set widgets size to their preferred size
        text.pack();
        label.pack();
        shell.open();
        
        button.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
            	GetInfo informacion= new GetInfo();
            	try {
					informacion.execute();
				} catch (ExecutionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            	
            	
            	
            	
            	
            }
        });
        while (!shell.isDisposed()) {
        	
            if (!display.readAndDispatch()) {
                display.sleep();
            } 
        }
        
        
    	
    
        display.dispose();
    
	

	

}
}
