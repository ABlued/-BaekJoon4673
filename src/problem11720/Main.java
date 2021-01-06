package problem11720;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String input  = scan.nextLine();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += (input.charAt(i)- 48);
		}
		System.out.println(sum);
	}
}
