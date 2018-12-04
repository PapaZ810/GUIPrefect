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
		
		this.textLabel = new JLabel("This is a color App"); 
		this.colorButton = new JButton("Click to change colours");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		this.setBackground(new Color(0, 150, 150));
		colorButton.setVerticalAlignment(SwingConstants.BOTTOM);
		colorButton.setBackground(new Color(105, 105, 105));
		textLabel.setBackground(new Color(105, 105, 105));
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, textLabel, 156, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, textLabel, 378, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, colorButton, 335, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, colorButton, -105, SpringLayout.SOUTH, this);
		setLayout(springLayout);
	}
	
	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent mouseClick){changeBackgroundColor();}});//the method changeBackgroundColor called here makes the color change on button press
	}
	
	private void changeBackgroundColor() // this gets a random color and changes the label text
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
}
