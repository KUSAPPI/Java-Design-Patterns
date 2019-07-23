package DecoratorPatternDemo;

abstract class Component
{
	
public abstract void doJob();
	
}

class ConcreteComponent extends Component
{
	public void doJob()
	{
		
		System.out.println("I am from Concrete Component - I am closed for modification");
	}

}


abstract class AbstractDecorator extends Component
{
protected Component com;
public void SetTheComponent(Component c)
{

	com = c;
}

public void doJob()
{

	if (com != null)
	{
		
		com.doJob();
	}
}

}

class ConcreteDecoratorEx_1 extends AbstractDecorator
{
	
public void doJob()
{
	
super.doJob();
//More goes here
System.out.println("I am explicitly from Ex_1");
}
}


class ConcreteDecoratorEx_2 extends AbstractDecorator
{
	
public void doJob()
{
	
System.out.println("");
System.out.println("***START Ex-2***");
super.doJob();
//More stuff goes here
System.out.println("EXplictly From DecoratorEx_2");
System.out.println("***END. EX-2");
}
	
}

public class DecoratorPattern {

	public static void main(String[] args) {
		
		System.out.println("***Decorator Pattern Demo");
		ConcreteComponent cc = new ConcreteComponent();
		
		ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
		//Decorating ConcreteComponent Object 'cc' with ConcreteDecoratorEx_1
		cd_1.SetTheComponent(cc);
		cd_1.doJob();
		
		ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
		//Decorator ConcreteComponent object //cc with ConcreteDecoratorEx_1 & //ConcreteDecoratorEx_2
		
		cd_2.SetTheComponent(cd_1); //Adding results from cd_1 now
		cd_2.doJob();

	}

}
