package view.main;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	
	private CardPanel cardPanel;
	private HeaderPanel headerPanel;
	
	
	
	

	public CardPanel getCardPanel() {
		return cardPanel;
	}



	public void setCardPanel(CardPanel cardPanel) {
		this.cardPanel = cardPanel;
	}


	
	

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}



	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}



	public MainPanel() {
		super.setLayout(null);
		super.setBounds(0, 0, 1024, 768);
		super.setBackground(Color.GREEN);
		
		this.setCardPanel(new CardPanel());
		super.add(getCardPanel());
		
		this.setHeaderPanel(new HeaderPanel());
		super.add(getHeaderPanel());
		
		
		
	}
	
	
}
