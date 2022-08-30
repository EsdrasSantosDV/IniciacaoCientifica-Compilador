
package swingExamples;

import java.awt.Component;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public final class NonModalDialogs {
	// Pra todas as Instancias
	private static final ExecutorService POOL = Executors.newCachedThreadPool();

	public static void showNonModalMessageDialog(Component parentComponent,
			Object message) {
		showNonModalMessageDialog(parentComponent, message, "Message",
				JOptionPane.INFORMATION_MESSAGE);
	}
        
        public static void showNonModalMessageDialog(Component parentComponent,
			Object message, String title, int messageType) {
		JOptionPane pane = createJOptionPane(message, messageType);
		JDialog dialog = pane.createDialog(parentComponent, title);
		dialog.pack();
		dialog.setModal(false);

		dialog.setVisible(true);
	}
        
      
	private static JOptionPane createJOptionPane(Object message, int messageType) {
		return new JOptionPane(message, messageType);
	}

	
	private static JOptionPane createJOptionPane(Object message,
			int messageType, int optionType) {
		return new JOptionPane(message, messageType, optionType);
	}

  

	
	private static class DialogLauncher implements Runnable {
		private final JOptionPane jOptionPane;
		private final String title;

		private DialogLauncher(JOptionPane jOptionPane, String title) {
			this.jOptionPane = jOptionPane;
			this.title = title;
		}

		public void run() {
			JDialog dialog = jOptionPane.createDialog(null, title);
			jOptionPane.selectInitialValue();
			dialog.setModal(false);
			dialog.setVisible(true);
		}
	}

	

	
}