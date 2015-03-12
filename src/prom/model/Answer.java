package prom.model;

import java.util.*;

import prom.controller.AnswerAppController;

public class Answer
{
	private ArrayList<String> userInputList;
	
	public Answer()
	{
		userInputList = new ArrayList<String>();
		
	}
	
/**	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0)
		{
			for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount--;
				}
			}
		}
		return matchesInput;
	}
**/	
	public String processText(String userText)
	{
		String processedText = "";
		
		if(userText != null)
		{
			
			if(userText.equalsIgnoreCase("hint1"))
			{
				processedText = " The first letter of each of the characters' names including last names.";
			}
			
			else if(userText.equalsIgnoreCase("hint2"))
			{
				processedText = " 6 of the characters are on the Smash Bros. Roster, 4 of the Characters are from Bravely Default.";
			}
			
			else if(userText.equalsIgnoreCase("hint3"))
			{
				processedText = " The characters are couples. They go together. This time it's boys before girls.";
			}
			
			else if(userText.equalsIgnoreCase("TAAORELRLLZMP"))
			{
				processedText = AnswerAppController.getEndMessage();
			}
			
			else
			{
				processedText = " Wrong.";
			}
		}
		
		return processedText;
	}
	
/**	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;
			if(input.contains("TAAORELRLLZMP"))
			{
				hasMyContent = true;
			}
			
		return hasMyContent;
			
	}
**/
}
