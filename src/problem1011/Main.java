/* https://st-lab.tistory.com/79 을 참고했다*/
package problem1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ary = new ArrayList<Integer>();
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i< T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			ary.add(y - x);
		}
		for(Integer element : ary) {
			System.out.println(checkCase(element));
		}
		
	}
	
	static int checkCase(int distance) {
		int max = (int)Math.sqrt(distance);
		 
		if(max == Math.sqrt(distance)) {
			return 2 * max - 1;
		}
		else if(distance <= max * max + max) {
			return 2 * max;
		}
		else {
			return 2 * max + 1;
		}
	}
}
