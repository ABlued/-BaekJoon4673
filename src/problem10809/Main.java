package problem10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean check = false;
		String S = scan.nextLine();
		
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == i+97) {
					System.out.print(j + " ");
					check =  true;
					break;
				}
			}
			if(check == false) {
				System.out.print(-1 + " ");
			}
			else {
				check = false;
			}
		}
	}
}
