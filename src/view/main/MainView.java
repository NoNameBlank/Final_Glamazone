package view.main;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainView extends JFrame {

	private StartPanel startPanel;
	private MainPanel mainPanel;

	public StartPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainpanel) {
		this.mainPanel = mainpanel;
	}

	public MainView() {

		super.setBounds(400, 300, 1024, 768);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// StartPanel wird als ContentPain auf MainPanel gelegt
		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		super.setContentPane(this.getStartPanel());

		this.setMainPanel(new MainPanel());
		// super.setContentPane(this.getMainPanel());

		super.setVisible(true);

	}

	// getStartPanel-
	public void addActionListenerToBtnStartShopping(ActionListener al) {
		this.getStartPanel().addActionListenerToBtnStartShopping(al);

	}

	// get Für den Controoler damit er weiß wo?
	public void addActionListenerToStartseiteBtn(ActionListener al) {
		this.getMainPanel().addActionListenerToStartseiteBtn(al);
	}

	// Methode für den Controller damit er weiß was bei dem Klick passieren Soll.
	public void showMainPanel() {
		this.setContentPane(this.getMainPanel());
	}

}
