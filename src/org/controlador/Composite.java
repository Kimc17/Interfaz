package org.controlador;

public class Composite extends org.eclipse.swt.widgets.Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Composite(Composite parent, int style) {
		super(parent, style);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
