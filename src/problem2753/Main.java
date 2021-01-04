package problem2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		
		System.out.println(checkLeapYear(year));
	}
	
	static int checkLeapYear(int year) {
		if(year % 4 == 0) {
			if(year % 100 != 0) {
				return 1;
			}
			else {
				if(year % 400 != 0) return 0;
				else return 1;
			}
		}
		return 0;
	}
}
