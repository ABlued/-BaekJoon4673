package problem2581;

import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		final int max = 10001;
		boolean number[] = new boolean[max];
		boolean checkFirst = true;
		int sum = 0;
		int firstNumber = 0;
		int M = scan.nextInt();
		int N = scan.nextInt();
		for(int i = 0;i<max;i++){
			number[i] = true;
		}
		number[0] = number[1] = false;				//0과 1은 소수가 아니다
		for(int  i =2; i< max;i++)				//2부터 시작해서 특정한 숫자의 배수들은 소수가 아니다
		{
			if(number[i] == false) continue;		//이미 소수가 아닌 걸로 판정된 숫자들은 그냥 지나가고
			for(int j = i+i; j<max; j+=i) {		//판정되지 않았다면 그의 배수들을 소수가 아닌 숫자로 판정한다
				number[j] = false;
			}
		}
		for(int i = M; i <= N; i++) {
			if(number[i] ==  true) {
				sum += i;
				System.out.println(i);
				if(checkFirst == true) {
					firstNumber = i;
					checkFirst = false;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(firstNumber);
		}
	}
}
