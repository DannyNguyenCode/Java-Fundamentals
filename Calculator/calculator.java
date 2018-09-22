package Calculator;
import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double firstNum;
		double secondNum;
		double answer = 0;
		char operator;
		System.out.print("Enter first number: ");
		firstNum = input.nextDouble();
		System.out.print("Select operator: ");
		operator = input.next().charAt(0);
		System.out.print("Enter second Number: ");
		secondNum = input.nextDouble();
		
		switch(operator) {
		case '+':
			answer = firstNum + secondNum;
			break;
		case '-':
			answer = firstNum - secondNum;
			break;
		case '*':
			answer = firstNum * secondNum;
			break;
		case '/':
			answer = firstNum / secondNum;
			break;
		}
		
		System.out.println(firstNum+" "+operator+" " +secondNum+" = " + answer);
	}
}
