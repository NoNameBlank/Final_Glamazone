package view.main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class CardPanel extends JPanel{
	
	private CardLayout cardLayout;

	public CardLayout getCardLayout() {
		return cardLayout;
	}

	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}
	

	public CardPanel() {
		this.setCardLayout(new CardLayout());
		super.setLayout(this.getCardLayout());
		super.setBounds(0, 150, 1008, 580);
		super.setBackground(Color.YELLOW);
		
		
		
		
		
		
	}
	
	
	
}
