package Package1;

import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class GUI extends JPanel {

	public GUI() {
		WelcomeScreen welcS = new WelcomeScreen();
		welcS.setVisible(true);
		SettingsScreen settS = new SettingsScreen();
		settS.setVisible(false);
		
		settS.setAL(settS.returnB, welcS);
		welcS.setAL(welcS.settingsB, settS);
		
	}

}
