public class Calculate {
	public static int square (int x) {//same number multiplied twice
		return(x * x);
	}
	public static int cube (int x) {//same number multiplied three times
		return(x*x*x);
	}
	public static double average (double x, double y) {
		return((x+y)/2);
	}	
	public static double average (double x, double y, double z) { //overloaded average
		return((x+y+z)/3.0);
	}	
	public static double toDegrees (double x) {//radian to degrees
		return((x*3.14159)*(180/3.14159));
	}	
	public static double toRadians  (double x) {// degree to radian
		return(x * (3.14159/180));
	}
	public static double discriminant (double a, double b, double c) { //formula comes from quadratic formula
		return((b*b)-(4*a*c));
	}
	public static String toImproperFrac (int x,int y, int z) { //mixed number to improper frac
		y = (x*z) + y;	
		return(y +"/" +z);
	}
	public static String toMixedNum (int x, int y, int z) {//improper frac to mixed number
		x=y/z; 
		y=y%z;
		return(x + " " + y +"/" +z);
		
	}
	public static String foil (int x, int y, int z, int w, String n) {//First Outside Inside Last
		int a = (x*z);
		int b = ((x*w)) + ((y*z));
		int c = (y*w);
		return(a + "n^2"+"+" + b + "n" + c);
	}
	public static boolean isDivisibleBy(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException ("divide by 0");
		}
		if (x % y == 0){
			return true;
		}
		else{
		System.out.println(x + "is not divisible by" + y);
		return false;
		}
	}
	public static double absValue (double x) {
		if (x == -x) {
			return x;
		} else {
			return x;
		}
	}
	public static int max (int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	public static double max2 (double x, double y, double z) { //overloaded max
			if (x > y && y > z) {
				return x;
				}
			else if (y > z && y > x) {
				return y;
				}
			else {
				return z;
			}	
		}	
	public static int min (int x, int y) {
		if (x < y) {
			return x ;
		} else {
			return y ;
		}
	}
	public static double round2 (double x){
		x = x + .005;
		double roundNumb = (int)x * 100;
		return (roundNumb/100);
	}
	public static double exponent (double x, int y) {
		double returnNumber = 0;
		double calcNumber = x;
		for (int number = 1; number < y;number++) {
			returnNumber = calcNumber * x;
			calcNumber = returnNumber;
		}
		return (returnNumber);
	}
	public static int factorial (int x) {
		if (x < 0) {
			throw new IllegalArgumentException ("-x");
		}
		int product = 1;
		for (int i = 2; i <= x; i++) {
			product = product * i;
		}
		return product;
	}
	public static boolean isPrime (int a) {
		for(int i=2;i<a;) {
			if(a%i==0) {
				return false;
			}else {
				return true;
			}
		} return true;
	}
	public static int gcf (int x, int y) {
		for(int i=x;i>0;i--) {
			if(x%i==0&&y%i==0) {
				Calculate.isDivisibleBy(x, y);
				return i;
			}
		} return x;
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
	public static String quadForm (int x, int y, int z) {//((b*b) =or- sqrt(discriminant))/2a
		
		return ("");
	}
}