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
	public static int toImproperFrac (int numb1, int numb2, int numb3) {
		return((numb1*numb2)/numb3);
	}
	public static int toMixedNum (int numb1, int numb2, int numb3) {
		return(numb1+(numb2/numb3));
		
	}
	public static int foil (int numb1, int numb2, int numb3, int numb4, int numbn) {
		return (((numb1*numbn)+numb2)*((numb3*numbn)+numb4));
	}	
	public static boolean isDivisibleBy(int numb1, int numb2) {
		if (numb2 == 0) {
			throw new IllegalArgumentException ("divide by 0");
		}
		if (numb1 % numb2 == 0){
			return true;
		}
		else{
		System.out.println(numb1 + "is not divisible by" + numb2);
		return false;
		}
	}
	public static double absValue (double numb) {
		if (numb == -numb) {
			return numb;
		} else {
			return numb;
		}
	}
	public static int max (int numb1, int numb2) {
		if (numb1 > numb2) {
			return numb1;
		} else {
			return numb1;
		}
	}
	public static double max1 (double numb1, double numb2, double numb3) {
			if (numb1 > numb3 && numb1 > numb3) {
				return numb1;
				}
			else if (numb2 > numb3 && numb2 > numb1) {
				return numb2;
				}
			else {
				return numb3;
			}	
		}	
	public static int min (int numb1, int numb2) {
		if (numb1 < numb2) {
			return numb1 ;
		} else {
			return numb2 ;
		}
	}
	public static double round2 (double numb1){
		numb1 = numb1 + .005;
		double roundNumb = (int)numb1 * 100;
		return (roundNumb/100);
	}
	public static double exponent (double numb1, int numb2) {
		double returnNumb = 0;
		double calcNumb = numb1;
		for (int numb = 1; numb < numb2; numb++) {
			returnNumb = calcNumb * numb1;
			calcNumb = returnNumb;
		}
		System.out.println(returnNumb);
		return (returnNumb);
	}
	public static int factorial (int numb) {
		if (numb < 0) {
			throw new IllegalArgumentException ("-numb");
		}
		int product = 1;
		for (int i = 2; i <= numb; i++) {
			product = product * i;
		}
		return product;
	}
	public static boolean isPrime (int a) {
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}else {
				return true;
			}
		}
	public static int gcf (int x, int y) {
		for(int i=x;i>0;i--) {
			if(x%i==0&&y%i==0) {
				Calculate.isDivisibleBy(x, y);
				return i;
			}
		}
	public static double sqrt (double x) {
		if (x < 0) {
			throw new IllegalArgumentException ("-x");
		}
		double t;
		double squareRoot = x/ 2;
		do {
			t = squareRoot;
			squareRoot = (t + (x / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}
	public static int quadForm (int x) {
		
	