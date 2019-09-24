import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Ventana  extends JFrame{
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ventana() {
		setTitle("Mi primera ventana");
		setSize(320,240);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void  Main (String args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Ventana();
			}
		});
	}

}
