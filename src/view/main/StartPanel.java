package view.main;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel {

	private JLabel glamazoneLogo;
	private JLabel zeitDatumAnzeige;
	private JButton btnStartShopping;
	private JButton btnRegestrieren;

	public JLabel getGlamazoneLogo() {
		return glamazoneLogo;
	}

	public void setGlamazoneLogo(JLabel glamazoneLogo) {
		this.glamazoneLogo = glamazoneLogo;
	}

	public JLabel getZeitDatumAnzeige() {
		return zeitDatumAnzeige;
	}

	public void setZeitDatumAnzeige(JLabel zeitDatumAnzeige) {
		this.zeitDatumAnzeige = zeitDatumAnzeige;
	}

	public JButton getBtnStartShopping() {
		return btnStartShopping;
	}

	public void setBtnStartShopping(JButton btnStartShopping) {
		this.btnStartShopping = btnStartShopping;
	}

	
	
	
	public JButton getBtnRegestrieren() {
		return btnRegestrieren;
	}

	public void setBtnRegestrieren(JButton btnRegestrieren) {
		this.btnRegestrieren = btnRegestrieren;
	}

	public StartPanel() {
		super.setLayout(null);
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.WHITE);

		// Logo
		this.setGlamazoneLogo(new JLabel());
		ImageIcon icon = new ImageIcon(StartPanel.class.getResource("/Glamazone.png"));
		ImageIcon scaledIcon = new ImageIcon(icon.getImage().getScaledInstance(300, 200, 0));
		this.getGlamazoneLogo().setIcon(scaledIcon);
		this.getGlamazoneLogo().setBounds(350, 0, 300, 100);
		super.add(this.getGlamazoneLogo());

		// zeitDatumAnzeige
		String dateStr = String.format("%1$te. %1$tB %1$tY", new Date());
		this.setZeitDatumAnzeige(new JLabel(dateStr));
		this.getZeitDatumAnzeige().setBounds(450, 300, 300, 25);
		super.add(this.getZeitDatumAnzeige());

		//Button Start Shopping
		this.setBtnStartShopping(new JButton("Shoppen!"));
		this.getBtnStartShopping().setBounds(450, 600, 125, 35);
		super.add(this.getBtnStartShopping());
		
		//Button Regestrieren
		this.setBtnRegestrieren(new JButton("Regestrieren"));
		this.getBtnRegestrieren().setBounds(600, 600, 125, 35);
		super.add(this.getBtnRegestrieren());
		
		
	}

	public void addActionListenerToBtnStartShopping(ActionListener al) {
		this.getBtnStartShopping().addActionListener(al);
		
	}
	
	
}
