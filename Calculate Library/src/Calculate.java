/**
 * 
 */

/**
 * @author APCS2
 *
 */
public class Calculate {
	public static int square (int number) {
		int answer;
		answer=number*number;
		return(answer);
	}

	public static int cube (int number) {
		int answer ;
		answer=number*number*number ;
		return(answer);
	}
	
	public static double average (double number1, double number2) {
		double answer;
		answer=(number1+number2)/2 ;
		return(answer);
	}
	
	public static double average (double number1, double number2, double number3) {
		double answer;
		answer=(number1+number2+number3)/3.0 ;
		return(answer);	
	}
	
	public static double toDegree (double numb) {
		return((numb*3.14159)/180);
	}
	
	public static double toRaidians (double numb) {
		return((numb*3.14159)*180);
	}
	
	public static double discriminant (double numb1, double numb2, double numb3) {
		return((numb2*numb2)-(4*numb1*numb2));
	}
	
	public static 
