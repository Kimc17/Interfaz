package org.controlador;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class FillLayoutSWT {
	public static void main(String[] args) {
        Display display = new Display();
     
        Shell shell = new Shell(display);
        shell.computeSize(2900, 2500);

        // create a new GridLayout with two columns
        // of different size
        FillLayout layout = new FillLayout();
        
       
        

        // set the layout to the shell
        shell.setLayout(layout);
        Label label = new Label(shell, SWT.NONE);
        label.setText("Plugin DF");
        
        List lista= new List(shell, 2);
        lista.computeSize(400, 300);
        
        final Tree tree = new Tree(shell, SWT.V_SCROLL);
        	tree.computeSize(800, 600);
        	tree.setBackgroundMode(65);
        	TreeItem item = new TreeItem(tree, SWT.NONE);
        	item.setText(String.valueOf("Métodos"));
        	for (int j = 0; j < 3; j++) {
                TreeItem subItem = new TreeItem(item, SWT.NONE);
                subItem.setText(String.valueOf(j));
            
        }

        // create a label and a button
        
        Button button = new Button(shell, SWT.PUSH);
        button.setText("Actualizar");

     
        

        // create a new label which is used as a separator
        label = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);

 
        // create a right aligned button
        Button b = new Button(shell, SWT.PUSH);
        b.setText("Step into");
        
        Button c= new Button(shell, SWT.PUSH);
        c.setText("Step over");

        
        
     

        Group group = new Group(shell, SWT.NONE);
        group.setText("This is my group");
        
        group.setLayout(new RowLayout(SWT.VERTICAL));



        shell.pack();
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }


}
