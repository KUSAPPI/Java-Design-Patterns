package strategy_PolicyPatternDemo;
import java.io.IOException;
import java.util.Scanner;

//Importing Classes from other packages
import contextofchoice.Context;
import choices.FirstChoice;
import choices.IChoice;
import choices.SecondChoice;

class Strategy_PolicyPattern {

	public static void main(String[] args) {
		System.out.println("***Strategy Pattern Demo***");
		Scanner in = new Scanner(System.in); //Input From user is taken here
		IChoice ic = null;
		Context cxt = new Context();
		String input1, input2;
		
		//Looping twice to test two different choices
		try
		{
			for (int i = 1; i <= 2; i++)
			{
				System.out.println("Enter an Integer:");
				input1 = in.nextLine();
				System.out.println("Enter another Integer:");
				input2 = in.nextLine();
				System.out.println("Enter your choice, either 1 or 2");
				System.out.println("Press 1 for Addition, Press 2 for Concatenation");
				String c = in.nextLine();
				
				if (c.equals("1"))
				{
					ic = new FirstChoice(); //Create an object of FirstChoice (Strategy 1) if user input is 1
				}
				
				else
				{
					ic = new SecondChoice(); //Create an object of SecondChoice (Strategy 2) if user input is 2
				}
				
				cxt.SetChoice(ic);
				cxt.ShowChoice(input1, input2);
			}
			
		}
		
		finally
		{
			in.close();
		}
		System.out.println("End of Stategy/Policy Pattern");

	}

}
