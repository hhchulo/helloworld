package practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int sum = 0 ;
		boolean run = true;
		
		while (run) {
			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			
			int no = sc.nextInt();
			
			switch(no){
			
				case 1: 
					System.out.print("예금액>");
					sum += sc.nextInt();
					break;
				
				case 2: 
					System.out.print("출금액>");
					sum -= sc.nextInt(); 
					break;
					
				case 3: 
					System.out.print("잔고액>");
					System.out.print(sum);
					break;
				
				case 4:
					run = false;
					break;
					
				default : 
					System.out.println("다시입력해주세요");
					break;
					
			}
			
		}
		
		System.out.print("프로그램 종료");
		sc.close();
	}

}
