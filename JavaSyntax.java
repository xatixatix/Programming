/* 
THIS DOCUMENT IS MADE BY ATTILA DIÓS BASED ON DEREK BANAS's VIDEO AND SOURCE CODE.
Video: https://www.youtube.com/watch?v=n-xAqcBCws4
Source code: http://www.newthinktank.com/2019/02/learn-java-1-video/
*/

import java.util.*;
import java.util.stream.IntStream;

public class App {
	//#region things for the code below

	static Scanner sc = new Scanner(System.in); //needed for user input
	final double SHORTPI = 3.14159; //This is a constant thats value can't change
	
	public enum Day {Monday,Tuesday,Wednesday};
	
	public static int getSum(int x, int y) {
		return x + y;
	}
 
	// Demonstrate pass by value
	public static void changeMe(int cNum) {
		cNum = 10;
	}
 
	// Receive a variable number of parameters
	public static int getSum2(int ... nums) {
		int sum = 0;
		for(int x: nums) {
			sum += x;
		}
		return sum;
	}
 
	// Return an array with multiple values
	static int[] getNext2(int x) {
		int[] vals = new int[2];
		vals[0] = x + 1;
		vals[1] = x + 2;
		return vals;
	}
 
	// Return a list of different types
	static List<Object> getRandList(){
		String name = "Derek";
		int age = 44;
		return Arrays.asList(name, age);
	}
 
	// Recursive functions call themselves
	static int factorial(int num) {
		// Must have a condition were we don't
		// call for the function to execute
		if(num == 1) {
			return 1;
		} else {
			int result = num * factorial(num - 1);
			return result;
		}
	}
 
