package prom.controller;

import prom.model.Answer;
import prom.view.AnswerFrame;
import prom.view.AnswerPanel;

public class AnswerAppController
{
	private String startMessage;
	private Answer notSoCleverBot;
	private static String endMessage;
	private AnswerFrame answerFrame;
	
	public AnswerAppController()
	{
//		notSoCleverBot = new Answer("Response");
		startMessage = "Welcome, Tyler. If you want your answer to prom, "
				+ "you're going to have to work for it. I hid various cards of characters around"
				+ "your house. There are 10 in all. After you find them all, input the code and you'll have "
				+ "your answer.";
		setEndMessage("Congrats! You found all the cards and you figured out the code! Wasn't that fun?"
					+ "Oh, and as for the answer... Of course I'd go with you, silly!"
					+ "I just hope you didn't look at the code for this program to get your answer. :3");
		
		answerFrame = new AnswerFrame(this);
	}
	
	public Answer getNotSoCleverBot()
	{
		return notSoCleverBot;
	}
	
	private void quit()
	{
		System.exit(0);
	}

	public String sendTextToAnswerBot(String userInput)
	{
		String respondText = "";
		respondText = notSoCleverBot.processText(userInput);
		return respondText;
		
	}
	
	
	
	
	
	
	
	
	public void start()
	{
		
		
		AnswerPanel myAppPanel = (AnswerPanel) answerFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
	}

	public static String getEndMessage()
	{
		return endMessage;
	}

	public void setEndMessage(String endMessage)
	{
		AnswerAppController.endMessage = endMessage;
	}
	
	
}
