package view.shopping;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ShoppingPanel extends JPanel {

	private List<ArtikelPanel> artikelList;
	private JPanel displayPanel;
	private JScrollPane sPane;

	public List<ArtikelPanel> getArtikelList() {
		return artikelList;
	}

	public void setArtikelList(List<ArtikelPanel> artikelList) {
		this.artikelList = artikelList;
	}

	public JPanel getDisplayPanel() {
		return displayPanel;
	}

	public void setDisplayPanel(JPanel displayPanel) {
		this.displayPanel = displayPanel;
	}
	
	

	public JScrollPane getsPane() {
		return sPane;
	}

	public void setsPane(JScrollPane sPane) {
		this.sPane = sPane;
	}

	public ShoppingPanel() {
		super.setLayout(null);
		// Warum eig. auf die Größe wenn sowieso kleiner?
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.pink);
		super.setOpaque(true);
		
		this.setDisplayPanel(new JPanel());
		this.getDisplayPanel().setLayout(new GridLayout(3,3));
		
		//Warum bei ihnen ohne Get/Set gemacht?
		this.setsPane(new JScrollPane());
		this.getsPane().setBounds(0, 0, 1008, 618);
		this.getsPane().setViewportView(this.getDisplayPanel());
		super.add(this.getsPane());
		this.getsPane().getVerticalScrollBar().setUnitIncrement(16);
		
		this.setArtikelList(new ArrayList<>());
		for(int i = 0; i < 5; i++) {
			this.getDisplayPanel().add(new ArtikelPanel());
		}
		
		
		

		super.revalidate();
		super.repaint();

	}

}
