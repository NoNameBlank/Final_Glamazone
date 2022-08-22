package view.main;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private CardPanel cardPanel;
	private HeaderPanel headerPanel;
	private MenuPanel menuPanel;

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

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
		
		this.setMenuPanel(new MenuPanel());
		super.add(getMenuPanel());

	}
	
	public void addActionListenerToStartseiteBtn(ActionListener al) {
		this.getHeaderPanel().addActionListenerToStartseiteBtn(al);
	}

}
