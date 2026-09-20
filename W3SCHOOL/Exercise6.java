import java.util.Scanner;
public class Exercise6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			System.out.print("Input first number: ");
			int number1 = input.nextInt();

			System.out.print("Input second number: ");
			int number2 = input.nextInt();

			System.out.println(number1 + number2);
			System.out.println(number1 - number2);
			System.out.println(number1 * number2);
			System.out.println(number1 / number2);
			System.out.println(number1 % number2);
	}
}