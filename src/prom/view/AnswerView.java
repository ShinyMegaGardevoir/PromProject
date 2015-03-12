package prom.view;

import javax.swing.JOptionPane;

import prom.controller.AnswerAppController;

public class AnswerView
{
	private AnswerAppController baseController;
	
	public AnswerView(AnswerAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public void displayInformation(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}

}
