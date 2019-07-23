package contextofchoice;
import choices.IChoice;

public class Context {
	
	IChoice myC;  //myC is an abbreviation for myChoice
	
	//A Strategy/Algorithm is set here
	
	public void SetChoice(IChoice ic)
	{
		
		myC = ic;
	}
	
	public void ShowChoice(String s1, String s2)
	{
		
		myC.myChoice(s1,s2);
	}

}
