import java.util.Scanner;

public class DayInGerman {
	
	public static void main (String Args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesi cio broj");
		
		String input1 = scanner.next();
		
		int input = Integer.parseInt(input1);
		String dayInGerman = "";
		switch (input) {
		case 1:
			dayInGerman = "Montag";
			break;
		case 2: 
			dayInGerman = "Dienstag";
			break;
		case 3:
			dayInGerman = "Mitwoch";
			break;
		case 4:
			dayInGerman = "Donnerstag";
			break;
		case 5:
			dayInGerman = "Freitag";
			break;
		case 6:
			dayInGerman = "Samstag";
			break;
		default:
			dayInGerman = "Sonntag";
	}
		
			System.out.println(dayInGerman);
	}

}
