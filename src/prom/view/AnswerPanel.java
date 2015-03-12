package prom.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import prom.controller.AnswerAppController;

public class AnswerPanel extends JPanel
{
	private AnswerAppController baseController;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JButton submitButton;
	private JTextField answerField;
	private JScrollPane answerPane;
	private JTextArea answerArea;
	
	
	
	public AnswerPanel(AnswerAppController baseController)
	{
		baseLayout = new SpringLayout();
		submitButton = new JButton("Submit");
		
		titleLabel = new JLabel("Welcome!");
		
		
		answerField = new JTextField(25);
		
		
		answerPane = new JScrollPane();
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupScrollPane()
	{
		answerArea.setLineWrap(true);
		answerArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(500,400);
		this.add(titleLabel);
		this.add(submitButton);
		this.add(answerPane);
		this.add(answerField);
		answerArea = new JTextArea(5, 25);
		
		add(answerArea);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 21, SpringLayout.SOUTH, answerField);
		baseLayout.putConstraint(SpringLayout.EAST, answerField, -98, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -197, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, titleLabel, -210, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -13, SpringLayout.NORTH, answerArea);
		baseLayout.putConstraint(SpringLayout.NORTH, answerField, 20, SpringLayout.SOUTH, answerArea);
		baseLayout.putConstraint(SpringLayout.NORTH, answerArea, 83, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, answerArea, 137, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, answerArea, -155, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, answerArea, -116, SpringLayout.EAST, this);
		
		
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userTypedText = answerField.getText();
				String answerResponse = baseController.sendTextToAnswerBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(answerResponse);
				answerField.setText("");
			}
		});
	}
	
	public void displayTextToUser(String input)
	{
		answerArea.append("\n" + " " + input);
	}

}
