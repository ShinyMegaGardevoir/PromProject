package prom.view;

import javax.swing.JFrame;

import prom.controller.AnswerAppController;

public class AnswerFrame extends JFrame
{
	private AnswerPanel basePanel;
	
	public AnswerFrame(AnswerAppController baseController)
	{
		basePanel = new AnswerPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
		
	
 		this.setContentPane(basePanel);
 		this.setSize(600,500);
		this.setResizable(false);	
		this.setVisible(true);

	}

}
