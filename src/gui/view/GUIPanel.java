package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.*;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;
	private JButton colorButton;
	
	public GUIPanel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		
		this.textLabel = new JLabel("this is a color apppppppppp");
		this.colorButton = new JButton("Click to change coloooloolooolors");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent mouseClick){changeBackgroundColor();}});
	}
	
	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
}
