package TemplateMethodPatternDemo;
import EngineeringPapers.*;

public class TemplateMethodPattern {

	public static void main(String[] args) {
		
		System.out.println("***Template Method Pattern Demo***\n");
		
		BasicEngineering bs = new ComputerScience();
		System.out.println("Computer Sc Papers:");
		bs.papers();
		System.out.println();
		bs = new Electronics();
		System.out.println("Electronic Papers:");
		bs.papers();

	}

}
