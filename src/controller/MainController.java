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
		this.getMainView().addActionListenerToStartseiteBtn(this::startShopping);
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(0).addActionListener(this::kat1);
		
		
		
	}
	
	private void startShopping(ActionEvent e) {
		this.getMainView().showMainPanel();
	}
	
	
	
	
	private void kat1(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat1 ", "Kat1", "Kat1", 0);
	}

}
