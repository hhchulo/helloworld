package practice01;

import java.util.Scanner;

public class Problem05 {

    public static void main(String[] args) {

        int i = 0;
        System.out.println("숫자를 입력하세요");
        Scanner sc = new Scanner(System.in);
       
        
        for (int j = 1; j < 5; j++) {
        	System.out.print("숫자: ");
            int num = sc.nextInt(); 
            if (num > i) {
            	j= i;
        	}
            System.out.println("최대값은 " + j + "입니다.");
        }   
        	 sc.close();
    }
}
