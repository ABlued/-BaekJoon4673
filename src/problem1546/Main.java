package problem1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ary[] = new int[N];
		double sum = 0, max = 0;
		for(int i = 0; i < N; i++) {
			ary[i] = Integer.parseInt(st.nextToken());
			if(max < ary[i])
				max = ary[i];
		}
		for(int element : ary) {
			sum += ((element/max)*100);
		}
		System.out.println(sum/N);
		
	}
}
