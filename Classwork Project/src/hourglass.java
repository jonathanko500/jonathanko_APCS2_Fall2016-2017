public class hourglass {
	public static void main(String[] args) {
		printBase(); //Print the firstline
		topHalf(); //Print the top half
		bottomHalf();//Print the Bottom half
		
	}
	public static void printBase() {
		System.out.print("|");
		for (int i = 1; i<=10;i++){
			System.out.print("\"");
		}
			System.out.println("|");
	}		
	public static void topHalf() {
		for (int i=1; i<=4; i++){//print each line
			//print spaces
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j=5-i; j>0; j--) { 
				System.out.print("::");
			}
		System.out.println("/");
		}
		System.out.println("     ||");
	}
	public static void bottomHalf(){
		for (int i=4; i<=4; i--){
			for (int j=1; j<=i; j++){
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int j=5-i; j>0; j++) { 
				System.out.print("::");
			}
		System.out.println("/");
		}
		
	}
}