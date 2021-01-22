package problem11653;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                sb.append(i).append("\n");
                n/=i;
            }
        }
        
        if(n != 1) {
            sb.append(n);
        }
        
        System.out.println(sb);
    }
}
//문제링크 : https://www.acmicpc.net/problem/11653
//내가 푼 것

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//
//public class Main {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int max = Integer.parseInt(br.readLine());
//		boolean number[] = new boolean[max + 1];
//
//		for(int i = 0;i<max + 1;i++){
//			number[i] = true;
//		}
//		number[0] = number[1] = false;				//0과 1은 소수가 아니다
//		for(int  i =2; i< max + 1;i++)				//2부터 시작해서 특정한 숫자의 배수들은 소수가 아니다
//		{
//			if(number[i] == false) continue;		//이미 소수가 아닌 걸로 판정된 숫자들은 그냥 지나가고
//			for(int j = i+i; j<max + 1; j+=i) {		//판정되지 않았다면 그의 배수들을 소수가 아닌 숫자로 판정한다
//				number[j] = false;
//			}
//		}
//
//		for(int i = 2; i < number.length; i++) {
//			if(max == 1) break;					
//			if(number[i] == true) {
//				while(max % i == 0) {
//					max /= i;
//					System.out.println(i);
//				}
//			}
//		}
//		br.close();
//	}
//}
