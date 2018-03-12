package practice01;

import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String retry;
            int num = (int) (Math.random() * 100) + 1;
            int inputNum;

            System.out.println("================\n[숫자맞추기게임 시작]\n================");
            
            while (true) {

                System.out.print(">>");
                inputNum = sc.nextInt();
                if (inputNum == num ) {
                	System.out.println("맞았습니다.");
                	break;
                } else if (inputNum > num) {
                	System.out.println("더 낮게");
                } else {
                	System.out.println("더 높게");
                }
            }
            sc.nextLine();
            System.out.print("게임을 종료하시겠습니까?(y/n) >>");
            retry = sc.next();
            if ("y".equals(retry)) {
            break;
            }
        }

        sc.close();

    }

}
