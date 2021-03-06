package problem10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> input  = new ArrayList<Integer>();
		
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			input.add(H);
			input.add(N);
		}
		
		for(int i = 0; i < input.size();) {
			int H = input.get(i++);
			int N = input.get(i++);
			int Y = 0, X = 1;
			for(int j = 0; j < N; j++) {
				Y++;
				if(H < Y) {
					Y = 1;
					X++;
				}
			}
			System.out.println(Y * 100 + X);
		}

	}
}
