import java.util.Scanner;
public class ArmstrongNumbersUptoN{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter N : ");
			int n;
			while(true){
				n = getValidInput(sc);
			}
			System.out.println("\nArmstrong Numbers Upto : "+n);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			int i=1;
			while(i <= n){
				if(isArmstrong(i)){
					System.out.print(i+",");
				}
				i++;
			}
		}
	}
	public static int getValidInput(Scanner sc){
		while(true){
			try{
				return sc.nextInt();
			}catch(InputMismatchException ime){
			    System.out.print("\nInvalid Input!Please enter valid integer as input : ");
			    sc.next();
			}
		}
	}
	public static boolean isArmstrong(int num){
		int sum = 0;
		
	}
}