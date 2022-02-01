import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CLKAlertB {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CLKAlertB window = new CLKAlertB();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Alert!");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBounds(46, 28, 348, 106);
		
		Label lblAlert = new Label(composite, SWT.NONE);
		lblAlert.setBackground(SWTResourceManager.getColor(255, 0, 0));
		lblAlert.setAlignment(SWT.CENTER);
		lblAlert.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblAlert.setBounds(10, 10, 328, 86);
		lblAlert.setFont(SWTResourceManager.getFont("BrowalliaUPC", 32, SWT.BOLD));
		lblAlert.setText("It's Time to Alert!!!!!!");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				shell.close();
				
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 17, SWT.NORMAL));
		btnNewButton.setBounds(86, 152, 265, 76);
		btnNewButton.setText("Close");

	}
}
