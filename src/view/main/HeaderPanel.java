package view.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class HeaderPanel extends JPanel {

	private JLabel logo;
	private JTextField suche;
	private JButton btnSuchen;
	private JButton btnStartseite;
	private JButton btnWarenkorb;
	private JButton btnKasse;
	private JLabel tagDatumZeit;
	

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JTextField getSuche() {
		return suche;
	}

	public void setSuche(JTextField suche) {
		this.suche = suche;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public void setBtnSuchen(JButton btnSuchen) {
		this.btnSuchen = btnSuchen;
	}

	public JButton getBtnStartseite() {
		return btnStartseite;
	}

	public void setBtnStartseite(JButton btnStartseite) {
		this.btnStartseite = btnStartseite;
	}

	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}

	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
	}

	public JButton getBtnKasse() {
		return btnKasse;
	}

	public void setBtnKasse(JButton btnKasse) {
		this.btnKasse = btnKasse;
	}

	public JLabel getTagDatumZeit() {
		return tagDatumZeit;
	}

	public void setTagDatumZeit(JLabel tagDatumZeit) {
		this.tagDatumZeit = tagDatumZeit;
	}

	public HeaderPanel() {

		// Panel
		super.setBounds(0, 0, 1024, 150);
		super.setLayout(null);// Warum noch mal Null?
		super.setBackground(Color.BLACK);
		// Logo
		this.setLogo(new JLabel());
		ImageIcon glamazoneIcon = new ImageIcon(StartPanel.class.getResource("/Glamazone.png"));
		ImageIcon glamazoneScaledIcon = new ImageIcon(glamazoneIcon.getImage().getScaledInstance(200, 200, 0));
		this.getLogo().setIcon(glamazoneScaledIcon);
		this.getLogo().setBounds(0, 0, 100, 100);
		super.add(this.getLogo());

//		this.setBtnStartseite(new JButton("StartSeite"));
//		 this.getBtnStartseite().setBounds(5,200,75,20);
//		 this.add(this.getBtnStartseite());

		// Button StartSeite

		try {
			BufferedImage img = ImageIO.read(new File("./ressources/HomeBtn.png"));
			this.setBtnStartseite(new JButton(new ImageIcon(img)));
			super.add(this.getBtnStartseite());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		this.getBtnStartseite().setActionCommand("home");
		this.getBtnStartseite().setBounds(50, 100, 25, 20);
		// Suchleiste
		this.setSuche(new JTextField());
		this.getSuche().setBounds(80, 100, 350, 20);
		super.add(this.getSuche());

		// Button Suche
		this.setBtnSuchen(new JButton("Suche"));
		this.getBtnSuchen().setBounds(435, 100, 75, 20); // ( X-Achse , Y-Achse, Länge, Breite)
		super.add(this.getBtnSuchen());
//		System.out.println("Konstruktor Headerpanel: " + this.getBtnStartseite().hashCode());

		// Button WarenKorb
		this.setBtnWarenkorb(new JButton("Warenkorb"));
		this.getBtnWarenkorb().setBounds(515, 100, 100, 20);
		super.add(this.getBtnWarenkorb());

		// Button Kasse
		this.setBtnKasse(new JButton("Kasse"));
		this.getBtnKasse().setBounds(620, 100, 100, 20);
		super.add(this.getBtnKasse());
		
		//Label TagDatumZeit
		//String dateStr = String.format("<html><font color=red>  %ta, %1$te. %1$tb %1$tY - %1$tT </font></html>", System.currentTimeMillis());
		
		//this.setTagDatumZeit(new JLabel(dateStr));
		//this.setTagDatumZeit(new JLabel("Test"));
		//this.getTagDatumZeit().setBounds(775, 100, 200, 20);
		
		JLabel test = new JLabel();
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat abf = new SimpleDateFormat("HH:mm:ss");
				String dateStr = String.format("<html><font color=red>  %ta, %1$te. %1$tb %1$tY - %1$tT </font></html>", System.currentTimeMillis());
				test.setText(dateStr);
			
			}
		});
		 
		timer.start();
		test.setBounds(775,100,200,20);
		add(test);
		
		
		
		//super.add(this.getTagDatumZeit());
		

	}

}
