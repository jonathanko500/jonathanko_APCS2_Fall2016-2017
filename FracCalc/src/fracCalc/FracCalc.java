package fracCalc;
import java.util.*;
public class FracCalc {
    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("Enter expression or say quit.");
    	String input = userInput.next();
    		while (input != "quit") {
    		}
    	System.out.println(produceAnswer(input));
    	}		


    // TODO: Read the input from the user and call produceAnswer with an equation


    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String[] produceAnswer(String input)
    { 
    	String[] cutInput = input.split(" ");
    	int[] firstFrac = parseInput(cutInput[0]);	//separates individual values for processing before calculation
    	int[] secondFrac = parseInput(cutInput[2]);
    	int[] firstImproper =toImproperFrac(firstFrac);
    	int[] secondImproper=toImproperFrac(secondFrac);
    	if (cutInput[1] == ("+")) {
    		addFrac(firstImproper,secondImproper);
    	} else if (cutInput[1] == ("-")) {
    		subFrac(firstImproper,secondImproper);
    	} else if (cutInput[1] == ("*")) {
    		multiFrac(firstImproper,secondImproper);
    	} else if (cutInput[1] == ("/")) {
    		diviFrac(firstImproper,secondImproper);
    	}
    	
        // TODO: Implement this function to produce the solution to the input
        cutInput.toString();
        return cutInput;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
   public static int[] parseInput (String input) {//changes fraction to whole, numerator, and denominator 
	   	String[] fractions = input.split("/");
	   	String[] wholeNumb = input.split("_");
	   	int[] stringFractoArrayfrac = new int [3];
	   	stringFractoArrayfrac[0]=Integer.parseInt(wholeNumb[0]);
	   	stringFractoArrayfrac[1]=Integer.parseInt(fractions[0]);
	   	stringFractoArrayfrac[2]=Integer.parseInt(fractions[1]);
	   	return stringFractoArrayfrac;

    }
   public static int [] toMixedNumb(int[] fraction) {//converts improper frac to mixed frac  
	   for (int i=0; i<3;i++) {
		   fraction [0] = fraction[1]/fraction[2];//whole number
		   fraction [1] = fraction[1]%fraction[2];//numerator
		   fraction [2] = fraction[2];//denominator
	   }
	   
	   return fraction;
   }
   public static int [] toImproperFrac(int[] fraction) {//converts mixed num to improper frac
	   for (int i = 0; i<3;i++){
		   fraction [i] = fraction[0]*fraction[2];//whole number
		   fraction[i+1] = fraction[0]+fraction[1];//numerator
		   fraction[i+2] = fraction[2];//denominator
	   }
	   fraction[0]=0;
	   return fraction;
   }
   public static int [] subFrac(int []firstImproper, int []secondImproper) {//subtract fractions
	   int [] subtracted = new int [3];
	   for (int i=0;i<3;i++) {
		  if (firstImproper[2] == -firstImproper[2]|| secondImproper[2] ==-secondImproper[2]) {
			  addFrac(firstImproper, secondImproper);
		  }
		  else if (firstImproper[2] == firstImproper[2] || secondImproper[2] ==secondImproper[2]) {
			  subtracted[i]=firstImproper[0]-secondImproper[0];
			  subtracted[i+1]=firstImproper[1]-secondImproper[1];
			  subtracted[i+2]=firstImproper[2]-secondImproper[2];
			  }
		  }
	   return subtracted;
   }
   public static int [] addFrac(int []firstImproper, int []secondImproper) {//add fractions
	   int[] added = new int[3];
	   for (int i=0;i<3;i++) {
		   if (firstImproper[2] == -firstImproper[2] || secondImproper[2] ==-secondImproper[2]) {
			   added[i]=firstImproper[0]+secondImproper[0];
			   added[i+1]=firstImproper[1]+secondImproper[1];
			   added[i+2]=firstImproper[2]+secondImproper[2];
		   } else if (firstImproper[2] == firstImproper[2] || secondImproper[2] == secondImproper[2]){
			   added[i]=firstImproper[0]+secondImproper[0];
			   added[i+1]=firstImproper[1]+secondImproper[1];
			   added[i+2]=firstImproper[2]+secondImproper[2];
		   }
		   
	   }
	return added;
	  
   }
   public static int gcf(int x,int y) {
	   int z = 1;
	   int gcf = z;
		   if (x==-x || y ==-y){
			   gcf = x*y;
		   } else if (x!=-x || y !=-y){
			   gcf = x*y;
		   }
		   gcf = z;
		   return gcf;
	   }
   public static int [] multiFrac (int []firstImproper, int[]secondImproper) {//multiply fractions
	   int [] multiplied = new int [3];
	   for (int i=0;i<3;i++) {
		   multiplied [i] = firstImproper[0]*secondImproper[0];
		   multiplied [i+1] = firstImproper[1]*secondImproper[1];
		   multiplied [i+2] = firstImproper[2]*secondImproper[2];
	   }
	   return multiplied;
   }
   public static int [] diviFrac (int []firstImproper, int []secondImproper) {//divides fractions
	   int [] divided = new int [3];
	   for (int i=0;i<3;i++) {
		   divided[0]=firstImproper[0]*secondImproper[3];
		   divided[1]=firstImproper[1]*secondImproper[5];
		   divided[2]=firstImproper[2]*secondImproper[4];
	   }
	   return divided;
   }
   public static int reducedFrac(int [] fraction){//reduce fraction
	   int  reduced =gcf(fraction [1],fraction[2]);
	   fraction [1]=fraction [1]/reduced;
	   fraction [2]=fraction [2]/reduced;
	   return reduced;
   }
}
