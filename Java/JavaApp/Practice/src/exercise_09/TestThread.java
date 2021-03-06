package exercise_09;

public class TestThread {

	public static void main(String[] args) {
		// Runner1 is a common class
		//Runner1 dog = new Runner1("doggy");
		//Runner1 cat = new Runner1("kitty");
		
		// Runner2 is a class inherited Thread
		//Runner2 dog = new Runner2("doggy");
		//Runner2 cat = new Runner2("kitty");
		
		// Runner3 is a class implement Runnable
		//Runner3 dog = new Runner3("doggy");
		//Runner3 cat = new Runner3("kitty");
		
		// Runner4 is a class inherited Thread and use sleep
		Runner4 dog = new Runner4("doggy");
		Runner4 cat = new Runner4("kitty");

		dog.run();
		cat.run();
	}

}