	static int getSum3(int[] nums) {
		int sum = 0;
		for(int x: nums) sum += x;
		return sum;
	}
	//#endregion
    public static void main(String[] args) throws Exception {
        //#region output
        System.out.println("Hello, World!"); //Print out Hello World! and add a new line after it
        System.out.print("Write in console and continue on the same line :)");
        //#endregion
        //#region variables
        int var = 100; //creating an int
        int v2,v3,v4; //creating several int at once
        boolean happy = true;
        char a = 'a';
        float fNum = 1.11111F; //precision up to 7
        double dbl = 1.1111111; //precision up to 15
        double thousand = 1e+3; //can use scientific notation
        long bigNum = 123_132_321; //you can separate numbers with _ if you want
        System.out.println("\n" + bigNum); // \n is adding a new line
        //#endregion
        //#region casting = converting 1 datatype into another
        int smInt = 10;
        long smLong = smInt; //no problem converting int to long
        System.out.println(smLong);

        double cDbl = 1.234;
        int cInt = (int) cDbl; //this way you lose all the decimals, because int can't hold decimals
        System.out.println(cInt);

        String favNum = Double.toString(1.618); //you can convert anything to string without problem
        System.out.println(favNum);

        int strInt = Integer.parseInt("10"); //you can parse string to int
        System.out.println(strInt);
        //#endregion
        //#region maths
        //simple math
        System.out.println("5 + 4 = "+(5+4));
		System.out.println("5 - 4 = "+(5-4));
		System.out.println("5 * 4 = "+(5*4));
		System.out.println("5 / 4 = "+(5.0/4)); //you need to use a double in your math if you want to get a double back
		System.out.println("5 % 4 = "+(5%4));
        
        int dif = 0;
        //in most cases it doesn't matter, but it's good to know about as it can cause crazy hard to find bugs in your code:
        System.out.println(dif++); //when the operation is after the variable, it adds it after the output function
        System.out.println(++dif); //when the operation is before the variable, it adds it before the output function

        dif += 10; //add 10 to dif

        //more math functions
		System.out.println("abs(-1) = "+Math.abs(-1)); //absolute value
		System.out.println("ceil(4.25) = "+Math.ceil(4.25)); //round up
		System.out.println("floor(4.25) = "+Math.floor(4.25)); //round down
		System.out.println("round(4.25) = "+Math.round(4.25)); //round by basic rounding rules
		System.out.println("max(4,5) = "+Math.max(4,5)); //find highest value
		System.out.println("min(4,5) = "+Math.min(4,5)); //find minimum value
		System.out.println("exp(1) = "+Math.exp(1));
		System.out.println("log(1) = "+Math.log(1));
		System.out.println("log10(1) = "+Math.log10(1));
		System.out.println("pow(2,2) = "+Math.pow(2,2));
		System.out.println("sqrt(4) = "+Math.sqrt(4));
		System.out.println("cbrt(4) = "+Math.cbrt(4));
		System.out.println("hypot(5,5) = "+Math.hypot(5,5));
		System.out.println("PI = "+Math.PI);
 
		// Trig Functions Radians
		System.out.println("sin(1.5708) = "+Math.sin(1.5708));
		System.out.println("cos(1.5708) = "+Math.cos(1.5708));
		System.out.println("tan(1.5708) = "+Math.tan(1.5708));
		System.out.println("asin(1.5708) = "+Math.asin(1.5708));
		System.out.println("acos(1.5708) = "+Math.acos(1.5708));
		System.out.println("atan(1.5708) = "+Math.atan(1.5708));
		System.out.println("sinh(1.5708) = "+Math.sinh(1.5708));
		System.out.println("cosh(1.5708) = "+Math.cosh(1.5708));
		System.out.println("tanh(1.5708) = "+Math.tanh(1.5708));
		System.out.println("toDegrees(1.5708) = "+Math.toDegrees(1.5708));
		System.out.println("toRadians(90) = "+Math.toRadians(90));

        // Random number between 5 and 20
		int minNum = 5;
		int maxNum = 20;
		int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
		System.out.println("Rand : "+randNum);
        //#endregion
        //#region strings
        String name = "Attila";
		String wName = name + " Diós";
		wName += " is my name";
		String drsDog = "K" + 9;
        System.out.println(wName.charAt(0)); // Get character at index |gives back char|
        System.out.println(wName.contains("Attila")); // Does it contain an Attila |gives back boolean|
        System.out.println((wName.indexOf("Attila"))); // Get index of match |gives back int|
        System.out.println(wName.length()); // Number of characters in the string |gives back int|

        String str1 = "dog";
		System.out.println("dog equals cat : " + (str1.equals("cat"))); //compares if the string are the same USE equalsIgnoreCase if you want to ignore casing
		System.out.println(wName.compareTo("ABC")); //If first string is less than second string lexicographically, it returns negative number and if first string is lexicographically equal to second string, it returns 0.
		System.out.println(wName.replace("Attila", "Bob")); //replaces Attila with Bob within the string
		System.out.println(wName.substring(0,5)); //gets the characters in the given range
		for(String x: wName.split(" ")) System.out.println(x); //Splits the string into a string array and writes it out one by one 
		
        // ---- STRING BUILDER & BUFFER ----
		// If you have to make many string changes
		// a StringBuilder may be better
		// Use a StringBuffer if using threads

		StringBuilder sb = new StringBuilder("I'm a string builder"); // Create StringBuilder
		System.out.println("Stringbuilder's string lengts: " + sb.length()); // Number of characters
		System.out.println("Stringbuilder's current capacity: " + sb.capacity()); // Get size set aside (buffer for more )
		sb.append(" Yeah"); // Append a primitive or string
		System.out.println(sb.insert(6, "Big ")); // Insert at index
		System.out.println(sb.replace(6, 9, "wig")); // Replace at indexes
		System.out.println(sb.substring(6,10)); // Extract substring
		System.out.println(sb.delete(6, 10)); // Delete characters at indexes
		System.out.println(sb.charAt((4))); // Get char at index
		System.out.println(sb.indexOf("Yeah")); // Get index for string
        //#endregion
        //#region arrays

		int[] a1 = new int[10]; // Create an array that can hold 10 values
		a1[0] = 1; // Assign a value to the first index (address)
		Arrays.fill(a1,2); // Fill array with a value
		System.out.println(a1[0]); // Get value
		System.out.println(a1.length); // Get size
		String[] a2 = {"one","two"}; // Create and add values at the same time

		int[] oneTo10 = IntStream.rangeClosed(1, 10).toArray(); // Generate an array from 1 to 10
		for(int x: oneTo10) System.out.println(x); // The enhanced for loop
		System.out.println(Arrays.binarySearch(oneTo10, 9)); // Find value
 
		int a3[][] = new int[2][2]; // Multidimensional array
 
		// Create and initialize
		// a4[How many down][How many across]
		String[][] a4 = {{"00", "10"},
				{"01", "11"}};
 
		System.out.println(a4[1][1]);
 
		// a5[How many down][How many across][How many Groups]
		// a5[3][4][1]
		String a5[][][] = {{{"000"}, {"100"}, {"200"}, {"300"}},
				{{"010"}, {"110"}, {"210"}, {"310"}},
				{{"020"}, {"120"}, {"220"}, {"320"}}};
		System.out.println(a5[2][3][0]);
 
		// Copy array into another
		int a6[] = {1,2,3};
		int a7[] = Arrays.copyOf(a6, 3);

		System.out.println(Arrays.equals(a6, a7)); // Compare arrays
 
		// Sort array
		int a8[] = {3,2,1};
		Arrays.sort(a8);
		System.out.println(Arrays.toString(a8));
        //#endregion
		//#region Lists
		
		// ---- ARRAYLIST ----
		// ArrayLists resize and provide for easy
		// insertion and deletion

		ArrayList<String> aL1 = new ArrayList<String>(20); // Create a String ArrayList with 20 spaces
		aL1.add("Sue"); // Add value
 
		// Generate an ArrayList
		ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1,2,3,4));
		for(Integer x: aL2) System.out.println(x);

		System.out.println(aL2.get(1)); // Get a value
		aL2.set(1, 5); // Add a value at index
		aL2.remove(3); // Delete value (Delete all aL2.clear())
 
		// Iterators are used to cycles through collections like ArrayLists
		Iterator it = aL2.iterator();
 
		// Loop while more values exist
		while(it.hasNext()) {
			System.out.println(it.next()); // Output each value
		}
 
		// ---- LINKEDLIST ----
		// Best when you have to make changes in the middle of the list
		// Each link has a reference to the value before and the value after

		LinkedList<Integer> lL1 = new LinkedList<Integer>();
 
		lL1.add(1); lL1.add(2); lL1.add(3); // Add value
		lL1.addAll(Arrays.asList(1,2,3,4)); // Add array to list
		lL1.addFirst(0); // Add to front (addLast Also)
		System.out.println(lL1.contains(4)); // Check if in list
		System.out.println(lL1.indexOf(4)); // Get index for match
		lL1.set(0, 2); // Replace
		System.out.println(lL1.get(0)); // Get value
		lL1.remove(1); // Delete (clear() removes all)
		System.out.println(lL1.size()); // Get size
		Object[] a9 = lL1.toArray(); // Convert to array
		//#endregion
		//#region user input
		
		// ---- USER INPUT ----
		// The Scanner object receives user input using nextShort, nextByte, nextBoolean,
		// nextInt, nextFloat, nextDouble, nextLong, nextLine

		System.out.print("Enter name: ");
 
		// Did the user enter a string
		// Use hasNextDataType to check if a valid type was entered
		if(sc.hasNextLine()){
			String userName = sc.nextLine();
			System.out.println("Hello "+userName);
		}
 
		// Get input using a dialog box
		//String jopName =
		//		JOptionPane.showInputDialog("Enter Name");
		//System.out.println("Hello "+jopName);
		//#endregion
		//#region conditionals /operators/

		// ---- CONDITIONALS ----
		// Relational Operators : == != > < >= <=
		// Logical Operators : ! && ||

		int age = 12;
		if ((age >= 5) && (age <= 6)){
			System.out.println("Go to Kindergarten");
		} else if ((age >= 7) && (age <= 13)){
			System.out.println("Go to Middle School");
		} else if ((age >= 14) && (age <= 18)){
			System.out.println("Go to High School");
		} else {
			System.out.println("Stay Home");
		}
 
		System.out.println("true || false = "+(true || false));
		System.out.println("!true = "+(!true));
 
		// The ternary operator returns the 1st value
		// when the condition is true and the 2nd otherwise
		boolean canVote = (age >= 18) ? true : false;
		System.out.println("Can Vote : "+canVote);
 
		// Switch is used when you have limited options
		String lang = "France";
		switch(lang) {
		case "Chile": case "Cuba":
			System.out.println("Hola");
 
			// Without break the next condition is checked
			break;
		case "France":
			System.out.println("Bonjour");
			break;
		case "Japan":
			System.out.println("Konnichiwa");
			break;
		default:
			System.out.println("Hello");
		}
		//#endregion
		//#region loops

		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
 
		// while loops as long as a condition is true
		int wI = 0;
		while (wI < 20) {
			// Only print even numbers
			if(wI % 2 == 0) {
				System.out.println(wI);
				wI++;
				// Jump back to the beginning of loop
				continue;
			}
			if(wI >= 10) {
				// Stop looping
				break;
			}
			wI++;
		}
 
		// Do whiles execute at least once
		int secretNum = 7;
		int guess = 0;
		do {
			System.out.println("Guess : ");
			if(sc.hasNextInt()){
				guess = sc.nextInt();
			}
		}while(secretNum != guess);
		System.out.println("You guessed it");
		//#endregion
		//#region methods
		// ---- METHODS ----
		System.out.println("5 + 4 = " + getSum(5,4));
 
		// All data passed to a function is pass by
		// value so changes in the method have no
		// effect outside of the function
		int cNum = 0;
		changeMe(cNum);
		System.out.println("cNum = " + cNum);
 
		// You can pass a variable number of values
		// to a method
		System.out.println("1+2+3 = " + getSum2(1,2,3));
 
		// You can receive multiple values with an array
		int[] multVA = getNext2(5);
		// 1 line for loop
		for(int x: multVA) System.out.println(x);
 
		// Receive multiple values of different types
		List<Object> randList = getRandList();
		System.out.println(randList);
 
		// Demonstrate recursion (functions calling
		// themselves)
		System.out.println("Fact 4 = " + factorial(4));
 
		// Pass array to method
		int[] nums = {1,2,3};
		System.out.println("Sum = " + getSum3(nums));
		//#endregion
		//#region exceptions and enum

		// ---- EXCEPTION HANDLING ----
		// Used to catch errors that could crash our program
 
		// Surround problem code with a try block
		try {
			// int badInt = 10 / 0;
 
			// You can create your own exception
			// classes or just throw one without
			throw new Exception("Bad Stuff");
		}

		// Catch division by 0
		catch(ArithmeticException ex) {
			System.out.println("Can't divide by zero");
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
		}

		// Catch any exception
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

		// Executed whether exception occurred or not
		// Used to close files, DBs and other clean up
		finally {
			System.out.println("Clean Up");
		}
 
		// ---- ENUMERATED TYPES ----
		Day favDay = Day.Monday;
		System.out.println("Fav day is "+favDay);
		//#endregion
    }
}
