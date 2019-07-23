package EngineeringPapers;

public abstract class BasicEngineering {
	
	//papers in the template method
	
	public void papers()
	{
		//common papers 
		Math();
		SoftSkills();
		//Specialized paper
		SpecialPaper();
		
	}
	
	//Non-Abstract methods math(), SoftSkills() are already implemented by Template class
	
	private void Math()
	{
		System.out.println("Mathematics");
		
	}
	
	private void SoftSkills()
	{
		System.out.println("SoftSkills");
		
	}
	
	//Abstract method SpecialPaper() is implemented in derived classes
	public abstract void SpecialPaper();
	
}
