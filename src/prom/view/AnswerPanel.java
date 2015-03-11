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
	private JLabel answerLabel;
	
	
	public AnswerPanel(AnswerAppController baseController)
	{
		baseLayout = new SpringLayout();
		submitButton = new JButton("Submit");
		answerLabel = new JLabel("");
		titleLabel = new JLabel("");
		answerField = new JTextField(25);
		answerArea = new JTextArea(5, 25);
		answerPane = new JScrollPane(answerArea);
		
		
		
		
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
		this.add(answerLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}

}
