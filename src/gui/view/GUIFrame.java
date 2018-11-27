package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("GUILMAO");
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
