package problem4673;

public class Main {
	public static void main(String[] args) {
		boolean[] resultMap = new boolean[10001];

		for(int i = 1; i < 10000; i++) {
			int n = d(i);
			if(n <= 10000) {
				resultMap[n] = true;				
			}
		}
		for(int i = 1; i < 10000; i++) {
			if(resultMap[i] == false ) {
				System.out.println(i);
			}
		}
	}

	static int d(int n) {
		int sum = n;
		while(n != 0){
			sum = sum + (n % 10);// 자릿수를 더해준다
			n = n/10;	//자릿수를 한번 낮춘다
		}
		return sum;
	}
}

