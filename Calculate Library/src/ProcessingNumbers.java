import java.util. *
public class ProcessingNumbers {
	public static void main (String [] args) {
		Scanner userInput = new Scanner(System.in);
		int evenSum = 0;
		int largestEven = 0;
		int min = userInput.nextInt();
		int max = min;
		int inputNum;
		System.out.println("Enter 2 integers");
		for (int i = 0; i < 2; i++){
			inputNum=userInput.nextInt();
			if (inputNum % 2 == 0) {
				evenSum += inputNum;
			} else if (inputNum % 2 == 0 && inputNum > largestEven ) {
				largestEven = inputNum;
			} else if (inputNum > max) {
				max = inputNum;
			} else if (inputNum < min) {
				min = inputNum;
			}
			System.out.println(evenSum);
			}
			}
		}
