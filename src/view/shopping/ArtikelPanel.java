package view.shopping;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EtchedBorder;

public class ArtikelPanel extends JPanel {

	private JLabel lblProductName;
	private JLabel lblProductPicture;
	private JLabel lblProductDescription;
	private JLabel lblPreis;
	private JSpinner spinnerMenge;
	private JButton warenkorb;

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
	}

	public JLabel getLblProductDescription() {
		return lblProductDescription;
	}

	public void setLblProductDescription(JLabel lblProductDescription) {
		this.lblProductDescription = lblProductDescription;
	}

	public JLabel getLblPreis() {
		return lblPreis;
	}

	public void setLblPreis(JLabel lblPreis) {
		this.lblPreis = lblPreis;
	}

	public JSpinner getSpinnerMenge() {
		return spinnerMenge;
	}

	public void setSpinnerMenge(JSpinner spinnerMenge) {
		this.spinnerMenge = spinnerMenge;
	}

	public JButton getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(JButton warenkorb) {
		this.warenkorb = warenkorb;
	}
	
	public ArtikelPanel() {
		//Warum Color via Code?
		super.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(112,128,144), null));
		super.setPreferredSize(new Dimension(250,300));
		super.setLayout(null);
	
	
		this.setLblProductName(new JLabel("Name vom Produkt!!!!"));
		this.getLblProductName().setBackground(Color.ORANGE);
		this.getLblProductName().setBounds(2, 2, 100, 100);
		this.getLblProductName().setOpaque(true);
		super.add(this.getLblProductName());
		
		
	
	
	
	
	}
	//pack(); ?^^
	//Warum noch mal zwei Kontrukturen eine mit Parameter einer ohne?
	public ArtikelPanel(String artikelName) {
		this();
		this.getLblProductName().setText(artikelName);
	}
	
	

}
