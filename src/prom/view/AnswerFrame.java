package prom.view;

import prom.controller.AnswerAppController;

public class AnswerFrame
{
	private AnswerPanel appPanel;
	
	public AnswerFrame(AnswerAppController baseController)
	{
		appPanel = new AnswerPanel(baseController);
		setupFrame();
	}
	
	public void setupFrame()
	{
/**		this.setSize(600,500);
		this.setResizable(false);
		this.setContentPane(appPanel);
		this.setVisible(true);
**/
	}

}
