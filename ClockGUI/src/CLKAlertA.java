import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class CLKAlertA {

	protected Shell shell;
	private Text Hour;
	private Text Minute;
	private Text Second;
	public int h = 0;
	public int m = 0;
	public int s = 0;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CLKAlertA window = new CLKAlertA();
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
		shell.setText("Alert");
		//main1 M1 = new main1();
		
		Label lblHour = new Label(shell, SWT.NONE);
		lblHour.setAlignment(SWT.CENTER);
		lblHour.setFont(SWTResourceManager.getFont("AngsanaUPC", 14, SWT.NORMAL));
		lblHour.setBounds(50, 33, 73, 30);
		lblHour.setText("Hour");
		
		Hour = new Text(shell, SWT.BORDER);
		Hour.setBounds(36, 80, 93, 51);
		
		Button btnSubmit = new Button(shell, SWT.NONE);
		btnSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				h = Integer.parseInt(Hour.getText());	
				m = Integer.parseInt(Minute.getText());	
				s = Integer.parseInt(Second.getText());	

				
				M.ah = h;
				M.am = m;
				M.as = s;

				shell.close();
				
			}
		});
		btnSubmit.setFont(SWTResourceManager.getFont("AngsanaUPC", 22, SWT.NORMAL));
		btnSubmit.setBounds(31, 158, 375, 70);
		btnSubmit.setText("Submit Alert Setting");
		
		Minute = new Text(shell, SWT.BORDER);
		Minute.setBounds(176, 80, 93, 51);
		
		Second = new Text(shell, SWT.BORDER);
		Second.setBounds(313, 80, 93, 51);
		
		Label lblMinute = new Label(shell, SWT.NONE);
		lblMinute.setAlignment(SWT.CENTER);
		lblMinute.setText("Minute");
		lblMinute.setFont(SWTResourceManager.getFont("AngsanaUPC", 16, SWT.NORMAL));
		lblMinute.setBounds(176, 33, 93, 30);
		
		Label lblSecond = new Label(shell, SWT.NONE);
		lblSecond.setAlignment(SWT.CENTER);
		lblSecond.setText("Second");
		lblSecond.setFont(SWTResourceManager.getFont("AngsanaUPC", 16, SWT.NORMAL));
		lblSecond.setBounds(306, 33, 110, 30);

	}
}
