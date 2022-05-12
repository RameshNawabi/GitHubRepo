package gitPackage2;

public class GitTest {

	public static void main(String[] args) {

		int a = 20;
		int b = 10;
		
		System.out.println(a-b);
		// this is the changes form remote repository
		
		String r = "Ramesh";
		System.out.println(r);
		
		StringBuilder builder = new StringBuilder(r);
		System.out.println(builder.reverse());
		
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println("This has been concat using concat method " + firstName.concat (lastName));
		String fullName = lastName.concat(firstName);
		System.out.println(fullName);
		
		System.out.println(fullName.indexOf("e"));
		System.out.println(fullName.indexOf("J")); // java is case sensitive even if we are finding index of character using indexOf method
		
		
		int x = 16;
		System.out.println(Math.sqrt(x)); // this is square root method to find the 1/4 of a number.
		System.out.println(x);
		
		System.out.println(Math.random()); // this is the method that we can return a random number between 0 (inclusive), and 1 (exclusive) the result going to be 0.3370390035010469
		
		
		// fill in the missing parts to print the value true
		int x1 = 10;
		int y1 = 9;
		System.out.println(x1>y1);
		
		// print "Hello World" if x is greater than y.
		
		int x2 = 50;
		int y2 = 10;
		if (x2>y2) {
			System.out.println("Hello World");
		}
		
		
		// write a short hand if ... else statement using (ternary operator)
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		String result2 = (time > 18) ? "Morning" : "Afternoon";
		System.out.println(result2);
		
		// Print i as long as i is less than 6.
		int i = 1;
		while (i < 6) {
			System.out.println(i);
			i++;
		}
		//  same example using do/while loop
		
		do {
			System.out.println(i);
			i++;
		}
		while (i < 6);
		
		// loop through the items in the cars array.
		
		String [] cars = {"Volvo", "BMW", "Ford"};
		for (String j : cars){
			System.out.println(j);
		}
		
		// print the second item in cars array
		
		String [] cars1 = {"Volvo", "BMW", "Ford"};
		System.out.println(cars[2]);
		
		// Change the value from "Volvo" to "Opel" in the cars array
		
		String [] cars3 = {"Volvo", "BMW", "Ford"};
		cars[0] = "Opel";
		System.out.println(cars[0]);
		
		// find out how many elements the cars array have?
		String [] cars4 = {"Volvo", "BMW", "Ford"};
		System.out.println(cars.length);
	}

}
