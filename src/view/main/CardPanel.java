package view.main;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import view.shopping.ShoppingPanel;

public class CardPanel extends JPanel{
	
	//Layout von CardPanel
	private CardLayout cardLayout;
	
	private ShoppingPanel shoppingPanel;
	
	

	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}

	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}

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
		super.setBackground(Color.BLUE);
		
		this.setShoppingPanel(new ShoppingPanel());
		
		super.add(this.getShoppingPanel());
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
