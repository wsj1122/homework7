package homework7;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_16 {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while (number1 + number2 != answer) {
			while (list.contains(answer)) {
				System.out.println("You already entered " + answer);
				break;
			}
			System.out.print("Wrong answer.try again. What is " + number1 + " + " + number2 + "? ");
			list.add(answer);
			answer = input.nextInt();
		}
		System.out.println("You got it!");
	}
}
