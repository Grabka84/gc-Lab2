package gc_lab2;
import java.text.DecimalFormat; // import decimal formatter
import java.util.Scanner; //import scanner package

public class gc_lab2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // initialize scanner variable input to variable input
		double width; // declare double variable that can accept decimal places
		double length;
		double height;
		char cont = 'y';
		int i = 0; // to count how many times while loop loops, starting from 0
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		while(cont == 'y' || cont == 'Y') { // while user input for char variable cont is y or Y then continue program
		i += 1; // while loop has run i many times
		
		System.out.println("When entering values, please input as a decimal. (For example, 42'6\" would be 42.5)");
		System.out.println("(For converting inches to decimal place, take inches / 12 * 10)");
		System.out.println();
		System.out.println("Please enter width of room " + i);
		width = input.nextDouble(); // grab console input and assign to variable
		System.out.println("Please enter length of room " + i);
		length = input.nextDouble();
		System.out.println("Please enter height of room " + i);
		height = input.nextDouble();
		
		System.out.println(); // blank line for spacing
		
		double area = length * width; 
		double perim = 2 * (length + width);
		double vol = (length * width * height);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("The area of room " + i + " is " + df.format(area)); 
		System.out.println("The perimeter of the room " + i + " is " + df.format(perim));
		System.out.println("The volume of the room " + i + " is " + df.format(vol));
		
		System.out.println();
		
		System.out.println("Would you like to continue the program? (y/n)");
		String contString; // declare string variable that will take user input, so they can type Yes or yes instead of just Y or y
		contString = input.next(); // take user input and store to contString
		cont = contString.charAt(0); // convert first letter of string to character, assign to variable cont so we can compare in the while loop
		}
		input.close(); // close scanner variable input
	}

}
