import java.util.Scanner;

public class TempConvert {

	public static void main (String[] args) {
		double fahrenheit;
		double celsius;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temp: ");
		fahrenheit = Double.parseDouble(input.nextLine());
		celsius = (5.0/9.0)*(fahrenheit-32);
		System.out.println(celsius);
	}

}
