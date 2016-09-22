package loops.controller;

public class LoopsController
{

	public void start()
	{
		System.out.println("loops practice started");
		loopMethod();
	}
	private void loopMethod()
	{
		int numberOfTimes = 0;
		while (numberOfTimes < 20)
		{
			System.out.println("hello");
			numberOfTimes++;
		}
		int cats = 0;
		while (cats < 3)
		{
			System.out.println("meow!");
			cats++;
		}
		for (int dogs = 0; dogs < 20; dogs++)
		{
			System.out.println("bork!");
		}
		for (int cows = 0; cows < 10; cows++)
		{
			System.out.println("moooooooo!!!");
		}
	
	
	}
	
	
	
	

}
 