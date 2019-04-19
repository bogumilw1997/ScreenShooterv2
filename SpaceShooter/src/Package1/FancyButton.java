package Package1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FancyButton extends JButton {

	public FancyButton(String arg0) {
		super(arg0);
		this.setFont(new Font("Monospaced", Font.ITALIC, 60));
		this.setForeground(Color.WHITE);
		this.setBackground(Color.BLUE);
		this.setOpaque(true);
		this.setContentAreaFilled(true);
		this.setBorderPainted(false);			
		this.setFocusable(false);
		this.addMouseListener(new MouseAdapter() {
			
			public void mouseEntered(MouseEvent e) {
				setBackground(Color.WHITE);
				setForeground(Color.BLUE);
			}
			public void mouseExited(MouseEvent e) {
				setBackground(Color.BLUE);
				setForeground(Color.WHITE);
			}
		});
	}
	
	public void setALvis(JFrame FR) {
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				FR.setVisible(true);
			}
		});
	}
}
