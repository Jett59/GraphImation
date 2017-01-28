import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Project {

	public static void main(String[] args) {
		JFrame ubencraft = new JFrame();
		
		ubencraft.getContentPane().add(new JPaper());
		ubencraft.pack();
		
		ubencraft.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ubencraft.setVisible(true);
	}

}
