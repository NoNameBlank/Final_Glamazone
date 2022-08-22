package controller;

import java.awt.event.ActionEvent;

import view.main.MainView;

public class MainController {
	
	private MainView mainView;

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
	
	//Main Controller nur für Logik zuständig nicht Design
	public MainController() {
		
		this.setMainView(new MainView());
		this.getMainView().addActionListenerToBtnStartShopping(this::startShopping);
		this.getMainView().getMainPanel().getHeaderPanel().addActionListenerToStartseiteBtn(this::homeBtn);
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(0).addActionListener(this::kat1);
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(1).addActionListener(this::kat2);
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(2).addActionListener(this::kat3);
		
		
		
	}
	
	private void startShopping(ActionEvent e) {
		this.getMainView().showMainPanel();
		System.out.println("ActionListener Zeige MainPanel");
	}
	
	private void homeBtn(ActionEvent e) {
		this.getMainView().removeAll();
		this.getMainView().showMainPanel();
		this.getMainView().revalidate();
		this.getMainView().repaint();
		System.out.println("ActionListener homeBtn");
		
	}
	
	
	
	private void kat1(ActionEvent e) {																					//für was 0?
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat1 ", "Kat1", "Kat1", 0);
		
	}
	
	
	private void kat2(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat2 ", "Kat2", "Kat2", 0);
	}
	
	private void kat3(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat3 ", "Kat3", "Kat3", 0);
	}

}
