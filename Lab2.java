import java.util.Scanner;

public class RoomSize {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		int cont1 = 1;
		
		Scanner scr = new Scanner(System.in);
		do {
		
		System.out.print("Enter Length: ");
		double length = scr.nextDouble();
		System.out.print("Enter Width: ");
		double width = scr.nextDouble();
		double area = length * width;
		double perimeter = length + width;
		System.out.println("Area: "+ area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Type in the height of the room");
		double height = scr.nextDouble();
		
		System.out.println("Volume: "+ height * width * length);
		System.out.print("Have more rooms type? \"y\" to continue or \"n\" to stop: ");
		String cont = scr.next();
		
		if ("y".contentEquals(cont))
		{
			cont1++; 
		}
		if ("n".contentEquals(cont)) {
			cont1 -= cont1;
		}
		
		
		
		}
		while (cont1 > 1);
		scr.close();
	}
	
}
