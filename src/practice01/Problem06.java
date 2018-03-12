package practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i;
		int j;
		int sum =0 ;
		j = (num % 2 == 0) ?	2 : 1;	
		for (i = j; i <= num; i += 2) {
			sum += i;
		}
		System.out.println("결과값: " + sum);
		sc.close();
	}
}
