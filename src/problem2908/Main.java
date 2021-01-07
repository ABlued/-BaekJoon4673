package problem2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int parsedA = (((A%10)*100) + (((A-((A/100)*100))/10)*10)+ (A/100));
		int parsedB = (((B%10)*100) + (((B-((B/100)*100))/10)*10)+ (B/100));
		
		if(parsedA > parsedB) System.out.println(parsedA);
		else System.out.println(parsedB);
	}
}
