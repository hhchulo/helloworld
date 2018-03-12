package practice02;

import java.util.Scanner;

public class Problem02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] dataArray = new int[5];
        int num;
        double sum=0;
        
         for (int i = 0; i < dataArray.length; i++) {
            num = sc.nextInt();
            
            dataArray[i] = num;
        }
        
         for (int n:dataArray) {
        	sum += n;
        	  
        }
         
        System.out.println("평균은 " + sum/5 +"입니다.");	
       
        sc.close();
    }
}
