/***********************************************************************
 * AUTHOR:	Nery Chapeton-Lamas
 * COURSE:	CS 111 (Intro to CS I: Java)
 * HW #:	9
 * PROJECT:	3
 * LASTMOD:	10/08/2015
 * *********************************************************************/

/***********************************************************************
 * TITLE: Temperature Class Tester
 * *********************************************************************
 * PROGRAM DESCRIPTION: Test all methods and possibilities for Temperature
 * *********************************************************************
 * OBJECTIVES:
 * - Test toString() right after instantiation + after changes
 *   - Shows default value at start, and value after many changes
 * - Test setValue() with negative, postive, and zero values
 * - Test setScale() with C and F, upper and lower case
 *   - Also test with non-C or -F char, which should treat as C
 * - Test setAll(), use some of test cases above
 * - Test getCelsius()/getFahrenheit() with same scale objects
 *   - Should be same values as when set above
 * - Test getCelsius()/getFahrenheit() with opposite scale objects
 *   - Should convert correctly into opposite scale:
 * *********************************************************************/

public class TemperatureTester
{
	public static void main(String[] args)
	{
		Temperature temp1, temp2, temp3, temp4, temp5;

		temp1 = new Temperature();
		temp2 = new Temperature();
		temp3 = new Temperature();
		temp4 = new Temperature();
		temp5 = new Temperature();

		System.out.println("START OF ALL OBJECTS, should all be 0's with (blank) scale! Know why?");
		System.out.println( "Temp #1: " + temp1 );//testing toString(), 
		System.out.println( "Temp #2: " + temp2 );//it's called automatically on objects in println()!
		System.out.println( "Temp #3: " + temp3 );
		System.out.println( "Temp #4: " + temp4 );
		System.out.println( "Temp #5: " + temp5 );

		temp1.setValue(0.0);
		temp2.setValue(-40.0);
		temp3.setValue(212.0);

		temp1.setScale('C');
		temp2.setScale('c');
		temp3.setScale('F');

		temp4.setAll(-108.5, 'f');
		temp5.setAll(196.4, 'z');//treated as Celsius, as stated in assignment

		System.out.println("\nTemp1 = 0.0C, Temp2 = -40.0C, Temp3 = 212.0F, Temp4 = -108.5F, Temp5 = 196.4C");
		System.out.println( "Temp #1: " + temp1.toString() );	//just to show explicit call works the same
		System.out.println( "Temp #2: " + temp2.toString() );
		System.out.println( "Temp #3: " + temp3.toString() );
		System.out.println( "Temp #4: " + temp4.toString() );
		System.out.println( "Temp #5: " + temp5.toString() );

		System.out.println("\nGetting all the temperatures using same scale:");
		System.out.println("Should be exact same values as above");
		System.out.println( "Temp #1 same: " + temp1.getCelsius() + "\u00B0 C" );
		System.out.println( "Temp #2 same: " + temp2.getCelsius() + "\u00B0 C" );
		System.out.println( "Temp #3 same: " + temp3.getFahrenheit() + "\u00B0 F" );
		System.out.println( "Temp #4 same: " + temp4.getFahrenheit() + "\u00B0 F" );
		System.out.println( "Temp #5 same: " + temp5.getCelsius() + "\u00B0 C" );

		System.out.println("\nConverting all the temperatures to their opposite scale:");
		System.out.println("Temp1 = 32.0F, Temp2 = -40.0F, Temp3 = 100.0C,\n"
					+ "\tTemp4 = -78.05555555555556C, Temp5 = 385.52000000000004F");
		System.out.println( "Temp #1 converted: " + temp1.getFahrenheit() + "\u00B0 F" );
		System.out.println( "Temp #2 converted: " + temp2.getFahrenheit() + "\u00B0 F" );
		System.out.println( "Temp #3 converted: " + temp3.getCelsius() + "\u00B0 C" );
		System.out.println( "Temp #4 converted: " + temp4.getCelsius() + "\u00B0 C" );
		System.out.println( "Temp #5 converted: " + temp5.getFahrenheit() + "\u00B0 F" );
	}

}
