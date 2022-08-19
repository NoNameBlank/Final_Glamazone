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
		
		
		
	}
	
	private void startShopping(ActionEvent e) {
		this.getMainView().showMainPanel();
	}
	

}
